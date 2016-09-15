package repositorio;

import beans.Camisa;

public interface IRepositorioCamisa {
	
	void cadastrar(Object objeto);
	Camisa buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	

}
