package ExeListas;

//node no para a classe duplamente encadeada
public class DNode<T> {
	private T element;
	private DNode<T> next;
	private DNode<T> previous;//previous
	
	public DNode(T element) {
		this.setElement(element);
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNode<T> previus) {
		this.previous = previus;
	}

}
