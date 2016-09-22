package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fachada.Fachada;
import fachada.IFachada;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import beans.Bermudas;
import beans.Calca;
import beans.Camisa;
import beans.Oculos;
import beans.TipoBermuda;
import beans.TipoCamisa;

import javax.swing.JScrollPane;

public class Vendas extends JFrame  {

	private JPanel contentPane;
	private IFachada fachada;
	private JTextField txtBuscar;
	private	JComboBox cbEscolha;
	private	JLabel lblDigiteNome;
	private JButton btnProcurar;
	private JTable table;
	private JTextField txtCodigo;
	private ArrayList<Object> vendas;
	private	JButton btnAdcCarrinho;
	private ArrayList<Bermudas> vendaBermuda;
	private ArrayList<Calca> vendaCalca;
	private ArrayList<Camisa> vendaCamisa;
	private ArrayList<Oculos> vendaOculos;
	private JScrollPane scroll;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendas frame = new Vendas(Fachada.getInstance());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vendas(IFachada fachada) {
		this.fachada = fachada;
		this.lblDigiteNome = lblDigiteNome; 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		this.cbEscolha = new JComboBox();
		cbEscolha.setModel(new DefaultComboBoxModel(new String[] {"Cod. Especifico", "Codigo do produto"}));
		cbEscolha.setBounds(28, 110, 140, 27);
		panel.add(cbEscolha);
		
			
		JLabel lblSelecioneOModo = new JLabel("selecione o modo de venda");
		lblSelecioneOModo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSelecioneOModo.setBounds(84, 30, 189, 36);
		panel.add(lblSelecioneOModo);
		
		txtBuscar = new JTextField();
		//txtBuscar.setVisible(false);
		txtBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtBuscar.setBounds(192, 111, 140, 26);
		panel.add(txtBuscar);
		txtBuscar.setColumns(10);
		

		
		txtCodigo = new JTextField();
		txtCodigo.setVisible(false);
		txtCodigo.setBounds(60, 505, 108, 28);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblSelecioneOCodigo = new JLabel("Selecione o codigo do produto para realizar a venda");
		lblSelecioneOCodigo.setVisible(false);
		lblSelecioneOCodigo.setBounds(60, 448, 326, 27);
		panel.add(lblSelecioneOCodigo);
		
		JButton btnConluirVenda = new JButton("Conluir Venda");
											// AÇÃO DELE TA NO FINAL DA PAGINA
		btnConluirVenda.setVisible(false);
		btnConluirVenda.setBounds(228, 563, 120, 36);
		panel.add(btnConluirVenda);
									
		// PROCURA DAS ROUPAS
		btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				if(cbEscolha.getSelectedIndex()==0){
					int cod = Integer.parseInt(txtBuscar.getText());
					
					if(cod>=2201 && cod<3302){
						Bermudas berm;
						berm = fachada.buscaCodBerm(cod); //busca bermuda	
						System.out.println(berm.getDescricao());
						vendaBermuda.add(berm);
					}else if(cod >= 3302 && cod < 4403){
						Calca calca;
						calca = fachada.buscaCodCal(cod); //busca calca
						vendaCalca.add(calca);
					}else if(cod>= 4403 && cod<5503){
						Camisa camisa;
						camisa = fachada.buscaCodCam(cod); //busca camisa
						vendaCamisa.add(camisa);
					}else if(cod>=5503 && cod <6603){
						Oculos oculos;
						oculos = fachada.buscaCodOculos(cod); // busca oculos
						vendaOculos.add(oculos);
					}else{JOptionPane.showMessageDialog(null, "Algo foi preenchido errado");}
					
				}else if(cbEscolha.getSelectedIndex()==1){//PROCURA PRODUTO POR CODIGO
					
					if(txtBuscar.getText().equals("1101")){
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS BERMUDAS						
						table = new JTable();
						scroll = new JScrollPane(table);
						scroll.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Tamanho");
						modelo.addColumn("Preco");
						modelo.addColumn("tipo");
						modelo.addColumn("cor");
						modelo.addColumn("descrição");
						modelo.addColumn("Cod.Produto");
						panel.add(scroll);
						
							//TESTE PRA SE O PROFESSOR PEDIR :D
							Bermudas berm= null;
							Bermudas berm1 = new Bermudas(42,70,TipoBermuda.CARGO,"azul","muito Bonita");
							fachada.cadastrarBermuda(berm1);
							berm = fachada.listar(berm);
							
					modelo.addRow(new Object[]{berm.getTamanho(),berm.getPreco(),berm.getTipo(),berm.getCor(),berm.getDescricao(),berm.getCodigo()});
						
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
						
						
						
						
						
						//Listar  Bermudas /\
					}else if (txtBuscar.getText().equals("1102")){
						
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS CALCA						
						table = new JTable();
						JScrollPane scroll = new JScrollPane(table);
						scroll.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Tamanho");
						modelo.addColumn("Preco");
						modelo.addColumn("tipo");
						modelo.addColumn("cor");
						modelo.addColumn("descrição");
						modelo.addColumn("Cod.Produto");
						panel.add(scroll);
						
							
							Calca calca = null;
							calca = fachada.listar(calca);
							
					modelo.addRow(new Object[]{calca.getTamanho(),calca.getPreco(),calca.getCor(),calca.getDescricao(),calca.getCodigo()});
						
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
						
						
						
						
						//Listar Calca
					}else if(txtBuscar.getText().equals("1103")){
						
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS CAMISA						
						table = new JTable();
						JScrollPane scroll = new JScrollPane(table);
						scroll.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Tamanho");
						modelo.addColumn("Preco");
						modelo.addColumn("cor");
						modelo.addColumn("tipo");
						modelo.addColumn("descrição");
						modelo.addColumn("Cod.Produto");
						panel.add(scroll);
						
							
							Camisa camisa = null;
							camisa = fachada.listar(camisa);
							
					modelo.addRow(new Object[]{camisa.getTamanho(),camisa.getPreco(),camisa.getCorEstampa(),camisa.getTipo(),camisa.getDescricao(),camisa.getCodigo()});
						
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
					
						
						
						//Listar Camisa
					}else if(txtBuscar.getText().equals("1104")){
						
						
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS OCULOS						
						table = new JTable();
						JScrollPane scroll = new JScrollPane(table);
						scroll.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Genero");
						modelo.addColumn("Tipo");
						modelo.addColumn("Cor");
						modelo.addColumn("Descrição");
						modelo.addColumn("Preço");
						modelo.addColumn("Cod.Produto");
						panel.add(scroll);
						
							
							Oculos oculos = null;
							oculos = fachada.listar(oculos);
							
					modelo.addRow(new Object[]{oculos.getGenero(),oculos.getTipo(),oculos.getCor(),oculos.getDescricao(),oculos.getPreco(),oculos.getCodigo()});
						
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
						
						
						
						//Listar Oculos
					}
					
				}//FIM DA PROCURA DE PRODUTO POR CODIGO
				
				}catch(NullPointerException e1){
					JOptionPane.showMessageDialog(null, "Algo foi preenchido errado");
				}catch(IndexOutOfBoundsException e1){
					JOptionPane.showMessageDialog(null, "Algo foi preenchido errado");
				}			
			}
		});// FIM ACTION LISTENER
		btnProcurar.setBounds(60, 563, 120, 36);
		panel.add(btnProcurar);
		
		this.btnAdcCarrinho = new JButton("Adc.Carrinho");
		btnAdcCarrinho.addActionListener(new ActionListener() { // ADICIONAR CARRINHO
			public void actionPerformed(ActionEvent arg0) {
				try{
				int cod = Integer.parseInt(txtCodigo.getText());
				
				if(cod>=2201 && cod<3302){
					Bermudas berm;
					berm = fachada.buscaCodBerm(cod); //busca bermuda	
					System.out.println(berm.getDescricao());
					vendaBermuda.add(berm);
					JOptionPane.showMessageDialog(null, "Adicionado ao carrinho!");
				}else if(cod >= 3302 && cod < 4403){
					Calca calca;
					calca = fachada.buscaCodCal(cod); //busca calca
					vendaCalca.add(calca);
					JOptionPane.showMessageDialog(null, "Adicionado ao carrinho!");
				}else if(cod>= 4403 && cod<5503){
					Camisa camisa;
					camisa = fachada.buscaCodCam(cod); //busca camisa
					vendaCamisa.add(camisa);
					JOptionPane.showMessageDialog(null, "Adicionado ao carrinho!");
				}else if(cod>=5503 && cod <6603){
					Oculos oculos;
					oculos = fachada.buscaCodOculos(cod); // busca oculos
					vendaOculos.add(oculos);
					JOptionPane.showMessageDialog(null, "Adicionado ao carrinho!");
				}else{JOptionPane.showMessageDialog(null, "Algo foi preenchido errado");}
				
				}catch(NullPointerException e1){
					JOptionPane.showMessageDialog(null, "nullpointer");
				}catch(IndexOutOfBoundsException e1){
					JOptionPane.showMessageDialog(null, "Algo foi preenchido errado");
				}
				
			
			}// FIM ADICIONAR CARRINHO
						
		});
		btnAdcCarrinho.setVisible(false);
		btnAdcCarrinho.setBounds(228, 501, 120, 36);
		panel.add(btnAdcCarrinho);
		
		JLabel lblTotal = new JLabel("Total foi de :");
		lblTotal.setVisible(false);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(45, 246, 135, 27);
		panel.add(lblTotal);
		
		btnConluirVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double total = 0;
				try{
					
				for(int i = 0;i<=vendaBermuda.size();i++){
					total = vendaBermuda.get(i).getPreco();
					fachada.excluiBermuda(vendaBermuda.get(i));
				}for(int i = 0;i<=vendaCalca.size();i++){
					total = vendaCalca.get(i).getPreco();
					fachada.excluiCalca(vendaCalca.get(i));
				}for(int i = 0;i<=vendaCamisa.size();i++){
					total = vendaCamisa.get(i).getPreco();
					fachada.excluiCamisa(vendaCamisa.get(i));
				}for(int i = 0;i<=vendaOculos.size();i++){
					total = vendaOculos.get(i).getPreco();
					fachada.excluiOculos(vendaOculos.get(i));
				}
				
				}catch(NullPointerException e1){
					
				}catch(IndexOutOfBoundsException e1){
					
				}//FIM TRY
				lblSelecioneOCodigo.setVisible(false);
				btnAdcCarrinho.setVisible(false);
				txtCodigo.setVisible(false);
				btnConluirVenda.setVisible(false);
				scroll.setVisible(false);
				lblTotal.setText("O total foi de : "+total);
				lblTotal.setVisible(true);
			}
			
		});


	}
}
