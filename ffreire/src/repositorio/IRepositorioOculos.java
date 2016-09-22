package repositorio;

import beans.Oculos;

public interface IRepositorioOculos {
	
	void cadastrar(Object objeto);
	void remover(Object objeto);
	Oculos buscar(Object objeto);
	Oculos buscarCod(int cod);
	void atualizar(Object objeto);
	Oculos listar();
}
