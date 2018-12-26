package item;

import java.util.Iterator;

import iterators.RangeIterator;

public class Range implements Iterable<Integer>{
	private int min ;
	private int max;
	
	public Range(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min<=max)
		this.min = min;
		else
			System.out.println("Set min<=max");
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		if(max>=min)
		this.max = max;
		else
			System.out.println("Set max>=min");
	}

//	@Override
//	public Iterator<Integer> iterator() {
//		
//		return new RangeIterator(this);
//	}
	@Override
	public Iterator<Integer> iterator() {
		
		return new RangeIterator2();
	}
	
	public class RangeIterator2 implements Iterator<Integer>{
	
		private int position = Range.this.getMin();
		
		@Override
		public boolean hasNext() {
			if(position<=Range.this.getMax())return true;
			return false;
		}

		@Override
		public Integer next() {
		Integer i = position;
		position+=2;
			return i;
		}
		
	}
	
}
