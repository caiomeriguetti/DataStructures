import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ListTest extends TestCase {
	
	@Test
	public void testAppendAndRemove() {
		List l = new List();
		l.append(1);
		l.append(2);
		
		assertEquals("1 2 ", l.toString());
		
		l.deleteByIndex(0);
		
		assertEquals("2 ", l.toString());
	}
	
	public void testDeleteAllByValue() {
		List l = new List();
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
		assertEquals("T", l.getNodeByIndex(5).getNode().getValue());
	}
	
	public void testDeleteByIndex() {
		List l = new List();
		l.append(1);
		l.append(2);
		l.append("U");
		
		l.deleteByIndex(2);
		
		assertEquals("1 2 ", l.toString());
	}
	
}
