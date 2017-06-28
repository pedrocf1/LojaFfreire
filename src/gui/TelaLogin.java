package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Funcionario;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import repositorio.RepositorioBermudas;
import fachada.*;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;
	private IFachada fachada;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					IFachada fachada = null;
					TelaLogin frame = new TelaLogin(Fachada.getInstance());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
//teste
	/**
	 * Create the frame.
	 */
	public TelaLogin(IFachada fachada) {
		setTitle("Loja Ffreire");
		this.fachada = fachada;
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(92, 83, 46, 14);
		panel.add(lblLogin);
		
		textField = new JTextField();
		textField.setBounds(208, 80, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(92, 125, 46, 14);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 122, 86, 20);
		panel.add(passwordField);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(145, 181, 89, 23);
		panel.add(btnLogar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.CENTER);
		panel1.setLayout(null);
		
		JLabel lblSenha_1 = new JLabel("Senha");
		lblSenha_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha_1.setBounds(47, 100, 53, 31);
		panel1.add(lblSenha_1);
		
		JLabel lblUsuario = new JLabel("usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(47, 58, 61, 31);
		panel1.add(lblUsuario);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfUsuario.setBounds(157, 65, 155, 24);
		panel1.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pfSenha.setBounds(157, 107, 155, 24);
		panel1.add(pfSenha);
							
		JButton btnCadastrar = new JButton("Logar");
		btnCadastrar.addActionListener(new ActionListener() {
			                        
			public void actionPerformed(ActionEvent e) {
				Funcionario aux = null;
				try {
				aux = fachada.logar(tfUsuario.getText(),pfSenha.getText());
				}catch(NullPointerException e1){
					if(aux != null){
						LoginFunc tela = new LoginFunc(fachada,aux);
						tela.setVisible(true);
						
				}else if(tfUsuario.getText().equals("ffreire") && pfSenha.getText().equals("luanaluana")){
					dispose();
					LoginAdm tela = new LoginAdm(fachada);
					tela.setVisible(true);
					
				}else{JOptionPane.showMessageDialog(null, "Login ou senha errados !");}
					
				}// FIM CATCH
				
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(138, 169, 106, 31);
		panel1.add(btnCadastrar);
	}
}
