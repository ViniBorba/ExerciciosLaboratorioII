package Recursao;

public class RecursaoPrincipal {

	public static void main(String[] args) {
		
		int[] arrayDeInt = new int[10];
		for(int i = 0; i < arrayDeInt.length; i++ ) {
			arrayDeInt[i] = i + 1;
		}
		RecursaoPrincipal.imprimeArrayAoContrario(arrayDeInt, arrayDeInt.length - 1);
		
		double[][] arrayBidiDouble = new double [5][5];
		for(int i = 0; i < arrayBidiDouble.length; i++) {
			//double d = i;
			//arrayBidiDouble[i] = 1.0;
			for(int j =0; j < arrayBidiDouble[i].length; j++) {
				arrayBidiDouble[i][j] = j+1;
			}
		}

	}
	
	//método recursivo que imprime um array recebido por parâmetro de trás para frente
	public static void imprimeArrayAoContrario(int[] array, int indice) {
		if(indice >= 0) {
			System.out.println(array[indice]);
			indice --;
			RecursaoPrincipal.imprimeArrayAoContrario(array, indice);
		}
	}
	
	//método  recursivo  que  recebe  um  array  bidimensional  de  double  e retorna a soma dos elementos deste array
	
	
	
	
	
	

}
