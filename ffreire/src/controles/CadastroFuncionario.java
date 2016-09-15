package controles;

import beans.Funcionario;
import repositorio.IRepositorioFuncionario;
import repositorio.RepositorioFuncionario;

public class CadastroFuncionario implements ICadastroFuncionario{

private IRepositorioFuncionario repositorio;
	
	
	public CadastroFuncionario(){
		
		this.repositorio = new RepositorioFuncionario();
	}
	
	@Override
	public void cadastrar(Funcionario func) {
		
		this.repositorio.cadastrar(func);
		
	}

	@Override
	public Funcionario buscar(Object objeto) {
		Funcionario aux = null;
		aux = this.repositorio.buscar(objeto);
		return aux;
	}

	@Override
	public void remover(Object objeto) {
		
		this.repositorio.remover(objeto);
		
	}

	@Override
	public void atualizar(Object objeto) {
		this.repositorio.atualizar(objeto);
		
	}

	@Override
	public Funcionario login(String login, String senha) {
		Funcionario aux = null;
		aux = this.repositorio.login(login, senha);
		
		return aux;
	}

	@Override
	public Funcionario listar() {
		
		return this.repositorio.listar();
	}

	@Override
	public boolean verificaLogin(String login) {
		boolean confirma;
		confirma = this.repositorio.verificaLogin(login);
		return confirma;
		}
	
}
