package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		assertEquals(4,2+2);
		assertNotEquals(5, 2+2);
	}
	
	@Test
	public void test2() {
		assertTrue(4==2+2);
		assertFalse(4!=2+2);
		assertFalse(6==2+2);
		
		int[] ar = {1,2,3,4,5,6,7,8};
		int[] ar2 = {10,11,12,13,14};
		int[] ar3 = {1,2,3,4,5,6,7,8};
		assertArrayEquals(ar, ar3);
		assertEquals(8,ar.length);
		
		
	}

}
