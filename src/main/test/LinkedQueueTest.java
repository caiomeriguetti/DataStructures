import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedQueueTest {
	
	@Test
	public void testQueueDequeue() throws Exception {
		LinkedQueue q = new LinkedQueue();
		
		q.queue(1);
		q.queue(2);
		q.queue(3);
		
		assertEquals("[ 1, 2, 3 ]", q.toString());
		
		assertEquals(1, q.dequeue());
		assertEquals(2, q.dequeue());
		assertEquals(3, q.dequeue());
		
		try {
			q.dequeue();
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Queue is empty");
		}
	}
	
}
