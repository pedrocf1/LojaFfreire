package repositorio;

import java.util.ArrayList;

import beans.Calca;

public interface IRepositorioCalca {
	
	
	void cadastrar(Calca calca);
	Calca buscar(Object objeto);
	Calca buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	ArrayList<Calca> listar();
}
