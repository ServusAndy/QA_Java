package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.OurTreeSet;

class RecursiveIteratorTest {
	
	private static final int NUM_NUM = 10;
	static Random gen = new Random();
	static OurTreeSet<Integer> ots = new OurTreeSet<Integer>((a,b)->a.compareTo(b));
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		for(int i =0;i<NUM_NUM;i++) {
			ots.add(gen.nextInt());
		}
	}

	@Test
	void test() {
		boolean flag = true;
		Iterator<Integer> itr = ots.iterator();
		int prev = itr.next();
		for(Integer curr:ots) {
			if(curr < prev) {
				flag = false;
				break;
			}
		}
		assertTrue(flag);
	}
	
	@Test
	void test2() {
		boolean flag = true;
		Iterator<Integer> itr = ots.iterator();
		int prev = itr.next();
		while(itr.hasNext()) {
			int curr = itr.next();
			if(curr < prev) {
				flag = false;
				break;
			}
			prev=curr;
		}
		assertTrue(flag);
	}
	
	@Test
	void test3() {
		
	}
	
	

}
