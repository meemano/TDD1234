package core;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreateNewEmptyStack() {
	
		Stack s1 = new Stack() ;
		int size = s1.getSize() ;
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}

	
	public void testPushElmToTop() {
		Stack s1 = new Stack() ; 
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int topElm = (Integer)s1.top();
		assertEquals(1, topElm) ;
	}
}
