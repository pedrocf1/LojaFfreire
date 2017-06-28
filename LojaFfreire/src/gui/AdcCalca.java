package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Funcionario;
import beans.TipoCalca;
import fachada.IFachada;

import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdcCalca extends JFrame {

	private JPanel contentPane;
	private IFachada fachada;

	/**
	 * Launch the application.
	 */
	/*(public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdcCalca frame = new AdcCalca();
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
	public AdcCalca(IFachada fachada, int opVolta,Funcionario func) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnBolsoFaca = new JButton("BolsoFaca");
		btnBolsoFaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCalca calca = new CriaCalca(fachada,TipoCalca.BOLSOFACA,opVolta,func);
				calca.setVisible(true);
			}
		});
		btnBolsoFaca.setBounds(92, 218, 108, 23);
		panel.add(btnBolsoFaca);
		
		JButton btnBasica = new JButton("Basica");
		btnBasica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CriaCalca calca = new CriaCalca(fachada,TipoCalca.BASICA,opVolta,func);
				calca.setVisible(true);
			}
		});
		btnBasica.setBounds(92, 143, 108, 23);
		panel.add(btnBasica);
		
		JLabel lblTipoDeCala = new JLabel("tipo de cal\u00E7a");
		lblTipoDeCala.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeCala.setBounds(92, 40, 117, 42);
		panel.add(lblTipoDeCala);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AdcProduto ap = new AdcProduto (fachada,opVolta,func);
				ap.setVisible(true);
			}
		});
		btnVoltar.setBounds(92, 350, 105, 23);
		panel.add(btnVoltar);
	}
}
