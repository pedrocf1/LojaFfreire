package repositorio;

import java.util.ArrayList;

import beans.Bermudas;
import beans.Oculos;

public class RepositorioOculos implements IRepositorioOculos {
	
	private ArrayList<Oculos> oculos;

	
	public RepositorioOculos(){
		
		
		this.oculos = new ArrayList<Oculos>();

	}
	
	@Override
	public void cadastrar(Oculos oculos) {
		//this.oculos.add(oculos);
		
		if(this.oculos.size() == 0){
			this.oculos.add(oculos);
		}else if(this.oculos.size() != 0){
			for(int i=0;i<=this.oculos.size();i++){
				
				
				if(i>0){
					if(this.oculos.get(i-1).equals(oculos)){
						this.oculos.get(i-1).aumentarQtd();
					}
				}else if(i == this.oculos.size()-1){
					this.oculos.add(oculos);
				}
				
				
			}
		}

		
	}// FIM CLASSE CADASTRAR

	@Override
	public Oculos buscar(Object objeto) {
		
		Oculos aux = null;
		
		if(objeto instanceof Oculos){
			
			for(int cont = 0;cont<= this.oculos.size();cont++){
				
				aux = this.oculos.get(cont);
				
				  if(aux.equals(objeto)){
					
					
					
				}
				
			}
			
		}
		
		return aux;
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

	@Override
	public ArrayList<Oculos> listar() {

		return this.oculos;
	}

	@Override
	public Oculos buscarCod(int cod) {
		Oculos oculos = null;
		for(int cont = 0;cont<=this.oculos.size();cont++){
			oculos = this.oculos.get(cont);
			if(oculos.getCodigo() == cod)
			cont = this.oculos.size() + 1;
		}
		return null;
	}

}
