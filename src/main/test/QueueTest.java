import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
	
	@Test
	public void testQueueDequeue() throws Exception {
		Queue queue = new Queue(5);
		
		queue.queue(1);
		queue.queue(2);
		queue.queue(3);
		queue.queue(4);
		queue.queue(5);
		
		try {
			queue.queue("I know that i cant queue this string");
		} catch (Exception e) {
			assertEquals("Queue is full", e.getMessage());
		}
		
		assertEquals(1, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(3, queue.dequeue());
		
		queue.queue(6);
		queue.queue(7);
		queue.queue(8);
		
		assertEquals("[6,7,8,4,5]", queue.contentToString());
		
		assertEquals(4, queue.dequeue());
		assertEquals(5, queue.dequeue());
		assertEquals(6, queue.dequeue());
		assertEquals(7, queue.dequeue());
		assertEquals(8, queue.dequeue());
		
		try {
			queue.dequeue();
		} catch (Exception e) {
			assertEquals("Queue is empty", e.getMessage());
		}

	}
	
}
