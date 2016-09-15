package controles;

import beans.Oculos;

public interface ICadastroOculos {

	void cadastrar(Object objeto);
	Oculos buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	
}
