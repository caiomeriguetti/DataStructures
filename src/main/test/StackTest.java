import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
	
	@Test
	public void testPushPop() throws Exception {
		Stack stack = new Stack(5);
		
		stack.push(1);
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		
		try {
			stack.push("Impossible to push this element");
		} catch (Exception e) {
			assertEquals("Stack is full", e.getMessage());
		}
		
		assertEquals(4, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(5, stack.pop());
		assertEquals(1, stack.pop());

	}
	
}
