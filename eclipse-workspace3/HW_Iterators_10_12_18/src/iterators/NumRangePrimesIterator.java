package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

import model.NumRange;

public class NumRangePrimesIterator implements Iterator<Integer>{
	private int current;
	private int max;
	
	public NumRangePrimesIterator(NumRange numRange) {
		max = numRange.getMax();
		current = getNextPrime(numRange.getMin());
	}
	
	private int getNextPrime(int num) {
		num = num%2 == 0 ?num+1:num;
		for(;!isPrime(num) && num <= max;num=num+2);
		return num;
	}

	@Override
	public boolean hasNext() {
		
	        return current<=max;
	}

	@Override
	public Integer next() {
		if (!hasNext())
			throw new NoSuchElementException();
		int res = current;
		current = getNextPrime(current+2);
		return res;
	}
	
	private boolean isPrime(int num) {
		num = num > 0?num:-num;
		if(num < 2)return false;
		if(num<4)return true;
		if(num%2==0)return false;
		for(int i = 3; i*i <= num && i*i >0;i = i+2) {
			if(num%i == 0)return false;
		}
		return true;
	}
	
    private boolean isPrime1(int num) {
        if(num <2 )return false;
        if(num <4)return true;
        if(num%2==0)return false;
        for(int i = 3; i*i <= num && i*i >0;i = i+2) {
        	if(num%i==0)return false;
        }
        return true;
    }

}
