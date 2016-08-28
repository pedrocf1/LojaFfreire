package controles;

import repositorio.IRepositorioFuncionario;
import repositorio.RepositorioFuncionario;

public class CadastroFuncionario implements ICadastroFuncionario{

private IRepositorioFuncionario repositorio;
	
	
	public CadastroFuncionario(){
		
		this.repositorio = new RepositorioFuncionario();
	}
	
	@Override
	public void cadastrar(Object objeto) {
		
		this.repositorio.cadastrar(objeto);
		
	}

	@Override
	public void buscar(Object objeto) {
		
		this.repositorio.buscar(objeto);
		
	}

	@Override
	public void remover(Object objeto) {
		
		this.repositorio.remover(objeto);
		
	}

	@Override
	public void atualizar(Object objeto) {
		this.repositorio.atualizar(objeto);
		
	}
	
}
