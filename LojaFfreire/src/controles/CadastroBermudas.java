
package controles;

import java.util.ArrayList;

import beans.Bermudas;
import repositorio.IRepositorioBermudas;
import repositorio.RepositorioBermudas;

public class CadastroBermudas implements ICadastroBermudas {

	
	private IRepositorioBermudas repositorio;
	
	
	public CadastroBermudas(){
		
		this.repositorio = new RepositorioBermudas();
	}
	
	@Override
	public void cadastrar(Bermudas berm) {
		
		this.repositorio.cadastrar(berm);
		
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

	@Override
	public ArrayList<Bermudas> listar() {
		ArrayList<Bermudas> bermuda = new ArrayList<Bermudas>();
		bermuda = this.repositorio.listar();
		return bermuda;
	}

	@Override
	public Bermudas buscarCod(int cod) {
		Bermudas berm;
		berm = this.repositorio.buscarCod(cod);
		return berm;
	}
	
	

}
