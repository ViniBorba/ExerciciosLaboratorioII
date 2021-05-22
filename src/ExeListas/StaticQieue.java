package ExeListas;

public class StaticQieue<E> implements Queue<E> {
	private E[] elements;//array da fila
	private int queueFront;//inicio da Fila
	private int queueBack; //Final da Fila

	//Construtor
	public StaticQieue(int maxSize) {
		elements = (E[]) new Object[maxSize]; //cria o array de elementos
		queueFront = -1;
		queueBack = -1;
	}
	//@Override
	public boolean isEmpty() {
		// Informa se a fila está vazia
		return queueFront == -1;
	}

	//@Override
	public boolean isFull() {
		// Informa se a fila está cheia
		return queueBack == ((queueBack +1) % elements.length);
	}

	//@Override
	public int numElements() {
		// Informa a quantidade de elementos armazenados da fila
		return ((elements.length + queueBack - queueFront) % elements.length) +1;
	}

	//@Override
	public void enqueue(E element) throws OverflowException {
		// Insere um novo elementos da fila
		if(isFull())
			throw new OverflowException();
		else {
			if(queueBack == -1)
				queueBack = queueFront = 0;
			else
				queueBack = (queueBack +1) % elements.length;
			elements[queueBack] = element;
		}
		
	}

	//@Override
	public E dequeue() throws UnderflowException {
		// Retira um elemento da fila
		if(isEmpty())
			throw new UnderflowException();
		E element = elements[queueFront];
		if(queueFront == queueBack)
			queueFront = queueBack = -1;
		else
			queueFront = (queueFront +1) % elements.length;
		
		return element;
	}

	//@Override
	public E front() throws UnderflowException {
		// Informa qual o primeiro elemento da fila
		if(isEmpty())
			throw new UnderflowException();
		
		return elements[queueFront];
	}

	//@Override
	public E back() throws UnderflowException {
		// Informa qual é o último elemento da fila
		if(isEmpty())
			throw new UnderflowException();
		
		return elements[queueBack];
	}
	
	public String toString() {
		if (isEmpty())
			return "[Empty]";
		String s = "\n" + elements[queueFront];
		int n = numElements();
		for(int i = 1; i < n; i++) {
			int k = (queueFront + i) % elements.length;
			s += ", " + elements[k];
		}
		return s;
	}

}
