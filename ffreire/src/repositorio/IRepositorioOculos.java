package repositorio;

import beans.Oculos;

public interface IRepositorioOculos {
	
	void cadastrar(Object objeto);
	void remover(Object objeto);
	Oculos buscar(Object objeto);
	void atualizar(Object objeto);

}
