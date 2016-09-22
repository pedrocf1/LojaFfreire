package beans;

public class Bermudas{
	
private	int tamanho;
private	double preco;
private	TipoBermuda tipo;
private	String cor;
private	String descricao;
private int codigoBerm;
static private int cont = 2201;

	public Bermudas(int tamanho, double preco, TipoBermuda tipo, String cor, String descricao) {
		this.codigoBerm = cont;
		Bermudas.aumentarCod();
		this.tamanho = tamanho;
		this.preco = preco;
		this.tipo = tipo;
		this.cor = cor;
		this.descricao = descricao;
	}
	
	public static void aumentarCod(){
		cont++;
		
	}
	
	public int getCodigo(){
		return this.codigoBerm;
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

	public TipoBermuda getTipo() {
		return tipo;
	}

	public void setTipo(TipoBermuda tipo) {
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
