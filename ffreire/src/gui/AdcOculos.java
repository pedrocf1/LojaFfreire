package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Funcionario;
import beans.TipoOculos;
import fachada.IFachada;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdcOculos extends JFrame {

	private JPanel contentPane;
	private IFachada fachada;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdcOculos frame = new AdcOculos();
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
	public AdcOculos(IFachada fachada,int opVolta,Funcionario func) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTipoDeOculos = new JLabel("tipo de oculos");
		lblTipoDeOculos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeOculos.setBounds(80, 55, 114, 42);
		panel.add(lblTipoDeOculos);
		
		JButton btnPolarizado = new JButton("Polarizado");
		btnPolarizado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				CriaOculos oculos = new CriaOculos(fachada,TipoOculos.POLARIZADO,opVolta,func);
				oculos.setVisible(true);
			}
		});
		btnPolarizado.setBounds(80, 133, 99, 23);
		panel.add(btnPolarizado);
		
		JButton btnProtecaoUv = new JButton("Prote\u00E7\u00E3o Uv");
		btnProtecaoUv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				CriaOculos oculos = new CriaOculos(fachada,TipoOculos.PROTECAOUV,opVolta,func);
				oculos.setVisible(true);
			}
		});
		btnProtecaoUv.setBounds(80, 189, 99, 23);
		panel.add(btnProtecaoUv);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdcProduto ap = new AdcProduto(fachada,opVolta,func);
				ap.setVisible(true);
			}
		});
		btnNewButton.setBounds(80, 297, 99, 23);
		panel.add(btnNewButton);
	}
}
