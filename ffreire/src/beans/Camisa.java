package beans;

public class Camisa {
	
	private	TamanhoCamisa tamanho;
	private	double preco;
	private	String cor;
	private TipoCamisa tipo;
	private	String descricao;
	private int codigoCamisa;
	static private int cont = 4403;
	private int quantidade;
	private String img;
	
	public Camisa(TamanhoCamisa tamanho, double preco, String cor, TipoCamisa tipo, String descricao){
		this.codigoCamisa = cont;
		Camisa.aumentaCod();
		this.tamanho = tamanho;
		this.preco = preco;
		this.cor = cor;
		this.tipo = tipo;
		this.descricao = descricao;
		aumentarQtd();
	}
	
	public int getCodigo(){
		return this.codigoCamisa;
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
		return cor;
	}

	public void setCorEstampa(String cor) {
		this.cor = cor;
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
	
	public void aumentarQtd(){
		this.quantidade++;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
	
}
