package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import beans.Funcionario;
import fachada.Fachada;
import fachada.IFachada;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCpf;
	private JTextField tfTelefone;
	private JTextField tfEmail;
	private JTextField tfLogin;
	private JTextField tfSenha;
	private IFachada fachada;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IFachada fachada = null;
					CadastroFuncionario frame = new CadastroFuncionario(Fachada.getInstance());
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
	public CadastroFuncionario(IFachada fachada) {
			this.fachada = fachada;
		
		setTitle("Cadastro Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(40, 105, 62, 25);
		panel.add(lblNome);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(40, 172, 63, 22);
		panel.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelefone.setBounds(40, 247, 68, 20);
		panel.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(40, 306, 57, 21);
		panel.add(lblEmail);
		
		tfNome = new JTextField();
		tfNome.setBounds(142, 109, 209, 20);
		panel.add(tfNome);
		tfNome.setColumns(10);
		
		tfCpf = new JTextField();
		tfCpf.setBounds(142, 175, 209, 20);
		panel.add(tfCpf);
		tfCpf.setColumns(10);
		
		tfTelefone = new JTextField();
		tfTelefone.setBounds(142, 249, 209, 20);
		panel.add(tfTelefone);
		tfTelefone.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(142, 308, 209, 20);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		                                           
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				boolean confirma = false;
				Funcionario func = new Funcionario(tfNome.getText(),tfCpf.getText(),tfTelefone.getText(),tfEmail.getText(),tfLogin.getText(),tfSenha.getText()); 	
				try{			
				confirma = fachada.verificaLogin(tfLogin.getText());
			}catch(IndexOutOfBoundsException e1){
				
				if(confirma == false){
				 fachada.cadastrarFuncionario(func);
				   JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
				   dispose();
				   LoginAdm adm = new LoginAdm(fachada);
				   adm.setVisible(true);
				}
				}
			
			}
		});
		btnCadastrar.setBounds(40, 530, 108, 27);
		panel.add(btnCadastrar);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setBounds(40, 368, 62, 22);
		panel.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(40, 436, 46, 14);
		panel.add(lblSenha);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(142, 371, 209, 20);
		panel.add(tfLogin);
		tfLogin.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(142, 435, 209, 20);
		panel.add(tfSenha);
		tfSenha.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				LoginAdm adm = new LoginAdm(fachada);				
				adm.setVisible(true);			}
		});
		btnVoltar.setBounds(243, 532, 108, 27);
		panel.add(btnVoltar);
	}
}
