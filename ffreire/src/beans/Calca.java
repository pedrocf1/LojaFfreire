package beans;

public class Calca {
	
private	int tamanho;
private	double preco;
private	TipoCamisa tipo;
private	String cor;
private	String descricao;
	
	public Calca(int tamanho, double preco, TipoCamisa tipo, String cor, String descricao) {
		
		this.tamanho = tamanho;
		this.preco = preco;
		this.tipo = tipo;
		this.cor = cor;
		this.descricao = descricao;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public TipoCamisa getTipo() {
		return tipo;
	}

	public void setTipo(TipoCamisa tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
	
	

}
