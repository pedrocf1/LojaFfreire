package repositorio;

import beans.Funcionario;

public interface IRepositorioFuncionario {
	
	void cadastrar(Funcionario func);
	void remover(Object objeto);
	Funcionario buscar(Object objeto);
	void atualizar(Object objeto);
	boolean verificaLogin(String login);
	Funcionario login(String login, String senha);
	Funcionario listar();

}
