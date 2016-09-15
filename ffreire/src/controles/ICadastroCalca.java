package controles;

import beans.Calca;

public interface ICadastroCalca {

	void cadastrar(Object objeto);
	Calca buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	
}
