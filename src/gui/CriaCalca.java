package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Bermudas;
import beans.Calca;
import beans.Funcionario;
import beans.TipoBermuda;
import beans.TipoCalca;
import fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriaCalca extends JFrame {

	private JPanel contentPane;
	private JTextField txtTamanho;
	private JTextField txtPreco;
	private JTextField txtCor;
	private JTextField txtDescricao;
	private IFachada fachada;
	private String img;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriaCalca frame = new CriaCalca();
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
	public CriaCalca(IFachada fachada,TipoCalca tipo, int opVolta,Funcionario func) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Tamanho");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(22, 64, 85, 35);
		panel.add(label);
		
		txtTamanho = new JTextField();
		txtTamanho.setColumns(10);
		txtTamanho.setBounds(176, 73, 134, 26);
		panel.add(txtTamanho);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(176, 134, 134, 26);
		panel.add(txtPreco);
		
		JLabel label_1 = new JLabel("pre\u00E7o");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(22, 125, 85, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("cor");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(22, 203, 85, 35);
		panel.add(label_2);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(176, 212, 134, 26);
		panel.add(txtCor);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(176, 285, 134, 26);
		panel.add(txtDescricao);
		
		JLabel label_3 = new JLabel("Descri\u00E7\u00E3o");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(22, 276, 85, 35);
		panel.add(label_3);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//ADICIONA CALCA E VOLTA A PAGINA ANTERIOR
				
				try{			
				int tamanho = Integer.parseInt(txtTamanho.getText());
				double preco = Double.parseDouble(txtPreco.getText());
				String cor = txtCor.getText();
				String descricao = txtDescricao.getText();
				Calca calca = new Calca(tamanho,preco,tipo,cor, descricao);		
				calca.setImg(img);
					fachada.cadastrarCalca(calca);
					//fachada.listar(calca);
					JOptionPane.showMessageDialog(null, "Cadastro Realizado com susseso");
					dispose();
					AdcCalca cal = new AdcCalca(fachada,opVolta,func);
					cal.setVisible(true);
			}catch(NumberFormatException erro){
					 JOptionPane.showMessageDialog(null, "Campo preenchido errado!");
			}	
											
			}
		});
		btnAdicionar.setBounds(22, 426, 106, 31);
		panel.add(btnAdicionar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcCalca calca = new AdcCalca(fachada,opVolta,func);
				calca.setVisible(true);
			}
		});
		btnVoltar.setBounds(198, 427, 106, 29);
		panel.add(btnVoltar);
		
		JButton btnAdicionarImagem = new JButton("Adicionar Imagem");
		btnAdicionarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int escolha = fc.showOpenDialog(fc);
				img = fc.getSelectedFile().getAbsolutePath();
				
			}
		});
		btnAdicionarImagem.setBounds(109, 354, 122, 23);
		panel.add(btnAdicionarImagem);
	}
}
