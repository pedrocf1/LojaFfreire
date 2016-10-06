package repositorio;

import java.util.ArrayList;

import beans.Camisa;

public interface IRepositorioCamisa {
	
	void cadastrar(Camisa camisa);
	Camisa buscar(Object objeto);
	Camisa bucarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	ArrayList<Camisa> listar();

}
