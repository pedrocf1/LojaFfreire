package beans;

public class Camisa {
	
	private	TamanhoCamisa tamanho;
	private	double preco;
	private	String corEstampa;
	private TipoCamisa tipo;
	private	String descricao;
	
	public Camisa(TamanhoCamisa tamanho, double preco, String corEstampa, TipoCamisa tipo, String descricao){
		
		this.tamanho = tamanho;
		this.preco = preco;
		this.corEstampa = corEstampa;
		this.tipo = tipo;
		this.descricao = descricao;
		
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
