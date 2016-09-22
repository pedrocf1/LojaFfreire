package repositorio;

import java.util.ArrayList;

import beans.Bermudas;
import beans.Camisa;

public class RepositorioCamisa implements IRepositorioCamisa {
	
	private ArrayList<Camisa> camisa;

	
	public RepositorioCamisa(){
		
		
		this.camisa = new ArrayList<Camisa>();

	}
	
	@Override
	public void cadastrar(Object objeto) {

		if(objeto instanceof Camisa){
			
			this.camisa.add((Camisa) objeto);
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public Camisa buscar(Object objeto) {
		
		Camisa aux = null;
		
		if(objeto instanceof Camisa){
			
			for(int cont = 0;cont<= this.camisa.size();cont++){
				
				 aux = this.camisa.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		return aux;
	}// FIM CLASSE BUSCAR
	

	@Override
	public void remover(Object objeto) {
		
	
		if(objeto instanceof Camisa){
			
			for(int cont = 0;cont<= this.camisa.size();cont++){
				
				Camisa aux = this.camisa.get(cont);
				
				  if(aux.equals(objeto)){
					
					this.camisa.remove(cont);
					
				}
				
			}
			
		}
		
	
	}// FIM CLASSE REMOVER

	@Override
	public void atualizar(Object objeto) {
		
	
		
		if(objeto instanceof Camisa){
			
			for(int cont = 0;cont<= this.camisa.size();cont++){
				
				Camisa aux = this.camisa.get(cont);
				
				  if(aux.equals(objeto)){
					
					  camisa.set(cont,((Camisa)objeto));
					
				}
				
			}
			
		} 
		
	
		
	}// FIM CLASSE ATUALIZAR

	@Override
	public Camisa listar() {
		Camisa camisa = null;
		for(int cont = 0;cont > this.camisa.size();cont++){
			camisa = this.camisa.get(cont);
			return camisa;
		}
		return camisa;
	}

	@Override
	public Camisa bucarCod(int cod) {
		Camisa camisa = null;
		for(int cont = 0;cont <=this.camisa.size();cont++){
			camisa = this.camisa.get(cont);
			if (camisa.getCodigo() == cod)
				cont = this.camisa.size() +1;
		}
		return camisa;
	}

}
 