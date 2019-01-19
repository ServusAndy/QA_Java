package model;

import java.util.Iterator;

public class RecursiveIterator<T> implements Iterator<T>{

	private Node<T> head;
	private RecursiveIterator<T> leftIterator = null;
	private RecursiveIterator<T> rightIterator = null;
	
	private boolean headNotNull = false;
	private boolean hasLeft = false;
	private boolean hasRight = false;
	
	private boolean headReturned = true;
		
	public RecursiveIterator(Node<T> head) {
		
		this.head = head;
		
		headNotNull = (head != null);
		if (headNotNull) {
			hasLeft = (head.getLeft() != null);
			hasRight = (head.getRight() != null);
			if (hasLeft) leftIterator = new RecursiveIterator<T>(head.getLeft());
			if (hasRight) rightIterator = new RecursiveIterator<T>(head.getRight());
			headReturned = false;
		}
	}

	@Override
	public boolean hasNext() {

		return headNotNull && (
				(hasLeft && leftIterator.hasNext()) ||
				!headReturned || 
				(hasRight && rightIterator.hasNext())
				);
	}

	@Override
	public T next() {
		if (hasLeft && leftIterator.hasNext()) return leftIterator.next();
		if (!headReturned) {
			headReturned = true;
			return head.getData();	
		}
		if (hasRight && rightIterator.hasNext()) return rightIterator.next();
		return null;
	}

}
