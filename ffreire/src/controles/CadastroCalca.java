package controles;

import repositorio.IRepositorioCalca;
import repositorio.RepositorioCalca;

public class CadastroCalca implements ICadastroCalca {
	
	
	
	private IRepositorioCalca repositorio;
	
	
	public CadastroCalca(){
		
		this.repositorio = new RepositorioCalca();
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
