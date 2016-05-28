import java.util.StringJoiner;

public class Queue implements IQueue {
	
	private Object[] content;
	private int currentSize, begin, end;
	public Queue(int maxSize) {
		begin = 0;
		end = 0;
		currentSize = 0;
		content = new Object[maxSize];
	}
	
	public Object dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		Object removed = content[begin];
		begin ++;
		begin = begin % content.length;
		currentSize --;
		return removed;
	}
	
	public void queue(Object element) throws Exception {
		
		if (isFull()) {
			throw new Exception("Queue is full");
		}
		
		content[end] = element;
		end ++;
		end = end % content.length;
		currentSize ++;
	}
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
	public boolean isFull() {
		return currentSize == content.length;
	}
	
	public String contentToString() {
		StringJoiner thelist = new StringJoiner(",", "[", "]");
		
		for (Object o: content) {
			thelist.add(o.toString());
		}
		
		return thelist.toString();
	}
}
