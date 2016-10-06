package controles;

import java.util.ArrayList;

import beans.Camisa;

public interface ICadastroCamisa {
	
	void cadastrar(Camisa camisa);
	Camisa buscar(Object objeto);
	Camisa buscarCod(int cod);
	void remover(Object objeto);
	void atualizar(Object objeto);
	ArrayList<Camisa> listar();
}
