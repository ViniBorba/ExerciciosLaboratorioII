package ExeListas;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		this.setNome(nome);
		this.setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto maisBarato(SinglyLinkedList<Produto> listaProdutos) throws IllegalArgumentException{
		if(listaProdutos == null)
			throw new IllegalArgumentException();
		
		int posicaoDoMaisBarato = 0;
		
		return maisBarato(listaProdutos, 0, posicaoDoMaisBarato);
	}
	private Produto maisBarato(SinglyLinkedList<Produto> listaProdutos, int percorreLista, int posicaoDoMaisBarato) {
		if(percorreLista >= listaProdutos.numElements()) 
			return listaProdutos.get(posicaoDoMaisBarato);//sai do loop
		
		if(listaProdutos.get(percorreLista).getPreco() < listaProdutos.get(posicaoDoMaisBarato).getPreco()) 
			posicaoDoMaisBarato = percorreLista; 
		
		return maisBarato(listaProdutos, percorreLista+1, posicaoDoMaisBarato);
	}

}
