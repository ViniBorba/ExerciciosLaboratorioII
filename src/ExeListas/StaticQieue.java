package ExeListas;

public class StaticQieue<E> implements Queue<E> {

	//@Override
	public boolean isEmpty() {
		// Informa se a fila está vazia
		return false;
	}

	//@Override
	public boolean isFull() {
		// Informa se a fila está cheia
		return false;
	}

	//@Override
	public int numElementos() {
		// Informa a quantidade de elementos armazenados da fila
		return 0;
	}

	//@Override
	public void enqueue(E element) throws OverflowException {
		// Insere um novo elementos da fila
		
	}

	//@Override
	public E dequeue() throws UnderflowException {
		// Retira um elemento da fila
		return null;
	}

	//@Override
	public E front() throws UnderflowException {
		// Informa qual o primeiro elemento da fila
		return null;
	}

	//@Override
	public E back() throws UnderflowException {
		// Informa qual é o último elemento da fila
		return null;
	}

}
