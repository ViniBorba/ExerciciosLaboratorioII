package Pesquisa;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] array = {5, 9, 12, 15, 20, 22, 26, 30, 45, 87, 92};
		//int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};
		int[] array = {10, 34, 65, 76, 81};
		
		System.out.println(array.length);
		Terminal.pesquisaBinaria(array, 23);
		
		
	}

	
	public static void pesquisaBinaria(int[] array, int encontra) {
		int inf = 0; //inferior
		int sup = array.length; //superior
		System.out.println("Encontrar o valor "+encontra+" no array de inteiros");
		System.out.println("-------------------");
		while(inf <= sup) {
			int med = (inf + sup) / 2; //media
			System.out.println("Inferior: "+inf);
			System.out.println("Superior: "+sup);
			System.out.println("Media: "+med);
			if(array[med] == encontra) {
				System.out.println("\n## O Valor "+encontra+" foi encontrado\n## Encontrado na posicao "+med);
				return;
			} else if(encontra < array[med]) {
				sup = med - 1; //procura na primeira metade
			} else {
				inf = med + 1; //procura na segunda metade
			}
			System.out.println("Valor contido: "+array[med]);
			System.out.println("-------------------");
		}
		return;
	}
}
