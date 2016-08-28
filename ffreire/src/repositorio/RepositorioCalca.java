package repositorio;

import java.util.ArrayList;


import beans.Calca;

public class RepositorioCalca implements IRepositorioCalca {

	private ArrayList<Calca> calca;

	
	public RepositorioCalca(){
		
		
		this.calca = new ArrayList<Calca>();

	}
	
	@Override
	public void cadastrar(Object objeto) {

		if(objeto instanceof Calca){
			
			this.calca.add((Calca) objeto);
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public void buscar(Object objeto) {
		

		
		if(objeto instanceof Calca){
			
			for(int cont = 0;cont<= this.calca.size();cont++){
				
				Calca aux = this.calca.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		
	}// FIM CLASSE BUSCAR

	@Override
	public void remover(Object objeto) {
		
	
		if(objeto instanceof Calca){
			
			for(int cont = 0;cont<= this.calca.size();cont++){
				
				Calca aux = this.calca.get(cont);
				
				  if(aux.equals(objeto)){
					
					this.calca.remove(cont);
					
				}
				
			}
			
		}
		
	
	}// FIM CLASSE REMOVER

	@Override
	public void atualizar(Object objeto) {
		
	
		
		if(objeto instanceof Calca){
			
			for(int cont = 0;cont<= this.calca.size();cont++){
				
				Calca aux = this.calca.get(cont);
				
				  if(aux.equals(objeto)){
					
					  calca.set(cont,((Calca)objeto));
					
				}
				
			}
			
		} 
		
	
		
	}// FIM CLASSE ATUALIZAR

	
	
}
