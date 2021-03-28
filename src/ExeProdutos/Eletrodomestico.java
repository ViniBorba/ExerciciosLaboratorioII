package ExeProdutos;

public class Eletrodomestico extends Produto {
	private double adicionalIPI;//atributo exclusivo do Eletrodomestico
	
	//Construtor
	Eletrodomestico(String nome, String descreve, double preco, String tipo, double valorIPI){
		super(nome, descreve, preco, tipo);//atributos comuns
		this.adicionalIPI = valorIPI;
	}
}
