package model;

import java.util.Iterator;

import exception.WrongDataException;
import iterators.NumRangeOddIterator;
import iterators.NumRangePrimesIterator;



public class NumRange implements Iterable<Integer>{
	private int min;
	private int max;
	
	public NumRange(int min, int max) throws WrongDataException {
		if(min>max)throw new WrongDataException("min < max");
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	@Override
	public Iterator<Integer> iterator() {
	
		return new NumRangePrimesIterator(this);
	}
	
	
}
