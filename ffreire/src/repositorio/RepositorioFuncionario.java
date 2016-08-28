package repositorio;

import java.util.ArrayList;

import beans.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario{

	private ArrayList<Funcionario> funcionario;

	
	public RepositorioFuncionario(){
		
		
		this.funcionario = new ArrayList<Funcionario>();

	}
	
	@Override
	public void cadastrar(Object objeto) {

		if(objeto instanceof Funcionario){
			
			this.funcionario.add((Funcionario) objeto);
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public void buscar(Object objeto) {
		

		
		if(objeto instanceof Funcionario){
			
			for(int cont = 0;cont<= this.funcionario.size();cont++){
				
				Funcionario aux = this.funcionario.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		
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
	
	
}
