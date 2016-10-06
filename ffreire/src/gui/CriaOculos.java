package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Calca;
import beans.Funcionario;
import beans.Oculos;
import beans.TipoOculos;
import fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriaOculos extends JFrame {

	private JPanel contentPane;
	private JTextField txtGenero;
	private JTextField txtPreco;
	private JTextField txtCor;
	private JTextField txtDescricao;
	private IFachada fachada;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriaOculos frame = new CriaOculos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public CriaOculos(IFachada fachada,TipoOculos tipo,int opVolta,Funcionario func) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setBounds(10, 33, 85, 35);
		panel.add(lblGenero);
		
		txtGenero = new JTextField();
		txtGenero.setColumns(10);
		txtGenero.setBounds(164, 42, 134, 26);
		panel.add(txtGenero);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(164, 103, 134, 26);
		panel.add(txtPreco);
		
		JLabel label_1 = new JLabel("pre\u00E7o");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(10, 94, 85, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("cor");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(10, 172, 85, 35);
		panel.add(label_2);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(164, 181, 134, 26);
		panel.add(txtCor);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(164, 254, 134, 26);
		panel.add(txtDescricao);
		
		JLabel label_3 = new JLabel("Descri\u00E7\u00E3o");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(10, 245, 85, 35);
		panel.add(label_3);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //ADICIONA OCULOS E VOLTA A PAGINA ANTERIOR
				
				
				try{			
					String genero = txtGenero.getText();
					double preco = Double.parseDouble(txtPreco.getText());
					String cor = txtCor.getText();
					String descricao = txtDescricao.getText();
					
					Oculos oculos = new Oculos(genero,tipo,cor, descricao,preco);		
					
						fachada.cadastrarOculos(oculos);
						JOptionPane.showMessageDialog(null, "Cadastro Realizado com susseso");
						dispose();
						AdcOculos oc = new AdcOculos(fachada,opVolta,func);
						oc.setVisible(true);
				}catch(NumberFormatException erro){
						 JOptionPane.showMessageDialog(null, "Campo preenchido errado!");
				}	
												
				}
				
				
			
		});
		btnAdicionar.setBounds(10, 368, 106, 31);
		panel.add(btnAdicionar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcOculos ap = new AdcOculos(fachada,opVolta,func);							
				ap.setVisible(true);
			}
		});
		btnVoltar.setBounds(186, 369, 106, 29);
		panel.add(btnVoltar);
	}
}
