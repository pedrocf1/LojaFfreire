
package controles;

import repositorio.IRepositorioBermudas;
import repositorio.RepositorioBermudas;

public class CadastroBermudas implements ICadastroBermudas {

	
	private IRepositorioBermudas repositorio;
	
	
	public CadastroBermudas(){
		
		this.repositorio = new RepositorioBermudas();
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
