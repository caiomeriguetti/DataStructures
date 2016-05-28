
public class LinkedStack implements IStack {
	private Node first;
	private Node last;
	
	@Override
	public void push(Object element) throws Exception {
		Node newNode = new Node(element);
		if (isEmpty()) {
			last = first = newNode;
		}
		last = newNode;
		
	}
	@Override
	public Object pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		
		Node deleted = last;
		return deleted.getValue();
	}
	@Override
	public boolean isEmpty() {
		return first == null;
	}
}
