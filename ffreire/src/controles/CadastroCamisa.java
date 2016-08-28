package controles;

import repositorio.IRepositorioCamisa;
import repositorio.RepositorioCamisa;

public class CadastroCamisa implements ICadastroCamisa {
	
	private IRepositorioCamisa repositorio;
	
	
	public CadastroCamisa(){
		
		this.repositorio = new RepositorioCamisa();
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
