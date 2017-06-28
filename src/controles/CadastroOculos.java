package controles;

import java.util.ArrayList;

import beans.Oculos;
import repositorio.IRepositorioOculos;
import repositorio.RepositorioOculos;

public class CadastroOculos implements ICadastroOculos{
	
private IRepositorioOculos repositorio;
	
	
	public CadastroOculos(){
		
		this.repositorio = new RepositorioOculos();
	}
	
	@Override
	public void cadastrar(Oculos oculos) {
		
		this.repositorio.cadastrar(oculos);
		
	}

	@Override
	public Oculos buscar(Object objeto) {
		Oculos aux = null;
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
	public ArrayList<Oculos> listar() {
		ArrayList<Oculos> oculos = new ArrayList<Oculos>();
		oculos = this.repositorio.listar();
		return oculos;
	}

	@Override
	public Oculos buscarCod(int cod) {
		Oculos oculos;
		oculos = this.repositorio.buscarCod(cod);
		return oculos;
	}



}
