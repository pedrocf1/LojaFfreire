package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Funcionario;
import fachada.IFachada;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdcProduto extends JFrame {

	private JPanel contentPane;
	private IFachada fachada;
	private int opVolta;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdcProduto frame = new AdcProduto();
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
	public AdcProduto(IFachada fachada,int opVolta,Funcionario funcionario) {
		this.fachada = fachada;
		this.opVolta = opVolta;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Bermudas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcBermuda berm = new AdcBermuda(fachada,opVolta,funcionario);
				berm.setVisible(true);
			}
		});
		btnNewButton.setBounds(111, 132, 112, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cal\u00E7a");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcCalca calca = new AdcCalca(fachada,opVolta,funcionario);
				calca.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(111, 204, 112, 30);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Oculos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcOculos oculos = new AdcOculos(fachada,opVolta,funcionario);
				oculos.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(111, 265, 112, 30);
		panel.add(btnNewButton_2);
		
		JButton btnCamisa = new JButton("Camisa");
		btnCamisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcCamisa camisa = new AdcCamisa(fachada,opVolta,funcionario);
				camisa.setVisible(true);
			}
		});
		btnCamisa.setBounds(111, 324, 112, 30);
		panel.add(btnCamisa);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				if(opVolta == 2){
					LoginFunc func = new LoginFunc(fachada,funcionario);
					func.setVisible(true);
				}else if (opVolta == 1){
					LoginAdm adm = new LoginAdm(fachada);
					adm.setVisible(true);
				}
				
				
			
			}
		});
		btnVoltar.setBounds(111, 389, 112, 30);
		panel.add(btnVoltar);
	}
}
