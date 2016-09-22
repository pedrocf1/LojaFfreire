package controles;

import beans.Oculos;
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
	public Oculos listar(Oculos oculos) {
		
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
