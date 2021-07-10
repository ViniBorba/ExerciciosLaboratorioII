package ExeListas;

public class MeioDeTransporte {
	private String nome;
	private String marca;
	
	public MeioDeTransporte(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public MeioDeTransporte menorNome(SinglyLinkedList<MeioDeTransporte> lista) {
		if(lista == null)
			throw new IllegalArgumentException();
		//caso a lista tenha somente um elemento, ele nem precisa contar
		if(lista.numElements() == 0)
			return lista.get(0);
		
		int qtdLetras = lista.get(0).getNome().length();
		MeioDeTransporte MTcomMenorNome = null;
		return menorNome(lista, qtdLetras, MTcomMenorNome, 1);
	}
	private MeioDeTransporte menorNome(SinglyLinkedList<MeioDeTransporte> lista, int qLetras, MeioDeTransporte voltaMenorNome, int aux) {
		if(aux >= lista.numElements())
			return voltaMenorNome;
		if(qLetras < lista.get(aux).getNome().length()) {
			voltaMenorNome = lista.get(aux);
			qLetras = lista.get(aux).getNome().length();
		}
		return menorNome(lista, qLetras, voltaMenorNome, aux +1);
	}

}
