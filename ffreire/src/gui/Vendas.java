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
import beans.Funcionario;
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
	private JTable table = new JTable();
	private JTextField txtCodigo;
	private ArrayList<Object> vendas;
	private	JButton btnAdcCarrinho;
	private ArrayList<Bermudas> vendaBermuda = new ArrayList<Bermudas>();
	private ArrayList<Calca> vendaCalca = new ArrayList<Calca>();
	private ArrayList<Camisa> vendaCamisa = new ArrayList<Camisa>();
	private ArrayList<Oculos> vendaOculos = new ArrayList<Oculos>();
	private JScrollPane scrollBerm = new JScrollPane(table);;
	private JScrollPane scrollCalca = new JScrollPane(table);;
	private JScrollPane scrollCamisa = new JScrollPane(table);;
	private JScrollPane scrollOculos = new JScrollPane(table);;
	private JTextField txtDinheiro;
	private JTextField txtTroco;
	private double total;
	
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public Vendas(IFachada fachada, int volta,Funcionario funci) {
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
		
		JButton btnConluirVenda = new JButton("Vender");
											// AÇÃO DELE TA NO FINAL DA PAGINA
		btnConluirVenda.setVisible(false);
		btnConluirVenda.setBounds(165, 563, 120, 36);
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
					
					JOptionPane.showMessageDialog(null, "Adicionado ao carrinho!");
					
				}else if(cbEscolha.getSelectedIndex()==1){//PROCURA PRODUTO POR CODIGO
					
					if(txtBuscar.getText().equals("1101")){
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS BERMUDAS						
						//table = new JTable();
						scrollBerm = new JScrollPane(table);
						scrollBerm.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Tamanho");
						modelo.addColumn("Preco");
						modelo.addColumn("tipo");
						modelo.addColumn("cor");
						modelo.addColumn("descrição");
						modelo.addColumn("Cod.Produto");
						panel.add(scrollBerm);
						ArrayList<Bermudas> bermuda = new ArrayList<Bermudas>();
							
							bermuda = fachada.listarBermuda();
							//Listar todas as bermudas numa tabela
							for(int i = 0;i<bermuda.size();i++){
								
								modelo.addRow(new Object[]{bermuda.get(i).getTamanho(),bermuda.get(i).getPreco(),bermuda.get(i).getTipo(),bermuda.get(i).getCor(),bermuda.get(i).getDescricao(),bermuda.get(i).getCodigo()});
								
							}
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
						
						
						
						
						
						//Listar  Bermudas /\
					}else if (txtBuscar.getText().equals("1102")){
						
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS CALCA						
					//	table = new JTable();
						scrollCalca = new JScrollPane(table);
						scrollCalca.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Tamanho");
						modelo.addColumn("Preco");
						modelo.addColumn("tipo");
						modelo.addColumn("cor");
						modelo.addColumn("descrição");
						modelo.addColumn("Cod.Produto");
						panel.add(scrollCalca);
						ArrayList<Calca> calca = new ArrayList<Calca>();
							
						calca = fachada.listarCalca();	
							for(int i = 0;i <calca.size();i++){
							modelo.addRow(new Object[]{calca.get(i).getTamanho(),calca.get(i).getPreco(),calca.get(i).getTipo(),calca.get(i).getCor(),calca.get(i).getDescricao(),calca.get(i).getCodigo()});
							}
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
						
						
						
						
						//Listar Calca
					}else if(txtBuscar.getText().equals("1103")){
						
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS CAMISA						
					//	table = new JTable();
						scrollCamisa = new JScrollPane(table);
						scrollCamisa.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Tamanho");
						modelo.addColumn("Preco");
						modelo.addColumn("cor");
						modelo.addColumn("tipo");
						modelo.addColumn("descrição");
						modelo.addColumn("Cod.Produto");
						panel.add(scrollCamisa);
						ArrayList<Camisa> camisa = new ArrayList<Camisa>();
							
						camisa = fachada.listarCamisa();	
							for(int i = 0;i<camisa.size(); i ++){
							modelo.addRow(new Object[]{camisa.get(i).getTamanho(),camisa.get(i).getPreco(),camisa.get(i).getCorEstampa(),camisa.get(i).getTipo(),camisa.get(i).getDescricao(),camisa.get(i).getCodigo()});
							}
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
					
						
						
						//Listar Camisa
					}else if(txtBuscar.getText().equals("1104")){
						
						
						
						// CRIAÇÃO DO TABLE COM UMA ROLL PARA LISTAR AS OCULOS						
					//	table = new JTable();
						scrollOculos = new JScrollPane(table);
						scrollOculos.setBounds(10, 176, 454, 243);
						DefaultTableModel modelo = new DefaultTableModel();
						table.setModel(modelo);
						modelo.addColumn("Genero");
						modelo.addColumn("Tipo");
						modelo.addColumn("Cor");
						modelo.addColumn("Descrição");
						modelo.addColumn("Preço");
						modelo.addColumn("Cod.Produto");
						panel.add(scrollOculos);
						ArrayList<Oculos> oculos = new ArrayList<Oculos>();
							
						oculos = fachada.listarOculos();
						for(int i = 0;i<oculos.size();i++){
						modelo.addRow(new Object[]{oculos.get(i).getGenero(),oculos.get(i).getTipo(),oculos.get(i).getCor(),oculos.get(i).getDescricao(),oculos.get(i).getPreco(),oculos.get(i).getCodigo()});
						}
						
						
						lblSelecioneOCodigo.setVisible(true);
						btnAdcCarrinho.setVisible(true);
						txtCodigo.setVisible(true);
						btnConluirVenda.setVisible(true);
						
						
						
						//Listar Oculos
					}
					
				}//FIM DA PROCURA DE PRODUTO POR CODIGO
				
				}catch(NullPointerException e1){
					JOptionPane.showMessageDialog(null, "null point");
				}catch(IndexOutOfBoundsException e1){
					JOptionPane.showMessageDialog(null, "Algo foi preenchido errado");
				}			
			}
		});// FIM ACTION LISTENER
		btnProcurar.setBounds(10, 563, 120, 36);
		panel.add(btnProcurar);
		
		this.btnAdcCarrinho = new JButton("Adc.Carrinho");
		btnAdcCarrinho.addActionListener(new ActionListener() { // ADICIONAR CARRINHO
			public void actionPerformed(ActionEvent arg0) {
				try{
				int cod = Integer.parseInt(txtCodigo.getText());
				
				if(cod>=2201 && cod<3302){
					Bermudas berm;
					berm = fachada.buscaCodBerm(cod); //busca bermuda	
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
		lblTotal.setBounds(45, 246, 179, 27);
		panel.add(lblTotal);
		
		JLabel lblDinheiro = new JLabel("Dinheiro");
		lblDinheiro.setVisible(false);
		lblDinheiro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDinheiro.setBounds(45, 300, 85, 27);
		panel.add(lblDinheiro);
		
		txtDinheiro = new JTextField();
		txtDinheiro.setVisible(false);
		txtDinheiro.setBounds(140, 304, 108, 22);
		panel.add(txtDinheiro);
		txtDinheiro.setColumns(10);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setVisible(false);
		lblTroco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTroco.setBounds(45, 357, 68, 27);
		panel.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setVisible(false);
		txtTroco.setBounds(138, 362, 110, 20);
		panel.add(txtTroco);
		txtTroco.setColumns(10);
		
		JButton btnConcluir = new JButton("Concluir Venda"); // ATO DE CONCLUIR VENDA
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double dinheiro = Double.parseDouble(txtDinheiro.getText()) - total;
				txtTroco.setText(String.valueOf(dinheiro));
				
				try{
					
					for(int i = 0;i<=vendaBermuda.size();i++){
						fachada.excluiBermuda(vendaBermuda.get(i));
					}for(int i = 0;i<=vendaCalca.size();i++){
						fachada.excluiCalca(vendaCalca.get(i));
					}for(int i = 0;i<=vendaCamisa.size();i++){
						fachada.excluiCamisa(vendaCamisa.get(i));
					}for(int i = 0;i<=vendaOculos.size();i++){
						fachada.excluiOculos(vendaOculos.get(i));
					}
					
					}catch(NullPointerException e1){
						
					}catch(IndexOutOfBoundsException e1){
						
					}//FIM TRY
				JOptionPane.showMessageDialog(null, "Vendemo manolo *-*");
			}
		});
		btnConcluir.setVisible(false);
		btnConcluir.setBounds(45, 417, 108, 23);
		panel.add(btnConcluir);
		
		JButton btnVoltar = new JButton("Voltar");        //BOTÃO VOLTAR
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(volta == 1){
					dispose();
					LoginAdm adm = new LoginAdm(fachada);
					adm.setVisible(true);
				}else if(volta == 2){
					dispose();
					LoginFunc func = new LoginFunc(fachada,funci);
					func.setVisible(true);
				}
			}
		});
		btnVoltar.setBounds(320, 565, 114, 32);
		panel.add(btnVoltar);
		
		btnConluirVenda.addActionListener(new ActionListener() {// soma de todos os preços dos "carrinhos"
			public void actionPerformed(ActionEvent arg0) {
				scrollBerm.setVisible(false);
				scrollCalca.setVisible(false);
				scrollCamisa.setVisible(false);
				scrollOculos.setVisible(false);
				table.setVisible(false);
				double totalBerm=0,totalCalca=0,totalCamisa=0,totalOculos=0;
				try{
					
					
				for(Bermudas bermuda : vendaBermuda){
					totalBerm += bermuda.getPreco();
					//total += totalBerm;
				}
				
				
					
				for(Calca calca : vendaCalca){
					totalCalca += calca.getPreco();
					//total += totalCalca;
				}
				
				
					
				for(Camisa camisa : vendaCamisa){
					totalCamisa += camisa.getPreco();
				//	total += totalCamisa;
				}
				
				
					
				for(Oculos oculos : vendaOculos){
					totalOculos += oculos.getPreco();
					//total += totalOculos;
				}
				
				total = totalBerm+totalCalca+totalCamisa+totalOculos; 
				}catch(NullPointerException e1){
					e1.printStackTrace();
				}catch(IndexOutOfBoundsException e1){
					e1.printStackTrace();
				}//FIM TRY
				lblSelecioneOCodigo.setVisible(false);
				btnAdcCarrinho.setVisible(false);
				txtCodigo.setVisible(false);
				btnConluirVenda.setVisible(false);
				//scroll.setVisible(false);
				lblTotal.setText("O total foi de : "+total);
				lblTotal.setVisible(true);
				lblDinheiro.setVisible(true);
				txtDinheiro.setVisible(true);
				lblTroco.setVisible(true);
				txtTroco.setVisible(true);
				btnConcluir.setVisible(true);
			}
			
		});


	}
}
