
public class ConversaoDeTipos {

	public static void main(String[] args) {
		
		var varDouble = 2.01;
		System.out.println("Valor double: "+varDouble);
		System.out.println("Valor convertido para int: "+ConversaoDeTipos.converteDoubleEmInt(varDouble));
		//ConversaoDeTipos.converteDoubleEmInt(varDouble);
		
		//passando dois valores int e transformando em variavel float
		System.out.println("Valor Float: "+ConversaoDeTipos.conversaoAtribuicaoIntParaFloat(5, 10));
		
		//
		System.out.println("Soma de um int e um float transforma em float: "+ ConversaoDeTipos.promocaoNumerica(10, 5.5645f));

	}
	
	//metodo para converter valor double em valor int - Casting
	public static int converteDoubleEmInt(double valorDouble) {
		return (int) valorDouble;
		//double varDouble = (int) varDouble;
	}
	
	//Valores menores podem ser convertido para valores maiores por atribuicao
	public static float conversaoAtribuicaoIntParaFloat (int valor1, int valor2) {
		//recebe dois int e retorna um float
		float varConvertida = valor1 + valor2; 
		return varConvertida;
		
	}
	
	//Converte doi valores diferentes em um valor que é maior que os dois
	public static float promocaoNumerica(int valorInt, float valorFloat) {
		//Retorna valor float somando um int e um float
		return valorInt + valorFloat;
	}

}
