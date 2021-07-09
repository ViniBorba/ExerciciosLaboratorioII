package ExeListas;

//Lista Simplesmente encadeada
public class SinglyLinkedList<E> implements List<E> {
	private Node<E> head;
	private Node<E> tail;
	private int numElements;
	
	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
		this.numElements = 0;
	}

	//@Override
	public int numElements() {
		//
		return numElements;
	}

	//@Override
	public boolean isEmpty() {
		// retorna verdadeiro se head == null
		return head == null;
	}

	//@Override
	public boolean isFull() {
		// nunca vai estar cheio nesse caso, por ser uma lista
		return false;
	}

	//@Override
	public void insertFirst(E element) throws NullPointerException {
		// TODO Auto-generated method stub
		if (element == null) throw new NullPointerException();
		
		Node<E> newNode = new Node<>(element);//converto o elemento para colocar no Node
		if(isEmpty())
			head = tail = newNode;//se tiver vazio tudo vira o novo node
		else {
			newNode.setNext(head);//Primeiro eu crio uma referencia falando que e o next deste newNode é o atual head
			head = newNode;//Depois eu digo que o newNode é o head da Lista
			//Então, na verdade, eu nunca vou ter tirado de um para outro, eu apenas vou mudar na lista qual é o atual head
			//Mas os Nodes sempre vão ter guardados a posição de memoria de quando eles foram head
			// É assim que os nodes referenciam um ao outro
		}
		numElements++;
	}
	
	public void insertLast (E element) throws NullPointerException{
		if (element == null) throw new NullPointerException();
		
		Node<E> newNode = new Node<>(element);//cria o no
		if(isEmpty())//se tiver vazia coloca tudo isso no mesmo no
			head = tail = newNode;
		else {//se tiver outros nos
			tail.setNext(newNode);//no tail atual seta um novo no
			tail = newNode;//fala para variavel tail agora é o novo no
		}
		numElements++;
	}
	
	public E removeFirst() throws UnderflowException{
		if(isEmpty()) throw new UnderflowException();
		
		E element = head.getElement();//cria elemento, com o head atual, para retornar o elemento que foi deletado
		
		if(head == tail)
			head = tail = null;
		else
			head = head.getNext();//agora o head é o próximo elemento, o atual simplesmente fica sem conexão
		
		numElements--;
		return element;
	}
	
	public E removeLast() throws UnderflowException{
		if(isEmpty()) throw new UnderflowException();
		
		E element = tail.getElement();
		
		if(head == tail)
			head = tail = null;
		else {
			Node<E> current = head;
			while(current.getNext() != tail)
				current = current.getNext();
			tail = current;
			current.setNext(null);
		}
		numElements--;
		return element;
	}
	
	@Override
	public E remove(int posicao) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(posicao < 0 || posicao >= numElements)
			throw new IndexOutOfBoundsException();
		
		if(posicao == 0) return removeFirst();
		else if(posicao == numElements -1) return removeLast();
		else {
			Node<E> current = head;//
			for(int i =0; i < posicao -1; i++) //
				current = current.getNext();
			
			E element = current.getNext().getElement();
			current.setNext(current.getNext().getNext());
			
			numElements--;
			return element;
		}
	}

	@Override
	public E get(int posicao) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(posicao < 0 || posicao >= numElements)
			throw new IndexOutOfBoundsException();
		
		Node<E> current = head;
		for(int i =0; i < posicao; i++)
			current = current.getNext();
		
		return current.getElement();
	}

	@Override
	public int search(E element) throws NullPointerException {
		// TODO Auto-generated method stub
		if(element == null) throw new NullPointerException();
		
		Node<E> current = head;
		int i = 0;
		while(current != null) {
			if(element.equals(current.getElement()))
				return i;
			i++;
			current = current.getNext();
		}
		return -1;
	}

	@Override
	public void insert(E element, int pos) throws NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(element == null) throw new NullPointerException();
		if(pos < 0 || pos > numElements) throw new IndexOutOfBoundsException();
		
		if(pos == 0)//se posicao for zero chama o inserir primeiro
			insertFirst(element);
		else if(pos == numElements)//se posicao for a ultima chama o inserir por ultimo
			insertLast(element);
		else {//se for uma posicao no meio
			Node<E> current = head;//cria um node e faz ele iniciar em head
			for(int i =0; i < pos -1; i++) //faz um for para o no current ir até a posicao
				current = current.getNext();
				
			Node<E> newNode = new Node<>(element);
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			numElements++;
		}
	}
	
	public String toString() {
		String s = "";
		
		Node<E> current = head;
		while(current != null) {
			s += current.getElement().toString() + " - ";
			current = current.getNext();
		}
		return s;
	}

}
