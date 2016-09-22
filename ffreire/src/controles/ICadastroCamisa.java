package controles;

import beans.Camisa;

public interface ICadastroCamisa {
	
	void cadastrar(Object objeto);
	Camisa buscar(Object objeto);
	Camisa buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	Camisa listar(Camisa camisa);
}
