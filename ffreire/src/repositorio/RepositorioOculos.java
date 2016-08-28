package repositorio;

import java.util.ArrayList;

import beans.Oculos;

public class RepositorioOculos implements IRepositorioOculos {
	
	private ArrayList<Oculos> oculos;

	
	public RepositorioOculos(){
		
		
		this.oculos = new ArrayList<Oculos>();

	}
	
	@Override
	public void cadastrar(Object objeto) {

		if(objeto instanceof Oculos){
			
			this.oculos.add((Oculos) objeto);
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public void buscar(Object objeto) {
		

		
		if(objeto instanceof Oculos){
			
			for(int cont = 0;cont<= this.oculos.size();cont++){
				
				Oculos aux = this.oculos.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		
	}// FIM CLASSE BUSCAR

	@Override
	public void remover(Object objeto) {
		
	
		if(objeto instanceof Oculos){
			
			for(int cont = 0;cont<= this.oculos.size();cont++){
				
				Oculos aux = this.oculos.get(cont);
				
				  if(aux.equals(objeto)){
					
					this.oculos.remove(cont);
					
				}
				
			}
			
		}
		
	
	}// FIM CLASSE REMOVER

	@Override
	public void atualizar(Object objeto) {
		
	
		
		if(objeto instanceof Oculos){
			
			for(int cont = 0;cont<= this.oculos.size();cont++){
				
				Oculos aux = this.oculos.get(cont);
				
				  if(aux.equals(objeto)){
					
					  oculos.set(cont,((Oculos)objeto));
					
				}
				
			}
			
		} 
		
	
		
	}// FIM CLASSE ATUALIZAR

}
