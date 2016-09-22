package beans;

public class Camisa {
	
	private	TamanhoCamisa tamanho;
	private	double preco;
	private	String corEstampa;
	private TipoCamisa tipo;
	private	String descricao;
	private int codigoCamisa;
	static private int cont = 2203;
	
	
	public Camisa(TamanhoCamisa tamanho, double preco, String corEstampa, TipoCamisa tipo, String descricao){
		this.codigoCamisa = cont;
		Camisa.aumentaCod();
		this.tamanho = tamanho;
		this.preco = preco;
		this.corEstampa = corEstampa;
		this.tipo = tipo;
		this.descricao = descricao;
		
	}
	
	public int getCodigo(){
		return this.codigoCamisa;
	}
	
	
	public static void aumentaCod(){
		cont++;
	}

	public TamanhoCamisa getTamanho() {
		return tamanho;
	}

	public void setTamanho(TamanhoCamisa tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCorEstampa() {
		return corEstampa;
	}

	public void setCorEstampa(String corEstampa) {
		this.corEstampa = corEstampa;
	}

	public TipoCamisa getTipo() {
		return tipo;
	}

	public void setTipo(TipoCamisa tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
