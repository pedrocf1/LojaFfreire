package repositorio;

import beans.Calca;

public interface IRepositorioCalca {
	
	
	void cadastrar(Object objeto);
	Calca buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	
}
