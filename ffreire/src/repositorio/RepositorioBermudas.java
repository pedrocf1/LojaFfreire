package repositorio;

import java.util.ArrayList;

import beans.Bermudas;


public class RepositorioBermudas implements IRepositorioBermudas {

	
	
	private ArrayList<Bermudas> bermuda;

	
	public RepositorioBermudas(){
		
		
		this.bermuda = new ArrayList<Bermudas>();

	}
	
	@Override
	public void cadastrar(Object objeto) {

		if(objeto instanceof Bermudas){
			
			this.bermuda.add((Bermudas) objeto);
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public Bermudas buscar(Object objeto) {
		
		Bermudas aux = null;
		
		if(objeto instanceof Bermudas){
			
						
			for(int cont = 0;cont<= this.bermuda.size();cont++){
				
				aux = this.bermuda.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		} 
		
		return aux;
	}// FIM CLASSE BUSCAR

	@Override
	public void remover(Object objeto) {
		
	
		if(objeto instanceof Bermudas){
			
			for(int cont = 0;cont<= this.bermuda.size();cont++){
				
				Bermudas aux = this.bermuda.get(cont);
				
				  if(aux.equals(objeto)){
					
					this.bermuda.remove(cont);
					
				}
				
			}
			
		} 
		
	
	}// FIM CLASSE REMOVER

	@Override
	public void atualizar(Object objeto) {
		
	
		
		if(objeto instanceof Bermudas){
			
			for(int cont = 0;cont<= this.bermuda.size();cont++){
				
				Bermudas aux = this.bermuda.get(cont);
				
				  if(aux.equals(objeto)){
					
					  bermuda.set(cont,((Bermudas)objeto));
					
				}
				
			}
			
		} // FIM ATUALIZAR BERMUDA
		
	
		
	}// FIM CLASSE ATUALIZAR

}
