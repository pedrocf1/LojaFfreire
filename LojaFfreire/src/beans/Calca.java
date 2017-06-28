package beans;

public class Calca {
	
private	int tamanho;
private	double preco;
private	TipoCalca tipo;
private	String cor;
private	String descricao;
private int codigoCalca;
static private int cont = 3302;
private int quantidade;
private String img;

public Calca(){}

	public Calca(int tamanho, double preco, TipoCalca tipo, String cor, String descricao) {
		this.codigoCalca = cont;
		Calca.aumentaCod();
		this.tamanho = tamanho;
		this.preco = preco;
		this.tipo = tipo;
		this.cor = cor;
		this.descricao = descricao;
		aumentarQtd();
	}
	
	public static void aumentaCod(){
		cont++;
	}
	
	public int getCodigo(){
		return this.codigoCalca;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
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

	public TipoCalca getTipo() {
		return tipo;
	}

	public void setTipo(TipoCalca tipo) {
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
	
	
	public void aumentarQtd(){
		this.quantidade++;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	

}
