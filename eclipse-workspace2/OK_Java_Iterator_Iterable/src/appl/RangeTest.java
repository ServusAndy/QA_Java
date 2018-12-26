package appl;

import item.Range;
import iterators.IteratorByEven;
import iterators.RangeIterator;

public class RangeTest {

	public static void main(String[] args) {
		
		Range r = new Range(-3,10);
//		RangeIterator ri = new RangeIterator(r);
//		while(ri.hasNext()) { //==true
//			System.out.print(ri.next()+" ");
//		}
//		System.out.println();
//		
//		IteratorByEven ibe = new IteratorByEven(r);
//		while(ibe.hasNext()) {// foreach rabotaet po suti kak cicl while!!!
//			System.out.print(ibe.next() + " ");
//		}
//		System.out.println();
//		
//		
//	    for(int res:r) {//foreach!!!!!!!!!!!!
//			System.out.print(res + " ");
//		}
		for(Integer i : r) {
			System.out.print(i+" ");
		}
		
	}

}
