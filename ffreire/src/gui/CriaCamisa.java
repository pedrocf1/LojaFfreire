package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;

import beans.Bermudas;
import beans.Camisa;
import beans.Funcionario;
import beans.TamanhoCamisa;
import beans.TipoBermuda;
import beans.TipoCamisa;
import fachada.Fachada;
import fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriaCamisa extends JFrame {

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
					CriaCamisa frame = new CriaCamisa();
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
	public CriaCamisa(IFachada fachada,TipoCamisa tipo,int opVolta,Funcionario func) {
		this.fachada = fachada;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox cbTamanhoCamisa = new JComboBox();
		cbTamanhoCamisa.setModel(new DefaultComboBoxModel(TamanhoCamisa.values()));
		cbTamanhoCamisa.setBounds(21, 58, 114, 35);
		panel.add(cbTamanhoCamisa);
		
		JLabel lblTamanhoDaCamisa = new JLabel("Tamanho da camisa");
		lblTamanhoDaCamisa.setBounds(21, 26, 114, 21);
		panel.add(lblTamanhoDaCamisa);
		
		JLabel labelTamanho = new JLabel("Tamanho");
		labelTamanho.setVisible(false);
		labelTamanho.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelTamanho.setBounds(21, 140, 85, 35);
		panel.add(labelTamanho);
		
		txtTamanho = new JTextField();
		txtTamanho.setVisible(false);
		txtTamanho.setColumns(10);
		txtTamanho.setBounds(175, 149, 134, 26);
		panel.add(txtTamanho);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(175, 210, 134, 26);
		panel.add(txtPreco);
		
		if(tipo == TipoCamisa.SOCIAL){
			labelTamanho.setVisible(false);
			txtTamanho.setVisible(false);
		}
		
		JLabel label_1 = new JLabel("pre\u00E7o");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(21, 201, 85, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("cor");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(21, 279, 85, 35);
		panel.add(label_2);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(175, 288, 134, 26);
		panel.add(txtCor);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(175, 361, 134, 26);
		panel.add(txtDescricao);
		
		JLabel label_3 = new JLabel("Descri\u00E7\u00E3o");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(21, 352, 85, 35);
		panel.add(label_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() { //ADICIONA CAMISA E VOLTA A PAGINA ANTERIOR
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					
				TamanhoCamisa tamanho = null;
				int pega = cbTamanhoCamisa.getSelectedIndex();
				if(pega == 0){
					tamanho = TamanhoCamisa.PP;
				}else if(pega == 1){
					tamanho = TamanhoCamisa.P;
				}else if(pega == 2){
					tamanho = TamanhoCamisa.M;
				}else if(pega == 3){
					tamanho = TamanhoCamisa.G;
				}else if(pega == 4){
					tamanho = TamanhoCamisa.GG;
				}
				
				double preco = Double.parseDouble(txtPreco.getText());
				String cor = txtCor.getText();
				String descricao = txtDescricao.getText();
						
				Camisa camisa = new Camisa(tamanho,preco,cor,tipo,descricao);	
				camisa.setImg(img);
				fachada.cadastrarCamisa(camisa);
				JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
				
				dispose();
				AdcCamisa cam = new AdcCamisa(fachada,opVolta,func);
				cam.setVisible(true);
				}catch(NumberFormatException erro){
					 JOptionPane.showMessageDialog(null, "Campo preenchido errado!");
				 }
			}
		});
		btnNewButton.setBounds(10, 481, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdcCamisa camisa = new AdcCamisa(fachada,opVolta,func);
				camisa.setVisible(true);
			}
		});
		btnVoltar.setBounds(196, 481, 113, 23);
		panel.add(btnVoltar);
		
		JButton btnAdicionarImagem = new JButton("Adicionar imagem");
		btnAdicionarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fc = new JFileChooser();
				int escolha = fc.showOpenDialog(fc);
				img = fc.getSelectedFile().getAbsolutePath();
				
			}
		});
		btnAdicionarImagem.setBounds(107, 427, 125, 23);
		panel.add(btnAdicionarImagem);
	}
}
