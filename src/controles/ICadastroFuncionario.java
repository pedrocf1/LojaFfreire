package controles;

import beans.Funcionario;

public interface ICadastroFuncionario {

	void cadastrar(Funcionario func);
	Funcionario buscar(Object objeto);
	void remover(Object objeto);
	void atualizar(Object objeto);
	boolean verificaLogin(String login);
	Funcionario login (String login, String senha);
	Funcionario listar();
}
