package controles;

import repositorio.IRepositorioOculos;
import repositorio.RepositorioOculos;

public class CadastroOculos implements ICadastroOculos{
	
private IRepositorioOculos repositorio;
	
	
	public CadastroOculos(){
		
		this.repositorio = new RepositorioOculos();
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
