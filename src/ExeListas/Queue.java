package ExeListas;
/**
 * Interface que define o comportamento de uma Fila
 * @author ViniBorba
 */

public interface Queue<E> {
	
	/**
	 * Informa se a fila está vazia
	 * @return Verdadeiro se a fila estiver cheia, falso caso contrário
	 */
	public boolean isEmpty();
	
	/**
	 * Informa se a fila está cheia
	 * @return Verdadeiro se a fila estiver cheia, falso caso contrário
	 */
	public boolean isFull();
	
	/**
	 * Informa a quantidade de elementos armazenados da fila
	 * @return A quantidade de elementos armazenados da fila
	 */
	public int numElements();
	
	/**
	 * Insere um novo elementos da fila
	 * @param element O elemento a ser inserido
	 */
	public void enqueue(E element) throws OverflowException;
	
	/**
	 * Retira um elemento da fila
	 * @return O elemento retirado
	 */
	public E dequeue() throws UnderflowException;
	
	/**
	 * Informa qual o primeiro elemento da fila
	 * @return O primeiro elemento da fila
	 */
	public E front() throws UnderflowException;
	
	/**
	 * Informa qual é o último elemento da fila
	 * @return o último elemento da fila
	 */
	public E back() throws UnderflowException;
}
