package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.NumRange;

class NumRangeOddIteratorsTest {

	static boolean Odd() throws Exception {
		int min = -100;
		int max = 100;
		
		NumRange numRange = new NumRange(min,max);
		
		for(Integer i : numRange) {
			if(i%2==0) {
				return false;
			}
		}
		return true;
	}

	@Test
	void testNumRangeOddIterator() throws Exception {
		assertTrue(Odd());
	}

}
