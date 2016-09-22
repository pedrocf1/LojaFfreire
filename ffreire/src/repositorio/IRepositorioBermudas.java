package repositorio;

import beans.Bermudas;

public interface IRepositorioBermudas {

	
	void cadastrar(Bermudas berm);
	Bermudas buscar(Object objeto);
	Bermudas buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	Bermudas listar();
	
}
