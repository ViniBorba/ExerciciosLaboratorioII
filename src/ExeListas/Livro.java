package ExeListas;

public class Livro {
	private String autor;
	private String titulo;
	private int anoPublicado;
	
	public Livro(String autor, String titulo, int ano) {
		this.setAnoPublicado(ano);
		this.setAutor(autor);
		this.setTitulo(titulo);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicado() {
		return anoPublicado;
	}

	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}
	
	public void eliminaLivrosAntigos(StaticQieue<Livro> filaLivros) {
		Livro[] aux = new Livro[filaLivros.numElements()];
		int i = 0;
		while(filaLivros.isEmpty()) {
			Livro rm = filaLivros.dequeue();
			if(rm.getAnoPublicado() < 2000) {
				aux[i] = rm;
				i++;
			}
		}
		for(int j=0; j<i; j++)
			filaLivros.enqueue(aux[j]);
	}

}
