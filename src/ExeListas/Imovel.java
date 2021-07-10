package ExeListas;

public class Imovel {
	
	private String endereco;
	private double valorAluguel;
	
	public Imovel(String endereco, double valor) {
		this.endereco = endereco;
		this.valorAluguel = valor;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public void eliminaImoveisCaros(StaticQieue<Imovel> imoveis) {
		Imovel[] aux = new Imovel[imoveis.numElements()]; 
		int i=0; 
		while(!imoveis.isEmpty()) { 
			Imovel im = imoveis.dequeue(); 
			if(im.getValorAluguel() <= 2500) { 
				aux[i] = im; 
				i++; 
			} 
		} 
		for(int j=0; j<i; j++) 
			imoveis.enqueue(aux[j]); 
	}

}
