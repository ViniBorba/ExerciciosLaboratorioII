package ExeProdutos;

public class Vestuario extends Produto {
	private int qtdEmEstoque;//atributo exclusivo do vestuario
	
	//Construtor
	Vestuario(String nome, String descreve, double preco, String tipo, int quantiaEmEstoque){
		super(nome, descreve, preco, tipo);//atributos de todos os produtos 
		this.qtdEmEstoque = quantiaEmEstoque;
	}
	
	public String getNome() {
		return super.getNome();
	}
}
