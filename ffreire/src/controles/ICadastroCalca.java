package controles;

import beans.Calca;

public interface ICadastroCalca {

	void cadastrar(Object objeto);
	Calca buscar(Object objeto);
	Calca buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	Calca listar(Calca calca);
}
