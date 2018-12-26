
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DoubleSortTest {

	private static final int NUM_NUM = 1000000;
	static Random gen = new Random();
	  static ArrayList<Double> adl;

	 @BeforeAll
	  static void setUpBeforeClass() throws Exception {
	    adl = new ArrayList<>();
	    for(int i = 0; i < NUM_NUM;i++) {
	      adl.add(gen.nextDouble());
	    }
	  }
	 
	  @Test
	  void testSort() {
	    Collections.sort(adl);
	    boolean flag = true;
	    int arrayListSize = adl.size();
	    for(int i = 1; i < arrayListSize;i++) {
	      if(adl.get(i) < adl.get(i-1)) {
	        flag = false;
	        break;
	      }
	    }
	    assertTrue(flag);
	      
	  }
	  
	  

}
