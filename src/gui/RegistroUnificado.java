package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Bermudas;
import beans.TipoBermuda;
import fachada.IFachada;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RegistroUnificado extends JFrame {

	private JComboBox<String> cbRoupa;
	private String[] tipoBermuda = new String[]{"jeans","nylon","moleton","cargo","esporte fino"};
	private JPanel contentPane;
	private JComboBox cbTipo;
	private JComboBox cbTamanho;
	private JTextField txtTamanho;
	private JTextField txtPreco;
	private JTextField txtDescricao;
	private JTextField txtCor;
	private String img;
	private IFachada fachada;
	private	TipoBermuda tipoBerm;
	private JButton btnNewButton;
	private JLabel lblTamanho;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblCor;
	
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUnificado frame = new RegistroUnificado();
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
	public RegistroUnificado(IFachada fachada) {
		super("Registro de roupas");
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		cbRoupa = new JComboBox<String>();
		//cbRoupa.setSelectedIndex(0);



		panel.add(cbRoupa);
		cbRoupa.setModel(new DefaultComboBoxModel(new String[] {"bermuda", "cal\u00E7a", "camisa", "oculos"}));
		/*cbRoupa.addItem("Bermuda");
		cbRoupa.addItem("calça");
		cbRoupa.addItem("camisa");
		cbRoupa.addItem("oculos");*/
		cbRoupa.setBounds(31, 48, 110, 27);
		

		
		cbTamanho = new JComboBox();
		cbTamanho.setBounds(31, 204, 110, 27);
		cbTamanho.setVisible(false);
		panel.add(cbTamanho);
		
		txtTamanho = new JTextField();
		txtTamanho.setBounds(31, 207, 110, 24);
		panel.add(txtTamanho);
		txtTamanho.setVisible(false);
		txtTamanho.setColumns(10);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(31, 287, 110, 27);
		panel.add(txtPreco);
		txtPreco.setVisible(false);
		txtPreco.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(31, 354, 110, 27);
		panel.add(txtDescricao);
		txtDescricao.setVisible(false);
		txtDescricao.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setBounds(31, 428, 110, 27);
		panel.add(txtCor);
		txtCor.setVisible(false);
		txtCor.setColumns(10);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(165, 110, 281, 345);
		panel.add(lblImg);
		
		JButton btnImg = new JButton("imagem");
		btnImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				int escolha = fc.showOpenDialog(fc);
				img = fc.getSelectedFile().getAbsolutePath();
				ImageIcon icon = new ImageIcon(img);
				Image imagem = icon.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_DEFAULT);
				lblImg.setIcon(new ImageIcon(imagem));
			}
		});
		btnImg.setBounds(31, 484, 110, 27);
		panel.add(btnImg);
		

		// Seleciona a roupa, aciona a visibilidade das outras areas e abilita escolha do tipo da roupa
		cbRoupa.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if(cbRoupa.getSelectedIndex() == 0 && e.getStateChange() == ItemEvent.SELECTED){
					cbTipo.setVisible(true);	
					cbTipo.setModel(new DefaultComboBoxModel(new String[] {"jeans","nylon","moleton","cargo","esporte fino"}));
		
					txtTamanho.setVisible(true);
					txtPreco.setVisible(true);
					txtDescricao.setVisible(true);
					txtCor.setVisible(true);


					
				}
			}
		});
		
		cbTipo = new JComboBox();
		cbTipo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				//"jeans","nylon","moleton","cargo","esporte fino"
				if (cbRoupa.getSelectedIndex()==0 && e.getStateChange() == ItemEvent.SELECTED && cbTipo.getSelectedIndex()==3 ) {
					tipoBerm = TipoBermuda.CARGO;
				}
			}
		});
		cbTipo.setBounds(31, 124, 110, 27);
		cbTipo.setVisible(false);
		panel.add(cbTipo);
		
		btnNewButton = new JButton("cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bermudas berm = new Bermudas(Integer.parseInt(txtTamanho.getText()),Double.parseDouble( txtPreco.getText()),tipoBerm,txtCor.getText(),txtDescricao.getText());
				fachada.cadastrarBermuda(berm);
				System.out.println( fachada.buscaCodBerm(2201).getTipo()+" "+fachada.buscaCodBerm(2201).getTamanho());
			}
		});
		btnNewButton.setBounds(31, 539, 101, 23);
		panel.add(btnNewButton);
		
		lblTamanho = new JLabel("Tamanho");
		lblTamanho.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTamanho.setBounds(54, 179, 101, 14);
		panel.add(lblTamanho);
		
		lblNewLabel = new JLabel("Pre\u00E7o");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(54, 262, 46, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_1.setBounds(54, 329, 62, 14);
		panel.add(lblNewLabel_1);
		
		lblCor = new JLabel("Cor");
		lblCor.setBounds(70, 404, 46, 14);
		panel.add(lblCor);
		
	}		
}
