package ExeProdutos;

public abstract class Produto {
	private String nome;
	private String descricao;
	private double preco;
	private String tipo;
	
	//construtor
	Produto(String nome, String descreve, double preco, String tipo){
		this.nome = nome;
		this.descricao = descreve;
		this.preco = preco;
		this.tipo = tipo;
	}

}
