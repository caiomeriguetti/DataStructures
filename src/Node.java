
public class Node {
	private Node next;
	private Object value;
	public Node getNext() {
		return next;
	}
	public void setNext(Node prox) {
		this.next = prox;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}

	public Node() {
		super();
	}
}
