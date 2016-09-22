package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Funcionario;
import beans.TipoCamisa;
import fachada.Fachada;
import fachada.IFachada;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdcCamisa extends JFrame {

	private JPanel contentPane;
	private IFachada fachada;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdcCamisa frame = new AdcCamisa(Fachada.getInstance());
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
	// AJUSTAR DESIGN
	public AdcCamisa(IFachada fachada,int opVolta,Funcionario func) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTipoDeCamisa = new JLabel("tipo de camisa");
		lblTipoDeCamisa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeCamisa.setBounds(92, 62, 117, 42);
		panel.add(lblTipoDeCamisa);
		
		JButton bntAdicionar = new JButton("Adicionar");
		bntAdicionar.setBounds(18, 513, 104, 35);
		panel.add(bntAdicionar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdcProduto ap = new AdcProduto(fachada,opVolta,func);
				ap.setVisible(true);
				
			}
		});
		btnVoltar.setBounds(177, 514, 105, 34);
		panel.add(btnVoltar);
		
		JButton btnBasica = new JButton("Basica");
		btnBasica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCamisa camisa = new CriaCamisa(fachada,TipoCamisa.BASICA);
				camisa.setVisible(true);
			}
		});
		btnBasica.setBounds(92, 165, 108, 23);
		panel.add(btnBasica);
		
		JButton btnPolo = new JButton("Polo");
		btnPolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCamisa camisa = new CriaCamisa(fachada,TipoCamisa.POLO);
				camisa.setVisible(true);
			}
		});
		btnPolo.setBounds(92, 214, 108, 23);
		panel.add(btnPolo);
		
		JButton btnRegata = new JButton("Regata");
		btnRegata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCamisa camisa = new CriaCamisa(fachada,TipoCamisa.REGATA);
				camisa.setVisible(true);
			}
		});
		btnRegata.setBounds(92, 267, 108, 23);
		panel.add(btnRegata);
		
		JButton btnSocial = new JButton("Social");
		btnSocial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCamisa camisa = new CriaCamisa(fachada,TipoCamisa.SOCIAL);
				camisa.setVisible(true);
			}
		});
		btnSocial.setBounds(92, 331, 108, 23);
		panel.add(btnSocial);
		
		JButton btnUv = new JButton("UV");
		btnUv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCamisa camisa = new CriaCamisa(fachada,TipoCamisa.UV);
				camisa.setVisible(true);
			}
		});
		btnUv.setBounds(92, 396, 108, 23);
		panel.add(btnUv);
	}
}
