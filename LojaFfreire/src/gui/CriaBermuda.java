package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Bermudas;
import beans.Funcionario;
import beans.TipoBermuda;
import fachada.Fachada;
import fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriaBermuda extends JFrame {

	private JPanel contentPane;
	private String op;
	private JTextField txtTamanho;
	private JTextField txtPreco;
	private JTextField txtCor;
	private JTextField txtDescricao;
	private IFachada fachada;
	TipoBermuda tipo;
	private String img;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriaBermuda frame = new CriaBermuda(Fachada.getInstance(),TipoBermuda.JEANS);
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
	public CriaBermuda(IFachada fachada,TipoBermuda tipo, int opVolta,Funcionario func) {
		this.fachada = fachada;
		this.op = op;
		this.tipo = tipo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTamanho.setBounds(10, 80, 85, 35);
		panel.add(lblTamanho);
		
		JLabel lblPreo = new JLabel("pre\u00E7o");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPreo.setBounds(10, 141, 85, 35);
		panel.add(lblPreo);
		
		JLabel lblCor = new JLabel("cor");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCor.setBounds(10, 219, 85, 35);
		panel.add(lblCor);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescricao.setBounds(10, 292, 85, 35);
		panel.add(lblDescricao);
		
		txtTamanho = new JTextField();
		txtTamanho.setBounds(164, 89, 134, 26);
		panel.add(txtTamanho);
		txtTamanho.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(164, 150, 134, 26);
		panel.add(txtPreco);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(164, 228, 134, 26);
		panel.add(txtCor);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(164, 301, 134, 26);
		panel.add(txtDescricao);
		
		JButton bntAdicionar = new JButton("Adicionar");
		bntAdicionar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {//ADICIONA BERMUDA E VOLTA A PAGINA ANTERIOR
				try{									
				int tamanho = Integer.parseInt(txtTamanho.getText());
				double preco = Double.parseDouble(txtPreco.getText());
				String cor = txtCor.getText();
				String descricao = txtDescricao.getText();
				
				Bermudas berm = new Bermudas(tamanho,preco,tipo,cor, descricao);		
				berm.setImg(img);
					fachada.cadastrarBermuda(berm);
					JOptionPane.showMessageDialog(null, "Cadastro Realizado com susseso");
					dispose();
					AdcBermuda bermuda = new AdcBermuda(fachada,opVolta,func);
					bermuda.setVisible(true);
			}catch(NumberFormatException erro){
					 JOptionPane.showMessageDialog(null, "Campo preenchido errado!");
				 }	
				
		
			}
		});
		bntAdicionar.setBounds(10, 454, 106, 31);
		panel.add(bntAdicionar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdcBermuda ab = new AdcBermuda(fachada,opVolta,func);
				ab.setVisible(true);
			}
		});
		btnVoltar.setBounds(186, 455, 106, 29);
		panel.add(btnVoltar);
		
		JButton btnAdicionarFoto = new JButton("Adicionar foto");
		btnAdicionarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fc = new JFileChooser();
				int escolha = fc.showOpenDialog(fc);
				img = fc.getSelectedFile().getAbsolutePath();
				
				
			}
		});
		btnAdicionarFoto.setBounds(97, 373, 134, 35);
		panel.add(btnAdicionarFoto);
	}
}
