package Recursao;

public class SgundaParte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayDeInt = {1,2,3,4};
		
		//Exe1
		System.out.println(SgundaParte.vOuF(arrayDeInt, 0));
		
		//Exe3
		System.out.println(SgundaParte.viraString("vini").toString());
		
		//Exe4
		System.out.println(SgundaParte.somar(3));


	}
	
	// Exe1 método recursivo que recebe um array de int e um int N, retorna verdadeiro caso o int N esteja presente no array, ou falso caso contrário
	public static boolean vOuF(int[] arrayDeInt, int verefica) throws IllegalArgumentException {
		if(arrayDeInt == null) {
			throw new IllegalArgumentException();
		}
		int tamanhoArray = arrayDeInt.length;
		return vOuF(arrayDeInt, verefica, tamanhoArray);
	}
	private static boolean vOuF(int[] arrayDeInt, int verefica, int tamanhoArray) {
		if(tamanhoArray > 0) {
			if(arrayDeInt[arrayDeInt.length - tamanhoArray] == verefica) {
				return true;
			} else {
				return vOuF(arrayDeInt, verefica, tamanhoArray -1);
			}
		}
		return false;
	}
	
	
	//Exe2 método recursivo que recebe um inteiro N por parâmetro e retorna verdadeiro caso ele seja um número primo e falso caso contrário
	
	
	
	//Exe3 Crie um método recursivo que recebe uma String e retorna uma nova String, que é a String de entrada invertida.
	public static String viraString(String palavra) throws IllegalArgumentException {
		if(palavra == null) {
			throw new IllegalArgumentException();
		}
		char[] arrayDaPalavra = new char[palavra.length()];
		int indicePalavra = palavra.length();
		return viraString(palavra, arrayDaPalavra, indicePalavra -1, 0);
	}
	private static String viraString(String palavra, char[] arrayDaPalavra, int indicePalavra, int indiceChar) {
		if(indicePalavra >= 0) {
			arrayDaPalavra[indiceChar] = palavra.charAt(indicePalavra);
			return viraString(palavra, arrayDaPalavra, indicePalavra -1, indiceChar +1);
		}
		
		return String.copyValueOf(arrayDaPalavra);//transforma array de char em palavra
	}
	
	//Exe4 método recursivo que recebe um inteiro positivo (e maior que 0) N e calcula o seguinte: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/N
	public static double somar(int numero) throws IllegalArgumentException {
		if(numero <= 0) {
			throw new IllegalArgumentException();
		}
		return somar(numero, 1);
	}
	private static double somar(int numero, double cont) {
		if(cont < numero) {
			return 1/cont + somar(numero, cont +1);
		}
		return 1/cont;
	}
	
	//Exe5 
	
	
	

}
