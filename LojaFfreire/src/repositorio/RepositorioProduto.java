package repositorio;

import java.util.ArrayList;

import beans.Produto;

public class RepositorioProduto implements IRepositorioProduto {

	private ArrayList<Produto> produto;
	
	public RepositorioProduto(){
		
		this.produto = new ArrayList<Produto>();
		
	}
	//procurar produto atraves do nome, se não existir criar um novo, e quando iniciar o programa carregar tudo na 
	//combo box da gui
	
	@Override
	public void cadastrar(Produto produto) {
		
		
		
	}

	@Override
	public Produto buscarCod(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
