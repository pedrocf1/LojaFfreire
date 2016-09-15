
package controles;

import beans.Bermudas;
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
	public Bermudas buscar(Object objeto) {
		Bermudas aux = null;
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
