package beans;

public class Oculos {
	
	private	String genero;
	private	TipoOculos tipo;
	private	String cor;
	private	String descricao;
	private double preco;
	private int codigoOculos;
	static private int cont = 5503;
	private int quantidade;
	private String img;
	
	public Oculos(String genero, TipoOculos tipo, String cor, String descricao,double preco) {
		this.codigoOculos = cont;
		Oculos.aumentaCod();
		this.preco = preco;
		this.genero = genero;
		this.tipo = tipo;
		this.cor = cor;
		this.descricao = descricao;
		aumentarQtd();
	}
	
	public int getCodigo(){
		return this.codigoOculos;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public TipoOculos getTipo() {
		return tipo;
	}

	public void setTipo(TipoOculos tipo) {
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
	
	public double getPreco(){
		return this.preco;
	}

	public void aumentarQtd(){
		this.quantidade++;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	

	
	
}
