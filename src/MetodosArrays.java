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
	
	
}
