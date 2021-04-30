package MetodosOrdenacao;

public class TerminalOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 3, 2, 4, 1};
		
		TerminalOrdenacao.insercaoDireta(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static int[] insercaoDireta(int[] array) {
		for(int i =0; i < array.length; i++) {
			int j =i; //posicao do primeiro elemento no segmento não ordenado
			int B = array[i]; //primeiro elemento no segmento não ordenado
			while((j>0) && (array[j-1]>B)) { //buscando posicao do primeiro elemento do segmento nao ordenado no segmento ordenado
				array[j] = array[j-1]; //
				j--;
			}
			array[j] = B;
		}
		
		return array;
	}

}
