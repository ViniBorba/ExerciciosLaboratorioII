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
		
		//Exe5
		System.out.println(SgundaParte.palidromo("Eva, asse essa ave"));
		
		//Exe6
		String[] arrayDeString = {"ovo", "galinha" ,"cacacac","melao"};
		System.out.println(SgundaParte.vereficaQtdPalidromo(arrayDeString));


	}
	
	// Exe1 m�todo recursivo que recebe um array de int e um int N, retorna verdadeiro caso o int N esteja presente no array, ou falso caso contr�rio
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
	
	
	//Exe2 m�todo recursivo que recebe um inteiro N por par�metro e retorna verdadeiro caso ele seja um n�mero primo e falso caso contr�rio
	
	
	
	//Exe3 Crie um m�todo recursivo que recebe uma String e retorna uma nova String, que � a String de entrada invertida.
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
	
	//Exe4 m�todo recursivo que recebe um inteiro positivo (e maior que 0) N e calcula o seguinte: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/N
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
	
	//Exe5 Crie um m�todo recursivo que retorna verdadeiro caso uma String recebida por par�metro seja um pal�ndromo
	//falso caso contr�rio. Um pal�ndromo � um texto que, desconsiderando espa�os, pontua��o e acentua��o, 
	//pode ser lido da mesma forma tanto de frente pra tr�s quanto de tr�s para frente. Por exemplo:
	//Ana - Renner - O teu dueto - Eva, asse essa ave - Seco de raiva, coloco no colo caviar e doces
	//Fica facil escrever palindromos com nomes proprios, como fazem Mezaf Omocso, Irporp Semon, Mocs Omord, Nila Prevercs e Lica Facif
	//No seu m�todo p�blico, antes de chamar o m�todo privado, voc� deve remover pontua��es
	//(exclama��es, pontos de interroga��o, pontos finais e v�rgulas) e espa�os, para ent�o chamar o m�todo privado.
	public static boolean palidromo(String palidromo) throws IllegalArgumentException {
		if(palidromo == null) {
			throw new IllegalArgumentException();
		}
		palidromo = palidromo.replaceAll("[\\\\,.?!@#(){}\\[\\]\\/]", "").toUpperCase();
		return palidromo(palidromo, 0, 1);
		
	}
	private static boolean palidromo(String palidromo, int contChar, int i) {
		if(palidromo.length() > i) {
		if(palidromo.charAt(contChar) == palidromo.charAt(palidromo.length() -i)) {
			return palidromo(palidromo, contChar +1, i+1);
		} 
			return false;
		} 
		return true;
	}
	
	//Exe6 Crie um m�todo recursivo que recebe um array de String e retorna a quantidade de posi��es que cont�m pal�ndromos neste array.
	//Utilize o m�todo desenvolvido no exerc�cio 5 para auxiliar.
	public static int vereficaQtdPalidromo(String[] arrayDeString) throws IllegalArgumentException {
		if(arrayDeString == null) {
			throw new IllegalArgumentException();
		}
		return vereficaQtdPalidromo(arrayDeString, 0, 0);
		
	}
	private static int vereficaQtdPalidromo(String[] array, int indice, int acumulador) {
		if(indice < array.length) {
			/*if(palidromo(array[indice])) {
				 return vereficaQtdPalidromo(array, indice +1, acumulador +1);
			} else {
				return vereficaQtdPalidromo(array, indice +1, acumulador);
			}*/
			//if ternatio
			//return condi��o ? verdadeira : fal�a
			return palidromo(array[indice]) ? vereficaQtdPalidromo(array, indice +1, acumulador +1) :  vereficaQtdPalidromo(array, indice +1, acumulador);
		}
		return acumulador;
	}
	
	
	
	

}
