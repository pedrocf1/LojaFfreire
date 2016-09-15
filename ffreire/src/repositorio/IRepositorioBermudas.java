package repositorio;

import beans.Bermudas;

public interface IRepositorioBermudas {

	
	void cadastrar(Object objeto);
	Bermudas buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	
	
}
