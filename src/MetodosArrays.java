//import jdk.internal.misc.FileSystemOption;

public class MetodosArrays {

	// Exe 1 Faça um metodo chamado exercicio1 que recebe um array de inteiros e imprima-o ao contrário.
	public static void pressContrario(int[] array) {
		for (int i = array.length -1; i >= 0; i--) {
			System.out.println(array[i]);//se somente colocar i vai mostrar a posição do array
		}
	}
	
	//Exe 3 Faça um método recebe um array de inteirose retorna um novo array que contém somente os valores pares do array recebido
	public static void retornaPar(int[] arrayInteiro) {
		//para descobrir quantos N par tem o array recebido e o novo array com número certo
		int numerosDePar = 0;
		
		for(int i = 0; i < arrayInteiro.length; i++) {
			if(arrayInteiro[i] % 2 == 0) {
				numerosDePar++;
			}
		}
	
		//Novo array e auxiliar para rodar esse novo array
		int[] arrayAux = new int[numerosDePar];{
			int auxIf = 0;
			
			for(int auxJ = 0; auxJ < arrayInteiro.length; auxJ++) {
				if(arrayInteiro[auxJ] % 2 == 0) {
					arrayAux[auxIf] = arrayInteiro[auxJ];
					auxIf++;
				}
			}
			System.out.println("Tamanho do Array Auxiliar: " + arrayAux.length);
			for(int j = 0; j < arrayAux.length; j++) {
				System.out.println("Os números pares são: " + arrayAux[j]);
			}
		}
	}
	
	//Exe 4 Faça um método q recebe um array de String e uma String x por  parâmetro.
	//Este  método  retorna  a  posição  em  que a  String  x  está  no  array,  ou -1  se  a String x não estiver no array.
	public static int retornaPosicao(String[] nomes, String nomeEncontrar) {
		for(int i = 0; i < nomes.length; i++) {
			if(nomes[i].equalsIgnoreCase(nomeEncontrar)) {
				return i;
			}
		}
		return -1;
	}
	
	//Exe5 Faça um método q recebe um array de boolean e 
	//retorna um array de inteiros contendo 1 nas posições que são true e 0 nas posições que são false.
	public static void zeroUm(boolean[] arrayDeBoolean) {
		int auxVoltar[] = new int[arrayDeBoolean.length];
		
		for(int i = 0; i < arrayDeBoolean.length; i++) {
			
				if(arrayDeBoolean[i] == false) {
					auxVoltar[i] = 1;
				} else {
					auxVoltar[i] = 0;
				}
			
		}
		for(int i = 0; i < auxVoltar.length; i++) {
			System.out.println(auxVoltar[i]);
		}
	}
	
	//Exe6 Faça um método q recebe dois arrays de inteiros, e retorna um terceiro array com todos os elementos dos dois arrays.
	public static void terceiroArray(int[] primeiroArray, int[] segundoArray) {
		int[] arrayTerceiro = new int[primeiroArray.length + segundoArray.length];
		int auxIndiceArray = 0;
		
		for(int i = 0; i < primeiroArray.length; i++) {
			arrayTerceiro[auxIndiceArray] = primeiroArray[i];
			auxIndiceArray++;
		}
		for(int i = 0; i < segundoArray.length; i++) {
			arrayTerceiro[auxIndiceArray] = segundoArray[i];
			auxIndiceArray++;
		}
		
		System.out.println("Tamanho do arrey: "+arrayTerceiro.length);
		for(int i = 0; i < arrayTerceiro.length; i++) {
			System.out.println("Valor na posição "+i+" é: "+arrayTerceiro[i]);
		}
	}
	
	//Exe7 Faça um método q recebe dois arrays de inteiros, e retorna um terceiro array que possui todos os elementos
	//negativos (dos dois arrays) na primeira parte e todos os elementos positivos (inclusive o zero) na segunda parte (dos dois arrays).
	public static void arrayMenosMais(int[] primeiroArray, int[] segundoArray) {
		int[] arrayTerceiro = new int[primeiroArray.length + segundoArray.length];
		int auxIndiceArray = 0;
		
		for(int i = 0; i < primeiroArray.length; i++) {
			arrayTerceiro[auxIndiceArray] = primeiroArray[i];
			auxIndiceArray++;
		}
		for(int i = 0; i < segundoArray.length; i++) {
			arrayTerceiro[auxIndiceArray] = segundoArray[i];
			auxIndiceArray++;
		}
		/*
		//metodo para trocar os números, se for maior que o próximo, faz a troca
		for(int i = 0; i < arrayTerceiro.length; i++) {
			if(i+1 == arrayTerceiro.length) {
				break;
			}
			if(arrayTerceiro[i] > arrayTerceiro[i+1]) {
				int[]aux = new int[1];
				aux[0] = arrayTerceiro[i];
				arrayTerceiro[i] = arrayTerceiro[i+1];
				arrayTerceiro[i+1] = aux[0];
				//System.out.println(arrayTerceiro[i]);
			}
		}
		*/
		
		for(int i = 0; i < arrayTerceiro.length; i++) {
			System.out.println("Valor na posição "+i+" é: "+arrayTerceiro[i]);
		}
	}
	
	//Exe8 Faça um método chamado q recebe um array de char e imprime na tela (na mesma linha) todos os elementos do array
	public static void imprimeChar(char[] recebeChar) {
		for(int i = 0; i < recebeChar.length; i++) {
			System.out.print(recebeChar[i]);
		}
	}
	
	
	//Exe1 Crie um método que retorna oarray bidimensional de inteiros
	public static int[][] arrayBidim(){
		int[][] arrayBi = new int[3][10];
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				arrayBi[linha][coluna] = coluna; //recebe UM VALOR o posição do eixo xy
			}
		}
		return arrayBi;
	}
	
	
	//Exe2 Crie um método que retorna oarray bidimensional maior que o anterior de int
	public static void arrayBidimensionalMaior() {
		int [][] arrayBidim = new int [5][10];
		
		for(int linha = 0; linha < arrayBidim.length; linha++) {
			for(int coluna = 0; coluna < arrayBidim[linha].length; coluna++) {
				System.out.print(arrayBidim[linha][coluna] = coluna * coluna);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	//Exe3
	public static int[][] arrayBidimensional1ao5 (){
		int [][] arrayBidim = new int[6][6];
		int aux = 0;
		for(int linha = 0; linha < arrayBidim.length; linha++) {
			aux = 0;
			for(int coluna = 0; coluna < arrayBidim[linha].length; coluna++) {
				arrayBidim[linha][coluna] = aux;
				aux++;
			}
		}
		return arrayBidim;
	}
	
	//Exe2
	
	
	
	
	
	
}
