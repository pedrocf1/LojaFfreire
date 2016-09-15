package controles;

import beans.Camisa;

public interface ICadastroCamisa {
	
	void cadastrar(Object objeto);
	Camisa buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);

}
