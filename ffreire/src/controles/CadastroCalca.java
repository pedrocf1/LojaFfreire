package controles;

import java.util.ArrayList;

import beans.Calca;
import repositorio.IRepositorioCalca;
import repositorio.RepositorioCalca;

public class CadastroCalca implements ICadastroCalca {
	
	
	
	private IRepositorioCalca repositorio;
	
	
	public CadastroCalca(){
		
		this.repositorio = new RepositorioCalca();
	}
	
	@Override
	public void cadastrar(Calca calca) {
		
		this.repositorio.cadastrar(calca);
		
	}

	@Override
	public Calca buscar(Object objeto) {
		Calca aux = null;
		aux =this.repositorio.buscar(objeto);
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
	public ArrayList<Calca> listar() {
		ArrayList<Calca> calca = new ArrayList<Calca>();
		calca = this.repositorio.listar();
		return calca;
	}

	@Override
	public Calca buscarCod(int cod) {
		Calca calca;
		calca = this.repositorio.buscarCod(cod);
		return calca;
	}

}
