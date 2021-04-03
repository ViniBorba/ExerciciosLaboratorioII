package Recursao;

public class RecursaoPrincipal {

	public static void main(String[] args) {
		
		//Exe 1
		int[] arrayDeInt = new int[10];
		for(int i = 0; i < arrayDeInt.length; i++ ) {
			arrayDeInt[i] = i + 1;
		}
		arrayDeInt[3] = -2;
		//RecursaoPrincipal.imprimeArrayAoContrario(arrayDeInt, arrayDeInt.length - 1);
		
		//Exe 2
		double[][] arrayBidiDouble = new double [3][3];
		for(int i = 0; i < arrayBidiDouble.length; i++) {
			//double d = i;
			//arrayBidiDouble[i] = 1.0;
			for(int j =0; j < arrayBidiDouble[i].length; j++) {
				arrayBidiDouble[i][j] = j+1;
			}
		}
		System.out.println(RecursaoPrincipal.somaBidimensional(arrayBidiDouble));
		//RecursaoPrincipal.somaBidimensional(arrayBidiDouble);
		
		//Exe 3
		System.out.println(RecursaoPrincipal.encontraPosicaoMenorValor(arrayDeInt));
		
		
		
		

	}
	
	//Exe 1 método recursivo que imprime um array recebido por parâmetro de trás para frente
	public static void imprimeArrayAoContrario(int[] array, int indice) {
		if(indice >= 0) {
			System.out.println(array[indice]);
			indice --;
			RecursaoPrincipal.imprimeArrayAoContrario(array, indice);
		}
	}
	
	//Exe 2 método  recursivo  que  recebe  um  array  bidimensional  de  double  e retorna a soma dos elementos deste array
	public static double somaBidimensional(double[][] arrayBidi) {
		return somaBidimensional(arrayBidi, 0, 0);//vou te retornar esse método que é um metodo que retorna um double
	}
	private static double somaBidimensional(double[][] arrayBidi, int linha, int coluna) {
		if(linha >= arrayBidi.length) {
			return 0;//quando não tiver mais linhas eu retorno zero	
		}
		if(coluna >= arrayBidi[linha].length) {
			return somaBidimensional(arrayBidi, linha + 1, 0);//quando terminar as colunas eu vou para a próxima linha
		}
		
		return arrayBidi[linha][coluna] + somaBidimensional(arrayBidi, linha, coluna +1);//quando terminar linhas e colunas e retorno a soma de traz pra frente
	}
	
	//Exe 3 rie  um  método  chamado  encontraPosicaoMenorValor.
	//encontrar  a  posição  do  menor  valor  de  um  array  de  inteiros  recebido  por parâmetro
	public static int encontraPosicaoMenorValor(int[] arrayInt) throws IllegalArgumentException {
		if(arrayInt == null) {
			throw new IllegalArgumentException();
		}
		return encontraPosicaoMenorValor(arrayInt, 1, 0); 
	}
	private static int encontraPosicaoMenorValor(int[] array, int indice, int menorValor) {
		if(indice >= array.length) {//verefica que ainda tem indice pra percorrer
			return menorValor;//se acabou o array retorna o menor valor
		}
		if(array[indice] < array[menorValor]) {
			menorValor = indice;//se existier um valor menor, armaxena o indice desse valor
		}
		return encontraPosicaoMenorValor(array, indice +1, menorValor);//chama o metodo até entrar no primeiro if
	}
	
	

	
	
	
	

}
