package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Funcionario;
import fachada.IFachada;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdm extends JFrame {

	private JPanel contentPane;
	private IFachada fachada;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdm frame = new LoginAdm();
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
	public LoginAdm(IFachada fachada) {
		setTitle("Login Adm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSelecioneOqueDeseja = new JLabel("Oque deseja fazer");
		lblSelecioneOqueDeseja.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelecioneOqueDeseja.setBounds(182, 11, 141, 33);
		panel.add(lblSelecioneOqueDeseja);
		
		JButton btnCadastrarProdutos = new JButton("Cadastrar produtos");
		btnCadastrarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Funcionario func = null;
				/*AdcProduto produto = new AdcProduto(fachada,1,func);
				produto.setVisible(true);*/
				RegistroUnificado ru = new RegistroUnificado(fachada);
				ru.setVisible(true);
			}
		});
		btnCadastrarProdutos.setBounds(182, 164, 141, 33);
		panel.add(btnCadastrarProdutos);
		
		JButton btnNewButton = new JButton("Cadastrar funcionario");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				CadastroFuncionario cadastro = new CadastroFuncionario(fachada);
				cadastro.setVisible(true);
			}
		});
		btnNewButton.setBounds(182, 235, 141, 33);
		panel.add(btnNewButton);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Funcionario func = null;
				Vendas venda = new Vendas(fachada,1,func);
				venda.setVisible(true);
			}
		});
		btnVender.setBounds(182, 103, 141, 33);
		panel.add(btnVender);
	}

}
