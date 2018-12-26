package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import predicates.EvenPredicate;
import tfilter.FilterModel;;
class FilterTest {
	
	private static final int NUM_NUM = 1000000;
	static List<Integer> ali;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Random gen = new Random();
		EvenPredicate a = new EvenPredicate();
		ali = new ArrayList<>();
		for(int i =0;i<NUM_NUM;i++)ali.add(gen.nextInt());
		ali = FilterModel.filter(ali,a);
	}

	
	@Test
	void test() {
		boolean flag = true;
		for(Integer i : ali) {
			if(i%2!=0) {
			flag=false;
			break;
			}
		}
		assertTrue(flag);
	}

}
