package beans;

public class Funcionario extends Pessoa {

	
	static private int cont= 1;
	private int numId;
	private String login;
	private String senha;
	
	public Funcionario(String nome, String cpf, String telefone, String email,String login,String senha) {
		super(nome, cpf, telefone,email);
		this.numId = cont;
		Funcionario.aumentarId();
		this.login = login;
		this.senha = senha;
	}
	
	public static void aumentarId(){
		cont++;
		
	}
	
	public int getNumId(){
		return numId;		
	}
	
	
	public String getLogin(){
		return this.login;
	
	}

	public String getSenha(){
		return this.senha;
	}
}
