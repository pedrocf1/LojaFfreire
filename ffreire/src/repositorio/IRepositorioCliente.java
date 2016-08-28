package repositorio;

public interface IRepositorioCliente {
	
	void cadastrar(Object objeto);
	void remover(Object objeto);
	void buscar(Object objeto);
	void atualizar(Object objeto);

}
