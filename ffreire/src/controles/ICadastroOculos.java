package controles;

import beans.Oculos;

public interface ICadastroOculos {

	void cadastrar(Object objeto);
	Oculos buscar(Object objeto);
	Oculos buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	Oculos listar(Oculos oculos);
}
