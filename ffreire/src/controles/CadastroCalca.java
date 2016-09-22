package controles;

import beans.Calca;
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
	public Calca listar(Calca calca) {
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
