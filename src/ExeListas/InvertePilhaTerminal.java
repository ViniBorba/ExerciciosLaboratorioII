package ExeListas;

import java.util.Stack;

public class InvertePilhaTerminal {

	public static void main(String[] args) {
		Stack<Stack> pilhaDeProdutos2 = new Stack<Stack>();
		
		//Adicionar
		pilhaDeProdutos2.push(new Stack());
		pilhaDeProdutos2.push(new Stack());
		pilhaDeProdutos2.push(new Stack());
		System.out.println(pilhaDeProdutos2.toString());
		
		//pilhaDeProdutos2.inve

	}
	
	public static void invertePilha(Stack<Stack> pilha) {
		Stack<Stack> invertido = new Stack<Stack>();
		if(pilha.isEmpty())
			invertido.push(pilha.pop());
	}
}
