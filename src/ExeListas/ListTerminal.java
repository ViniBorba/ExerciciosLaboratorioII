package ExeListas;

public class ListTerminal {

	public static void main(String[] args) {
		int arrayInt[] = new int[30];
		for(int i =0; i < 10; i++) {
			arrayInt[i] = i;
		}
		
		StaticStack pilha = new StaticStack(30);
		pilha.push(2);
		pilha.push(2);
		pilha.push(23);
		pilha.push(2);
		pilha.push(2);
		pilha.push(2);
		pilha.push(2);
	
		System.out.println(pilha.numElements());
		System.out.println(pilha.top());
		System.out.println(pilha.contaElementos(2));

	}

}
