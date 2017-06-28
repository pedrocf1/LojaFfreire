package repositorio;

import java.util.ArrayList;

import beans.Cliente;

public class RepositorioCliente implements IRepositorioCliente{
	
	
	private ArrayList<Cliente> cliente;

	
	public RepositorioCliente(){
		
		
		this.cliente = new ArrayList<Cliente>();

	}
	
	@Override
	public void cadastrar(Object objeto) {

		if(objeto instanceof Cliente){
			
			this.cliente.add((Cliente) objeto);
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public void buscar(Object objeto) {
		

		
		if(objeto instanceof Cliente){
			
			for(int cont = 0;cont<= this.cliente.size();cont++){
				
				Cliente aux = this.cliente.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		
	}// FIM CLASSE BUSCAR

	@Override
	public void remover(Object objeto) {
		
	
		if(objeto instanceof Cliente){
			
			for(int cont = 0;cont<= this.cliente.size();cont++){
				
				Cliente aux = this.cliente.get(cont);
				
				  if(aux.equals(objeto)){
					
					this.cliente.remove(cont);
					
				}
				
			}
			
		}
		
	
	}// FIM CLASSE REMOVER

	@Override
	public void atualizar(Object objeto) {
		
	
		
		if(objeto instanceof Cliente){
			
			for(int cont = 0;cont<= this.cliente.size();cont++){
				
				Cliente aux = this.cliente.get(cont);
				
				  if(aux.equals(objeto)){
					
					
				}
				
			}
			
		} 
		
	
		
	}// FIM CLASSE ATUALIZAR

}
