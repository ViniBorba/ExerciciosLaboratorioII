
public class ExecArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MetodosArrays testarMetodosArray = new MetodosArrays(); Se usar metodos static não precisa instanciar pra chamar o metodo
		
		int[] arrayDeInt = new int[10];
		arrayDeInt[0]= 1;
		arrayDeInt[1]= 2;
		arrayDeInt[2]= 3;
		arrayDeInt[3]= 4;
		arrayDeInt[4]= 5;
		arrayDeInt[5]= 6;
		arrayDeInt[6]= 7;
		arrayDeInt[7]= 8;
		arrayDeInt[8]= 9;
		arrayDeInt[9]= 10;
		
		int[] segunoArrayDeInt = new int[3];
		segunoArrayDeInt[0] = 11;
		segunoArrayDeInt[1] = 12;
		segunoArrayDeInt[2] = 155;
		
		//array de objetos não basta ser instanciada, também tem que ser popupada por ojetos do tipo declarado
		String[] arrayDeString = new String[5];
		arrayDeString[0] = "Vini";
		arrayDeString[1] = "Maria";
		arrayDeString[2] = "Joca";
		arrayDeString[3] = "rAFA";
		arrayDeString[4] = "Galileu";
		
		boolean[] arrayBoolean = new boolean[4];
		arrayBoolean[0] = false;
		arrayBoolean[1] = true;
		arrayBoolean[2] = true;
		arrayBoolean[3] = false;
		
		//Exe1
		//MetodosArrays.pressContrario(arrayDeInt);
		
		//Exe3
		//MetodosArrays.retornaPar(arrayDeInt);
		
		//Exe4
		//System.out.print(MetodosArrays.retornaPosicao(arrayDeString, "Rafa"));
		
		//Exe5
		//MetodosArrays.zeroUm(arrayBoolean);

		//Exe6
		MetodosArrays.terceiroArray(arrayDeInt, segunoArrayDeInt);
		
		//Exe7
		
		

	}

}
