package ExeListas;
/**
 * Implementação de um lista linear com armazenamento estático
 * @author ViniBorba
 * baseado em array
 */
public class StaticList <E> implements List<E> {
	private E[] elements;
	private int numElements;
	
	/**
	 * Construtor de uma lista com um tamaqnho máximo
	 * @param maxSize O tamanho da lista
	 */
	public StaticList(int maxSize) {
		elements = (E[]) new Object[maxSize]; //cria o array de elementos
		numElements = 0;
	}

	@Override
	public int numElements() {
		return numElements;
	}

	@Override
	public boolean isEmpty() {
		return numElements == 0;//retorna true se a lista estiver vazia
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return numElements == elements.length; //return true se a lista estiver cheia
	}

	@Override
	public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException {
		//verefica se tem espaço na lista, vendo se ela não está cheia
		if (isFull())
			throw new OverflowException();
		
		//verifica se é válida a posição para inserir
		if (pos < 0 || pos > numElements)
			throw new IndexOutOfBoundsException();
		
		//Desloca para a direita os elementos necessários
		//abrindo espaço para o novo elemento
		for (int i = numElements -1; i >= pos; i--)
			elements[i+1] = elements[i];
		
		//armazena o novo elemento e ajusta o total de elementos
		elements[pos] = element;
		numElements++;
	}

	@Override
	public E remove(int posicao) throws UnderflowException, IndexOutOfBoundsException {
		// Verefica se a lista está vazia, para ter onde apagar
		if(isEmpty())
			throw new UnderflowException();
		
		//verefica se a posição é válida
		if (posicao < 0 || posicao >= numElements)
			throw new IndexOutOfBoundsException();
		
		//Guarda uma referencia temporaria ao elemento removido
		E element = elements[posicao];
		
		//Desloca para a esquerda os elementos necessários,
		//sobrescrevendo a posição do que está sendo removido
		for(int i = posicao; i < numElements -1; i++)
			elements[i] = elements[i+1];
		
		//define para null a posição antes ocupada pelo último,
		//sobrescrevendo a posição do que está sendo removido
		elements[numElements -1] = null;
		numElements--;
		
		return element;
	}

	@Override
	public E get(int posicao) throws IndexOutOfBoundsException {
		// verefica se a posição é valida
		if(posicao < 0 || posicao >= numElements)
			throw new IndexOutOfBoundsException();
		
		return elements[posicao];
	}

	@Override
	public int search(E element) {
		for(int i =0; i < numElements; i++)
			if(element.equals(elements[i]))
				return i;
		
		//se não achar nada retorna -1
		return -1;
	}
	
	/**
	 * Retorna uma representação String da lista
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = "";
		for(int i =0; i < numElements; i++)
			s += elements[i] + " ";//concatena tudo em uma string
		return s;
	}
}
