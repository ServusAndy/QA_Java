package item;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray<E> implements Iterable<E>{
	
	private static final int INITIAL_SIZE = 16;
	private Object[] array;
	private int size = 0;
	
	public MyArray() {
		array = new Object[INITIAL_SIZE];
	}
	
	public MyArray(int initSize) {
		array = new Object[initSize];
	}
	
	public boolean add(E obj) {
		if(size == array.length)allocateAr();
		
		array[size++] = obj;
		return true;
	}

	private void allocateAr() {
		array = Arrays.copyOf(array, array.length*2);
	}
	
	@SuppressWarnings("unchecked")
	public E[] toArray() {
		return (E[]) Arrays.copyOf(array, size);
	}

	@Override
	public Iterator<E> iterator() {
		
		return new MyArrayIterator();
	}
	
	public class MyArrayIterator implements Iterator<E>{
		
		int current =0;
		@Override
		public boolean hasNext() {
			
			return current<size;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			
			return (E) array[current++];
		}
		
	}
}
