package Recursao;

public class SgundaParte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayDeInt = {1,2,3,4};
		
		System.out.println(SgundaParte.vOuF(arrayDeInt, 0));
		//SgundaParte.vOuF(arrayDeInt, 2);

	}
	
	// Exe1 método recursivo que recebe um array de int e um int N, retorna verdadeiro caso o int N esteja presente no array, ou falso caso contrário
	public static boolean vOuF(int[] arrayDeInt, int verefica) {
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
	
	
	

}
