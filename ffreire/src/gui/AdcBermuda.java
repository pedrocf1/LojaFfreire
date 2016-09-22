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

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdcBermuda extends JFrame {

	private JPanel contentPane;
	private IFachada fachada;
	private TipoBermuda tipo;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdcBermuda frame = new AdcBermuda(Fachada.getInstance);
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
	public AdcBermuda(IFachada fachada, int opVolta,Funcionario func) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton bntEsporteFino = new JButton("Esporte Fino");
		bntEsporteFino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaBermuda berm = new CriaBermuda(fachada,tipo.ESPORTEFINO,opVolta,func);
				berm.setVisible(true);
			}
		});
		bntEsporteFino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bntEsporteFino.setBounds(85, 390, 132, 23);
		panel.add(bntEsporteFino);
		
		JButton bntCargo = new JButton("Cargo");
		bntCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaBermuda berm = new CriaBermuda(fachada,tipo.CARGO,opVolta,func);
				berm.setVisible(true);
			}
		});
		bntCargo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bntCargo.setBounds(81, 319, 136, 23);
		panel.add(bntCargo);
		
		JButton bntMoleton = new JButton("Moleton");
		bntMoleton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaBermuda berm = new CriaBermuda(fachada,tipo.BERMUDAMOLETON,opVolta,func);
				berm.setVisible(true);
			}
		});
		bntMoleton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bntMoleton.setBounds(85, 247, 132, 23);
		panel.add(bntMoleton);
		
		JButton bntNylon = new JButton("Nylon");
		bntNylon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaBermuda berm = new CriaBermuda(fachada,tipo.NYLON,opVolta,func);
				berm.setVisible(true);
			}
		});
		bntNylon.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bntNylon.setBounds(87, 179, 130, 23);
		panel.add(bntNylon);
		
		JButton bntJeans = new JButton("Jeans");
		bntJeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaBermuda berm = new CriaBermuda(fachada,tipo.JEANS,opVolta,func);
				berm.setVisible(true);
			}
		});
		bntJeans.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bntJeans.setBounds(82, 119, 135, 23);
		panel.add(bntJeans);
		
		JLabel lblTipoDeBermuda = new JLabel("tipo de bermuda");
		lblTipoDeBermuda.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeBermuda.setBounds(25, 37, 117, 42);
		panel.add(lblTipoDeBermuda);
		
		JLabel label_1 = new JLabel("Quantidade");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(200, 37, 89, 42);
		panel.add(label_1);
		
		JButton bntVoltar = new JButton("voltar");
		bntVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcProduto ap = new AdcProduto(fachada,opVolta,func);
				ap.setVisible(true);
				
			}
		});
		bntVoltar.setBounds(100, 493, 105, 34);
		panel.add(bntVoltar);
	}
}
