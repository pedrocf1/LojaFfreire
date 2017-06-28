package repositorio;

import java.util.ArrayList;

import beans.Produto;

public interface IRepositorioProduto {
	
	void cadastrar(Produto produto);
	Produto buscarCod(int codigo);
	void remover(Produto produto);
	void atualizar(Produto produto);
	ArrayList<Produto> listar();
}
