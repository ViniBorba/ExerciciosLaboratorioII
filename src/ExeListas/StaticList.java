package ExeListas;
/**
 * Implementacao de um lista linear com armazenamento estatico
 * @author ViniBorba
 * baseado em array
 */
public class StaticList <E> implements List<E> {
	private E[] elements;
	private int numElements;
	
	/**
	 * Construtor de uma lista com um tamaqnho m�ximo
	 * @param maxSize O tamanho da lista
	 */
	public StaticList(int maxSize) {
		elements = (E[]) new Object[maxSize]; //cria o array de elementos
		numElements = 0;
	}

	//@Override
	public int numElements() {
		return numElements;
	}

	//@Override
	public boolean isEmpty() {
		return numElements == 0;//retorna true se a lista estiver vazia
	}

	//@Override
	public boolean isFull() {
		return numElements == elements.length; //return true se a lista estiver cheia
	}

	//@Override
	public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException {
		//verefica se tem espa�o na lista, vendo se ela n�o est� cheia
		if (isFull())
			throw new OverflowException();
		
		//verifica se � v�lida a posi��o para inserir
		if (pos < 0 || pos > numElements)
			throw new IndexOutOfBoundsException();
		
		//Desloca para a direita os elementos necess�rios
		//abrindo espa�o para o novo elemento
		for (int i = numElements -1; i >= pos; i--)
			elements[i+1] = elements[i];
		
		//armazena o novo elemento e ajusta o total de elementos
		elements[pos] = element;
		numElements++;
	}

	//@Override
	public E remove(int posicao) throws UnderflowException, IndexOutOfBoundsException {
		// Verefica se a lista est� vazia, para ter onde apagar
		if(isEmpty())
			throw new UnderflowException();
		
		//verefica se a posi��o � v�lida
		if (posicao < 0 || posicao >= numElements)
			throw new IndexOutOfBoundsException();
		
		//Guarda uma referencia temporaria ao elemento removido
		E element = elements[posicao];
		
		//Desloca para a esquerda os elementos necess�rios,
		//sobrescrevendo a posi��o do que est� sendo removido
		for(int i = posicao; i < numElements -1; i++)
			elements[i] = elements[i+1];
		
		//define para null a posi��o antes ocupada pelo �ltimo,
		//sobrescrevendo a posi��o do que est� sendo removido
		elements[numElements -1] = null;
		numElements--;
		
		return element;
	}

	//@Override
	public E get(int posicao) throws IndexOutOfBoundsException {
		// verefica se a posi��o � valida
		if(posicao < 0 || posicao >= numElements)
			throw new IndexOutOfBoundsException();
		
		return elements[posicao];
	}

	//@Override
	public int search(E element) {
		for(int i =0; i < numElements; i++)
			if(element.equals(elements[i]))
				return i;
		
		//se não achar nada retorna -1
		return -1;
	}
	
	public boolean insertAfter(E obj1, E obj2) throws IllegalArgumentException{ 
		if(obj1 == null || obj2 == null) 
			throw new IllegalArgumentException(); 
		if(this.numElements > 0) { 
			int posObj1 = this.search(obj1);//variavel para encontrar a posicao do objeto
			if(posObj1 == -1) 
				return false; 
			this.insert(obj2, posObj1+1); 
			return true; 
		} 
		return false; 
	}
	
	/**
	 * Retorna uma representa��o String da lista
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = "";
		for(int i =0; i < numElements; i++)
			s += elements[i] + " ";//concatena tudo em uma string
		return s;
	}

}
