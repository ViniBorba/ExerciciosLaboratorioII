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
		stackTop =0;
	}

	//@Override
	public boolean isEmpty() {
		// TODO se for igual a zero retorna verdadeiro
		return stackTop == 0;
	}

	//@Override
	public boolean isFull() {
		// se o topo da pilha == array.lenght é pq a pilha está cheia
		return stackTop == elements.length;
	}

	//@Override
	public int numElemens() {
		// retorna a quantia de elementos na pilha
		return stackTop;
	}

	//@Override
	public void push(E element) throws OverflowException {// Adiciona um novo elementos pilha
		// Verefica se a pilha não está cheia
		if(isFull())
			throw new OverflowException();
		
		elements[stackTop] = element;
		stackTop++;
	}

	//@Override
	public E pop() throws UnderflowException {
		// Retira um elemento da pilha
		if(isEmpty())
			throw new UnderflowException();
		
		E element = elements[stackTop -1];
		elements[stackTop -1] = null;
		stackTop--;
		return element;
	}

	//@Override
	public E top() throws UnderflowException {
		// Informa qual o elemento no topo da pilha
		if(isEmpty())
			throw new UnderflowException();
		
		return elements[stackTop -1];
	}

}
