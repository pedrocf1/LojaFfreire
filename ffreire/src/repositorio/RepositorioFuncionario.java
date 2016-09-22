package repositorio;

import java.util.ArrayList;

import beans.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario{

	private ArrayList<Funcionario> funcionario;
		
	public RepositorioFuncionario(){
		
		
		this.funcionario = new ArrayList<Funcionario>();

	}
	
	@Override
	public void cadastrar(Funcionario func) {

		
			
			this.funcionario.add(func);
		

		
	}// FIM CLASSE CADASTRAR

	@Override
	public Funcionario buscar(Object objeto) {
			
		Funcionario aux = null;
		
		if(objeto instanceof Funcionario){
			
			for(int cont = 0;cont<= this.funcionario.size();cont++){
				
				aux = this.funcionario.get(cont);
				
				  if(aux.equals(objeto)){
					
					cont = 1 + this.funcionario.size();
					
				}
				
			}
			
		}
		
		return aux;
	}// FIM CLASSE BUSCAR

	@Override
	public void remover(Object objeto) {
		
	
		if(objeto instanceof Funcionario){
			
			for(int cont = 0;cont<= this.funcionario.size();cont++){
				
				Funcionario aux = this.funcionario.get(cont);
				
				  if(aux.equals(objeto)){
					
					this.funcionario.remove(cont);
					
				}
				
			}
			
		}
		
	
	}// FIM CLASSE REMOVER

	@Override
	public void atualizar(Object objeto) {
		
	
		
		if(objeto instanceof Funcionario){
			
			for(int cont = 0;cont<= this.funcionario.size();cont++){
				
				Funcionario aux = this.funcionario.get(cont);
				
				  if(aux.equals(objeto)){
					
					  funcionario.set(cont,((Funcionario)objeto));
					
				}
				
			}
			
		} 
		
	
		
	}// FIM CLASSE ATUALIZAR

	@Override
	public Funcionario login(String login, String senha) {
		
		Funcionario aux= null;
		
		for (int cont = 0;cont<=this.funcionario.size();cont++){
				
			if(aux.getLogin().equals(login) && aux.getSenha().equals(senha)){
				
			
			aux = this.funcionario.get(cont);
				}
			  }
		
		return aux;
	}

	@Override
	public Funcionario listar() {
		int cont = 0;
		Funcionario aux = null;
		while(cont <= this.funcionario.size()){}
			aux = this.funcionario.get(cont);
		
		return aux;
	}

	@Override
	public boolean verificaLogin(String login) {
		boolean confirma = false;
		
		for(int cont = 0;cont <= this.funcionario.size();cont++){
		
			if(this.funcionario.get(cont).getLogin().equals(login)){
				return confirma;
			}
		}
		
		
		return confirma;
	}
	
	
	
	
}