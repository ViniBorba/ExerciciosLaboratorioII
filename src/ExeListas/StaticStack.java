package ExeListas;
/**
 * Implementação de uma pilha baseado na interface Stack
 * @author ViniBorba
 * @param <E>
 */
public class StaticStack<E> implements Stack<E>{
	private E[] elements;//array da pilha
	private int stackTop;//para controlar o tipo da pilha
	
	/**
	 * Construtor
	 */
	public StaticStack (int maxSize) {
		elements = (E[]) new Object[maxSize]; //cria o array de elementos
		stackTop = -1;
	}

	//@Override
	public boolean isEmpty() {
		// TODO se for igual a zero retorna verdadeiro
		return stackTop == -1;
	}

	//@Override
	public boolean isFull() {
		// se o topo da pilha == array.lenght é pq a pilha está cheia
		return stackTop == elements.length -1;
	}

	//@Override
	public int numElements() {
		// retorna a quantia de elementos na pilha
		return stackTop +1;
	}

	//@Override
	public void push(E element) throws OverflowException {
		// Adiciona um novo elementos pilha
		if(isFull())
			throw new OverflowException();
		
		elements[++stackTop] = element;
		//stackTop++;
	}

	//@Override
	public E pop() throws UnderflowException {
		// Retira um elemento da pilha
		if(isEmpty())
			throw new UnderflowException();
		
		E element = elements[stackTop];
		elements[stackTop --] = null;
		//stackTop--;
		return element;
	}

	//@Override
	public E top() throws UnderflowException {
		// Informa qual o elemento no topo da pilha
		if(isEmpty())
			throw new UnderflowException();
		
		return elements[stackTop];
	}
	
	/**
	 * Método para o trabalho do môdulo 4
	 * Implementação de um metodo recursivo que conta a quantidade de vezes que o elemento se repete na pilha
	 */
	public int contaElementos(E el) throws IllegalArgumentException {
		if(el == null)
			throw new IllegalArgumentException();
		int aux = stackTop;
		return contaElementos(el, 0, aux);
	}
	private int contaElementos(E el, int cont, int aux) {
		//int aux = stackTop;
		if(aux >= 0) {
			if(elements[aux].equals(el)) {
				//cont++;
				//aux--;
				return contaElementos(el, cont +1, aux -1);
			} else {
				//aux--;
				return contaElementos(el, cont, aux -1);
			}
		}
		return cont;
	}
	
	public String toString() {
		if(isEmpty())
			return "Erro";
		else {
			String s = "\n";
			for(int i = numElements() -1; i >= 0; i--) {
				s += "|" + elements[i];
			}
			return s;
		}
	}

}
