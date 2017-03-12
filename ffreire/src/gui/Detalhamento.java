package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import beans.Bermudas;
import beans.Calca;
import beans.Camisa;
import beans.Funcionario;
import beans.Oculos;
import fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.JTextField;

public class Detalhamento extends JFrame {

	private JPanel contentPane;
	private BufferedReader br;
	private String currentLine;
	private IFachada fachada;
	private JTextField codRoupa;
	private JTable table = new JTable();
	//private JScrollPane scrollPane;
	private Bermudas berm;
	private Calca cal;
	private Camisa cam;
	private Oculos ocu;
	private ArrayList<Bermudas> bermuda  = new ArrayList<Bermudas>();
	private ArrayList<Calca> calca = new ArrayList<Calca>();
	private ArrayList<Camisa>camisa = new ArrayList<Camisa>();
	private ArrayList<Oculos>oculos = new ArrayList<Oculos>();
	private JScrollPane scrollBerm = new JScrollPane(table);;
	private JScrollPane scrollCalca = new JScrollPane(table);;
	private JScrollPane scrollCamisa = new JScrollPane(table);;
	private JScrollPane scrollOculos = new JScrollPane(table);;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detalhamento frame = new Detalhamento();
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
	public Detalhamento(IFachada fachada,String escolha,Funcionario func,int volta) {
		this.fachada = fachada;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel fotos = new JLabel("");
		fotos.setBounds(10, 81, 289, 274);
		contentPane.add(fotos);
		
		
		//ImageIcon icon = new ImageIcon(fachada.buscaCodBerm(2201).getImg());
		//Image img = icon.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), Image.SCALE_DEFAULT);
		//fotos.setIcon(new ImageIcon(img));
		
		
		
		/*scrollPane = new JScrollPane(table);
		scrollPane.setBounds(309, 81, 401, 274);
		contentPane.add(scrollPane);*/
		
		//DefaultTableModel modelo = new DefaultTableModel();
	//	table.setModel(modelo);
		
		if(escolha.equals("1101")){
			DefaultTableModel modelo = new DefaultTableModel();
			JScrollPane scrollBerm = new JScrollPane(table);;
			scrollBerm.setBounds(309, 81, 401, 274);
			table.setModel(modelo);
			modelo.addColumn("Tamanho");
			modelo.addColumn("Preco");
			modelo.addColumn("tipo");
			modelo.addColumn("cor");
			modelo.addColumn("descrição");
			modelo.addColumn("Cod.Produto");
			modelo.addColumn("quantidade");
			contentPane.add(scrollBerm);
			bermuda = fachada.listarBermuda();
			for(int i =0;i<bermuda.size();i++){
		modelo.addRow(new Object[]{bermuda.get(i).getTamanho(),bermuda.get(i).getPreco(),bermuda.get(i).getTipo(),bermuda.get(i).getCor(),bermuda.get(i).getDescricao(),bermuda.get(i).getCodigo(),bermuda.get(i).getQuantidade()});
		}
			
		}else if(escolha.equals("1102")){
			scrollCalca.setBounds(309, 81, 401, 274);
			JScrollPane scrollCalca = new JScrollPane(table);;
			DefaultTableModel modelo = new DefaultTableModel();
			table.setModel(modelo);
			modelo.addColumn("Tamanho");
			modelo.addColumn("Preco");
			modelo.addColumn("tipo");
			modelo.addColumn("cor");
			modelo.addColumn("descrição");
			modelo.addColumn("Cod.Produto");
			modelo.addColumn("quantidade");
			contentPane.add(scrollCalca);
			calca = fachada.listarCalca();	
			for(int i = 0;i <calca.size();i++){
		modelo.addRow(new Object[]{calca.get(i).getTamanho(),calca.get(i).getPreco(),calca.get(i).getTipo(),calca.get(i).getCor(),calca.get(i).getDescricao(),calca.get(i).getCodigo(),calca.get(i).getQuantidade()});
	}
			
		}else if(escolha.equals("1103")){
			scrollCamisa.setBounds(309, 81, 401, 274);
			JScrollPane scrollCamisa = new JScrollPane(table);;
			DefaultTableModel modelo = new DefaultTableModel();
			table.setModel(modelo);
			modelo.addColumn("Tamanho");
			modelo.addColumn("Preco");
			modelo.addColumn("cor");
			modelo.addColumn("tipo");
			modelo.addColumn("descrição");
			modelo.addColumn("Cod.Produto");
			modelo.addColumn("quantidade");
			contentPane.add(scrollCamisa);
			camisa = fachada.listarCamisa();	
			   for(int i = 0;i<camisa.size(); i ++){
					modelo.addRow(new Object[]{camisa.get(i).getTamanho(),camisa.get(i).getPreco(),camisa.get(i).getCorEstampa(),camisa.get(i).getTipo(),camisa.get(i).getDescricao(),camisa.get(i).getCodigo(),camisa.get(i).getQuantidade()});
					}
			
		}else if(escolha.equals("1104")){
			scrollOculos.setBounds(309, 81, 401, 274);
			DefaultTableModel modelo = new DefaultTableModel();
			JScrollPane scrollOculos = new JScrollPane(table);;
			table.setModel(modelo);
			modelo.addColumn("Genero");
			modelo.addColumn("Tipo");
			modelo.addColumn("Cor");
			modelo.addColumn("Descrição");
			modelo.addColumn("Preço");
			modelo.addColumn("Cod.Produto");
			modelo.addColumn("quantidade");
			contentPane.add(scrollOculos);
			oculos = fachada.listarOculos();
			for(int i = 0;i<oculos.size();i++){
			modelo.addRow(new Object[]{oculos.get(i).getGenero(),oculos.get(i).getTipo(),oculos.get(i).getCor(),oculos.get(i).getDescricao(),oculos.get(i).getPreco(),oculos.get(i).getCodigo(),oculos.get(i).getQuantidade()});
			}
			
		}
		
		

		
		JButton btnSelecionarFoto = new JButton("selecionar foto");
		btnSelecionarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
				
			int cod =	Integer.parseInt(codRoupa.getText());
			
					
				//INSERÇÃO DAS TABELAS
				if(codRoupa.getText().equals("1101")){
					
					scrollCalca.setVisible(false);
					scrollCamisa.setVisible(false);
					scrollOculos.setVisible(false);
					
					
					JScrollPane scrollBerm = new JScrollPane(table);;
					scrollBerm.setBounds(309, 81, 401, 274);
					DefaultTableModel modelo = new DefaultTableModel();
					table.setModel(modelo);
					modelo.addColumn("Tamanho");
					modelo.addColumn("Preco");
					modelo.addColumn("tipo");
					modelo.addColumn("cor");
					modelo.addColumn("descrição");
					modelo.addColumn("Cod.Produto");
					modelo.addColumn("quantidade");
					contentPane.add(scrollBerm);
					bermuda = fachada.listarBermuda();
							for(int i =0;i<bermuda.size();i++){
						modelo.addRow(new Object[]{bermuda.get(i).getTamanho(),bermuda.get(i).getPreco(),bermuda.get(i).getTipo(),bermuda.get(i).getCor(),bermuda.get(i).getDescricao(),bermuda.get(i).getCodigo(),bermuda.get(i).getQuantidade()});
						}
					
				}else if(codRoupa.getText().equals("1102")){
					scrollBerm.setVisible(false);
					scrollCamisa.setVisible(false);
					scrollOculos.setVisible(false);
					
					JScrollPane scrollCalca = new JScrollPane(table);;
					scrollCalca.setBounds(309, 81, 401, 274);
					DefaultTableModel modelo = new DefaultTableModel();
					table.setModel(modelo);
					modelo.addColumn("Tamanho");
					modelo.addColumn("Preco");
					modelo.addColumn("tipo");
					modelo.addColumn("cor");
					modelo.addColumn("descrição");
					modelo.addColumn("Cod.Produto");
					modelo.addColumn("quantidade");
					contentPane.add(scrollCalca);
					calca = fachada.listarCalca();	
							for(int i = 0;i <calca.size();i++){
						modelo.addRow(new Object[]{calca.get(i).getTamanho(),calca.get(i).getPreco(),calca.get(i).getTipo(),calca.get(i).getCor(),calca.get(i).getDescricao(),calca.get(i).getCodigo(),calca.get(i).getQuantidade()});
					}
					
				}else if(codRoupa.getText().equals("1103")){
					scrollBerm.setVisible(false);
					scrollCalca.setVisible(false);
					scrollOculos.setVisible(false);
					
					JScrollPane scrollCamisa = new JScrollPane(table);;
					scrollCamisa.setBounds(309, 81, 401, 274);
					DefaultTableModel modelo = new DefaultTableModel();
					table.setModel(modelo);
					modelo.addColumn("Tamanho");
					modelo.addColumn("Preco");
					modelo.addColumn("cor");
					modelo.addColumn("tipo");
					modelo.addColumn("descrição");
					modelo.addColumn("Cod.Produto");
					modelo.addColumn("quantidade");
					contentPane.add(scrollCamisa);
					camisa = fachada.listarCamisa();	
					   for(int i = 0;i<camisa.size(); i ++){
							modelo.addRow(new Object[]{camisa.get(i).getTamanho(),camisa.get(i).getPreco(),camisa.get(i).getCorEstampa(),camisa.get(i).getTipo(),camisa.get(i).getDescricao(),camisa.get(i).getCodigo(),camisa.get(i).getQuantidade()});
							}					
				}else if(codRoupa.getText().equals("1104")){
					scrollBerm.setVisible(false);
					scrollCamisa.setVisible(false);
					scrollCalca.setVisible(false);
					
					JScrollPane scrollOculos = new JScrollPane(table);;
					scrollOculos.setBounds(309, 81, 401, 274);
					DefaultTableModel modelo = new DefaultTableModel();
					table.setModel(modelo);
					modelo.addColumn("Genero");
					modelo.addColumn("Tipo");
					modelo.addColumn("Cor");
					modelo.addColumn("Descrição");
					modelo.addColumn("Preço");
					modelo.addColumn("Cod.Produto");
					modelo.addColumn("quantidade");
					contentPane.add(scrollOculos);
					oculos = fachada.listarOculos();
					for(int i = 0;i<oculos.size();i++){
					modelo.addRow(new Object[]{oculos.get(i).getGenero(),oculos.get(i).getTipo(),oculos.get(i).getCor(),oculos.get(i).getDescricao(),oculos.get(i).getPreco(),oculos.get(i).getCodigo(),oculos.get(i).getQuantidade()});
					}
				}//FIM INSERÇÃO DAS TABELAS
				
				
				//INSERIR IMG NA LABEL
				if( cod>=2201 && cod<2202){
						berm = fachada.buscaCodBerm(cod);
						ImageIcon icon = new ImageIcon(berm.getImg());
						Image img = icon.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), Image.SCALE_DEFAULT);
						fotos.setIcon(new ImageIcon(img));
				}else if(cod>=3302 && cod<4403){
					cal = fachada.buscaCodCal(cod);
					ImageIcon icon = new ImageIcon(cal.getImg());
					Image img = icon.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), Image.SCALE_DEFAULT);
					fotos.setIcon(new ImageIcon(img));
							
				}else if(cod>=4403 && cod<5503){
					cam = fachada.buscaCodCam(cod);
					ImageIcon icon = new ImageIcon(cam.getImg());
					Image img = icon.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), Image.SCALE_DEFAULT);
					fotos.setIcon(new ImageIcon(img));
					
				}else if(cod>=5503){
					ocu = fachada.buscaCodOculos(cod);
					ImageIcon icon = new ImageIcon(ocu.getImg());
					Image img = icon.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), Image.SCALE_DEFAULT);
					fotos.setIcon(new ImageIcon(img));
					
				}
				
					
				
				
				/*//Proximas 4 linhas pega a img
				String imagem;
				JFileChooser fc = new JFileChooser();
				int escolha = fc.showOpenDialog(fc);
				imagem = fc.getSelectedFile().getAbsolutePath();
				
				// proximas duas linhas pegam a img e redimensionam pro tamanho da label
				ImageIcon icon = new ImageIcon(imagem);
				Image img = icon.getImage().getScaledInstance(fotos.getWidth(), fotos.getHeight(), Image.SCALE_DEFAULT);
				
				fotos.setIcon(new ImageIcon(img));*/
				} catch (Exception e) {
					e.printStackTrace();
				}					
				
			}
		});
		btnSelecionarFoto.setBounds(146, 427, 103, 23);
		contentPane.add(btnSelecionarFoto);
		

		
		JLabel lblDigiteOCodigo = new JLabel("digite o codigo do produto");
		lblDigiteOCodigo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDigiteOCodigo.setBounds(146, 21, 170, 28);
		contentPane.add(lblDigiteOCodigo);
		
		codRoupa = new JTextField();
		codRoupa.setBounds(348, 26, 124, 20);
		contentPane.add(codRoupa);
		codRoupa.setColumns(10);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Vendas venda = new Vendas(fachada,volta,func);
				venda.setVisible(true);
			}
		});
		btnVoltar.setBounds(335, 427, 110, 23);
		contentPane.add(btnVoltar);
	}
}
