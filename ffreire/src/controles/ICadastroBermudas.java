package controles;

import beans.Bermudas;

public interface ICadastroBermudas {
	
	void cadastrar(Object objeto);
	Bermudas buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	
	
}
