package controles;

import beans.Camisa;
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
	public Camisa buscar(Object objeto) {
		Camisa aux = null;
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
}
