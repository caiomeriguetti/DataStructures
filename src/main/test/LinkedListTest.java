import org.junit.Test;

import junit.framework.TestCase;


public class LinkedListTest extends TestCase {
	
	@Test
	public void testDeleteByValue() {
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append("X");
		l.append("Y");
		l.append("Z");
		l.append("Z");
		l.append("T");
		l.append("Z");
		l.append("U");
		
		l.deleteByValue("Z");
		
		assertEquals("1 2 3 X Y Z T Z U ", l.toString());
	}
	
	@Test
	public void testAppendRemoveAndLength() {
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		
		assertEquals(2, l.getLength());
		
		assertEquals("1 2 ", l.toString());
		
		l.deleteByIndex(0);
		
		assertEquals(1, l.getLength());
		
		assertEquals("2 ", l.toString());
	}
	
	@Test
	public void testDeleteAllByValue() {
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append("X");
		l.append("Y");
		l.append("Z");
		l.append("Z");
		l.append("T");
		l.append("Z");
		l.append("U");
		
		l.deleteAllByValue("Z");
		
		assertEquals("1 2 3 X Y T U ", l.toString());
		
		l.deleteAllByValue(1);
		
		assertEquals("2 3 X Y T U ", l.toString());
		
		l.deleteAllByValue(3);
		l.deleteAllByValue(2);
		
		assertEquals("X Y T U ", l.toString());
		
		l = new LinkedList();
		l.append(1);
		l.append(2);
		
		l.deleteAllByValue(2);
		
		assertEquals("1 ", l.toString());
		
		l.deleteAllByValue(1);
		
		assertEquals("", l.toString());
		
	}
	
	@Test
	public void testDeleteByIndex() {
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append("U");
		
		l.deleteByIndex(2);
		
		assertEquals("1 2 ", l.toString());
	}
	
}
