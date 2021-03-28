package ExeProdutos;

import java.util.Date;

public class Alimento extends Produto {
	private Date validade;//atributo só do alimento
	
	//Construtor
	Alimento(String nome, String descreve, double preco, String tipo, Date data){
		super(nome, descreve, preco, tipo);//atributos geral dos produtos
		this.validade = data;
	}
	
	
}
