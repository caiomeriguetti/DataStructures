import java.util.StringJoiner;

public class LinkedQueue implements IQueue {
	Node first = null;
	Node last = null;
	public LinkedQueue() {
	}

	@Override
	public Object dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		Node deleted = first;
		first = first.getNext();
		return deleted.getValue();
	}

	@Override
	public void queue(Object element) {
		Node newNode = new Node(element);
		
		if (last == null) {
			first = last = newNode;
		} else {
			last.setNext(newNode);
			last = newNode;
		}
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	public String toString() {
		StringJoiner j = new StringJoiner(", ", "[ ", " ]");
		Node currentNode = first;
		while (currentNode != null) {
			j.add(currentNode.getValue().toString());
			currentNode = currentNode.getNext();
		}
		
		return j.toString();
	}
}
