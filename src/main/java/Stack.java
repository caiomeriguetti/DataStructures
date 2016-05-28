public class Stack implements IStack {
	private Object[] content;
	private int top;
	
	public Stack(int size) {
		top = 0;
		content = new Object[size];
	}
	
	public void push(Object element) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is full");
		}
		
		content[top] = element;
		top++;
	}
	
	public Object pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		
		top --;
		return content[top];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return this.content.length == top;
	}
}
