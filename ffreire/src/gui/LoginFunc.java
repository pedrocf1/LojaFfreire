package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fachada.IFachada;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class LoginFunc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFunc frame = new LoginFunc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public LoginFunc(IFachada fachada) {
		setTitle("Login Func");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVender.setBounds(137, 88, 128, 28);
		panel.add(btnVender);
		
		JButton btnAdcEstoque = new JButton("adc. Estoque");
		btnAdcEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdcEstoque.setBounds(137, 135, 128, 28);
		panel.add(btnAdcEstoque);
		
		JLabel lblSelecioneUmaOpo = new JLabel("Selecione uma op\u00E7\u00E3o");
		lblSelecioneUmaOpo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelecioneUmaOpo.setBounds(128, 25, 169, 28);
		panel.add(lblSelecioneUmaOpo);
	}

}
