package iterators;

import java.util.Iterator;

import item.Range;

public class IteratorByEven implements Iterator<Integer>{
	private Range range;
	private int position;
	
	public IteratorByEven(Range range) {
		this.range = range;
		position = range.getMin();
	}

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public boolean hasNext() {
		if(position<=range.getMax())return true;
		return false;
	}

	@Override
	public Integer next() 
	{
		Integer i;
		if(position%2!=0) position++;
			
		i = position;
		position+=2;
		
		return i;
	}
	
	
}
