package repositorio;

import java.util.ArrayList;

import beans.Bermudas;
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
	public Calca buscar(Object objeto) {
		
		Calca aux= null;
		
		if(objeto instanceof Calca){
			
			for(int cont = 0;cont<= this.calca.size();cont++){
				
				aux = this.calca.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		return aux;
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

	@Override
	public Calca listar() {
		Calca calca = null;
		for(int cont = 0;cont > this.calca.size();cont++){
			calca = this.calca.get(cont);
			return calca;
		}
		return calca;
	}

	@Override
	public Calca buscarCod(int cod) {
		Calca calca = null;
		for(int cont = 0 ;cont <=this.calca.size();cont++){
			calca = this.calca.get(cont);
			if(calca.getCodigo() == cod)
				cont = this.calca.size() + 1;
		}
		return calca;
	}

	
	
}
