package ExeListas;

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
		// nunca vai estar cheio nesse caso
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

	@Override
	public E remove(int posicao) throws UnderflowException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int posicao) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(E element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(E element, int pos) throws OverflowException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
	}

}
