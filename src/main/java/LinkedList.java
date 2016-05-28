
public class LinkedList {
	private int length = 0;
	private Node first;
	private Node last;
	
	public Node getLast() {
		return last;
	}

	public int getLength() {
		return length;
	}

	public void append(Object val) {
		Node toInsert = new Node();
		toInsert.setValue(val);
		
		if (first == null) {
			first = last = toInsert;
		} else {
			last.setNext(toInsert);
			last = toInsert;
		}
		
		length ++;
	}
	
	private Object delete(Neighborhood neighborhood) {
		if (neighborhood == null || neighborhood.getNode() == null) {
			return null;
		}
		
		Node prev = neighborhood.getPrevNode();
		Node next = neighborhood.getNode().getNext();
		
		if (prev == null) {
			//delete first
			first = first.getNext();
		} else {
			prev.setNext(next);
		}
		
		length --;
		
		return neighborhood.getNode().getValue();
	}
	
	public void deleteByValue(Object value) {
		Neighborhood neighborhood = getNodeByValue(value);
		delete(neighborhood);
	}
	
	public void deleteAllByValue (Object value) {
		Neighborhood neighborhood = getNodeByValue(value, first);
		while(neighborhood != null && neighborhood.getNode() != null) {
			delete(neighborhood);
			neighborhood = getNodeByValue(value, neighborhood.getPrevNode());
		}
	}
	
	public Object deleteByIndex(int index) {
		Neighborhood neighborhood = getNodeByIndex(index);
		return delete(neighborhood);
	}

	public void inject(int index, Object val) {
		Node toInject = new Node();
		toInject.setValue(val);
		
		Neighborhood neighborhood = getNodeByIndex(index);
		
		Node prev = neighborhood.getPrevNode();
		Node current = neighborhood.getNode();
		
		if (prev == null) {
			//unshift
			toInject.setNext(first);
			first = toInject;
		} else {
			toInject.setNext(current);
			prev.setNext(toInject);
		}
	}
	
	public Neighborhood getNodeByValue(Object value) {
		return this.getNodeByValue(value, first);
	}
	
	public Neighborhood getNodeByValue(Object value, Node startNode) {
		
		if (startNode == null) {
			return null;
		}
		
		Neighborhood neighborhood = new Neighborhood();
		Node currentNode = startNode;
		Node prevNode = null;
		
		while (currentNode != null && !value.equals(currentNode.getValue())) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		
		neighborhood.setNode(currentNode);
		neighborhood.setPrevNode(prevNode);
		return neighborhood;
	}
	
	public Neighborhood getNodeByIndex(int index) {
		Neighborhood neighborhood = new Neighborhood();
		Node currentNode = first;
		Node prevNode = null;
		int currentIndex = 0;
		
		while (currentIndex  < index) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
			currentIndex ++;
		}
		
		neighborhood.setNode(currentNode);
		neighborhood.setPrevNode(prevNode);
		return neighborhood;
	}
	
	public String toString() {
		Node currentNode = first;
		String buffer = "";
		while(currentNode != null){
			buffer += String.valueOf(currentNode.getValue()) + " ";
			currentNode = currentNode.getNext();
		}
		
		return buffer;
	}
}
