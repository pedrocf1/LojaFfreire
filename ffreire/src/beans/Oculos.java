package beans;

public class Oculos {
	
	private	String genero;
	private	TipoOculos tipo;
	private	String cor;
	private	String descricao;
	
	public Oculos(String genero, TipoOculos tipo, String cor, String descricao) {
		
		this.genero = genero;
		this.tipo = tipo;
		this.cor = cor;
		this.descricao = descricao;
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

	

	
	
}
