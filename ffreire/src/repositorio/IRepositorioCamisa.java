package repositorio;

import beans.Camisa;

public interface IRepositorioCamisa {
	
	void cadastrar(Object objeto);
	Camisa buscar(Object objeto);
	Camisa bucarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	Camisa listar();

}
