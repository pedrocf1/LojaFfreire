package repositorio;

import java.util.ArrayList;

import beans.Bermudas;


public class RepositorioBermudas implements IRepositorioBermudas {

	
	
	private ArrayList<Bermudas> bermuda;

	
	public RepositorioBermudas(){
		
		
		this.bermuda = new ArrayList<Bermudas>();

	}
	
	@Override
	public void cadastrar(Bermudas berm) {

			this.bermuda.add(berm);
				
	}// FIM CLASSE CADASTRAR

	@Override
	public Bermudas buscar(Object objeto) {
		
		Bermudas aux = null;
		
		if(objeto instanceof Bermudas){
			
						
			for(int cont = 0;cont<= this.bermuda.size();cont++){
				
				aux = this.bermuda.get(cont);
				
				  if(aux.equals(objeto)){
					
					cont = 1 + bermuda.size();
					
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

	@Override
	public Bermudas listar() {
		
		Bermudas berm = null;
		for(int cont = 0;cont <= this.bermuda.size();cont++){
			berm = this.bermuda.get(cont);
			return berm;
		}
		return berm;
	}

	@Override
	public Bermudas buscarCod(int cod) {
		Bermudas berm = null;
		
		for(int cont = 0;cont <=this.bermuda.size();cont++){
			berm = this.bermuda.get(cont);
			if(berm.getCodigo() == cod)
				cont = this.bermuda.size() + 1;
		}
		
		return berm;
	}

}
