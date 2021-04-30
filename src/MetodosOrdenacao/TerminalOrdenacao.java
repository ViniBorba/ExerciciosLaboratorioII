package MetodosOrdenacao;

public class TerminalOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 3, 2, 4, 1};
		
		TerminalOrdenacao.bubblesort(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	//Metodo de ordenacao Insercao Direta (insertion sort)
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
	
	//Metodo de ordenacao Seleção Direta (selection Sort)
	public static int[] selecaoDireta(int[] array) {
		int min =0;
		for(int i =0; i < array.length; i++) {
			min = i; //minimo inicial, aumentando o minimo depois que organizado
			for(int j = i+1; j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j; //acha o novo minimo
				}
			}
			int T = array[i]; //coloca o no minimo
			array[i] = array[min]; //na posicao correta
			array[min] = T;
		}
		
		return array;
	}
	
	//Metodo de ordenacao Método da Bolha (Bubblesort)
	public static int[] bubblesort(int[] array) {
		int i = array.length -1;
		while(i > 0) {
			int lastFlipped = 0;
			for(int j =0; j < i; j++) {
				if(array[j] > array[j+1]) { //se for maior vamos trocar a posicao
					int T = array[j];
					array[j] = array[j+1];
					array[j+1] = T;
					lastFlipped = j;
				}
			}
			i = lastFlipped;
		}
		
		return array;
	}

}
