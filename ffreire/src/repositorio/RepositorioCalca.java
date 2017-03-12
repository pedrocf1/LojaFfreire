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
	public void cadastrar(Calca calca) {
//			this.calca.add(calca);
		
		if(this.calca.size() == 0){
			this.calca.add(calca);
		}else if(this.calca.size() != 0){
			for(int i=0;i<=this.calca.size();i++){
								
				if(i>0){
					if(this.calca.get(i-1).equals(calca)){
						this.calca.get(i-1).aumentarQtd();
					}
				}else if(i == this.calca.size()-1){
					this.calca.add(calca);
				}
				
				
			}
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
	public ArrayList<Calca> listar() {

		return this.calca;
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
