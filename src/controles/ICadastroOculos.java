package controles;

import java.util.ArrayList;

import beans.Oculos;

public interface ICadastroOculos {

	void cadastrar(Oculos oculos);
	Oculos buscar(Object objeto);
	Oculos buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	ArrayList<Oculos> listar();
}
