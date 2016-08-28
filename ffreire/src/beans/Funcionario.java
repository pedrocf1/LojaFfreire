package beans;

public class Funcionario extends Pessoa {

	
	static private int cont= 1;
	private int numId;
	
	public Funcionario(String nome, String cpf, String telefone, String email) {
		super(nome, cpf, telefone,email);
		this.numId = cont;
		Funcionario.aumentarId();
		
	}
	
	public static void aumentarId(){
		cont++;
		
	}
	
	public int getNumId(){
		return numId;		
	}
	
	
	

}
