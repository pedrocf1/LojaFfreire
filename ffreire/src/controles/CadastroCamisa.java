package controles;

import java.util.ArrayList;

import beans.Camisa;
import repositorio.IRepositorioCamisa;
import repositorio.RepositorioCamisa;

public class CadastroCamisa implements ICadastroCamisa {
	
	private IRepositorioCamisa repositorio;
	
	
	public CadastroCamisa(){
		
		this.repositorio = new RepositorioCamisa();
	}
	
	@Override
	public void cadastrar(Camisa camisa) {
		
		this.repositorio.cadastrar(camisa);
		
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

	@Override
	public ArrayList<Camisa> listar() {
		ArrayList<Camisa> camisa = new ArrayList<Camisa>();
		camisa = this.repositorio.listar();
		return camisa;
	}

	@Override
	public Camisa buscarCod(int cod) {
		Camisa camisa;
		camisa = this.repositorio.bucarCod(cod);
		return camisa;
	}
}
