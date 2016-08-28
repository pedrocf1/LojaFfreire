package controles;

import repositorio.IRepositorioCliente;
import repositorio.RepositorioCliente;

public class CadastroCliente implements ICadastroCliente{
	
private IRepositorioCliente repositorio;
	
	
	public CadastroCliente(){
		
		this.repositorio = new RepositorioCliente();
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
