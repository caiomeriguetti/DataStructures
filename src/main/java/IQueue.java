public interface IQueue {
	public Object dequeue() throws Exception;
	public void queue(Object element) throws Exception;
	public boolean isEmpty();
}
