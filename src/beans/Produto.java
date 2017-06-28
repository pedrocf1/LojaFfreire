package beans;

public class Produto {
	
	private String nome;
	private int tamanho;
	private double preco;
	private String descricao;
	private int codigo;
	private int subCodigo;
	private int quantidade;
	private String imagem;



		public Produto(String nome, int tamanho, double preco, String descricao,int codigo,int subCodigo, int quantidade, String imagem){
			this.nome = nome;
			this.tamanho = tamanho;
			this.preco = preco;
			this.descricao = descricao;
			this.subCodigo = subCodigo;
			this.quantidade = quantidade;
			this.imagem = imagem;
			
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



		public String getDescricao() {
			return descricao;
		}



		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}



		public int getCodigo() {
			return codigo;
		}



		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}



		public int getSubCodigo() {
			return subCodigo;
		}



		public void setSubCodigo(int subCodigo) {
			this.subCodigo = subCodigo;
		}



		public int getQuantidade() {
			return quantidade;
		}



		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}



		public String getImagem() {
			return imagem;
		}



		public void setImagem(String imagem) {
			this.imagem = imagem;
		}
		
		

}
