package appl;

import java.util.Comparator;
import java.util.Iterator;

import model.OurTreeSet;

public class OurTreeSetApp {

	public static void main(String[] args) {
		Comparator<Integer> c = (i1,i2) -> i1-i2;
		OurTreeSet<Integer> ots = new OurTreeSet<Integer>(c);
		
		for(int i =1;i<30;i++) {
			ots.add(i);
		}
		
		ots.remove(2);
		
		for(Integer i: ots) {
		System.out.print(i+" ");
		}

	
		
	}

}
