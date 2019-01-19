package model;

import java.util.Comparator;
import java.util.Iterator;

import iterators.RecursiveIterator;

public class OurTreeSet<T> implements Iterable<T>{
	private Node<T> root = null;
	private Comparator<T> comp;
	private int size = 0;

	public OurTreeSet(Comparator<T> comp) {
		this.comp = comp;
	}

	public boolean add(T data) {
		if (root == null) {
			root = new Node<T>(data);
			size++;
			return true;
		}

		Node<T> current = root;
		Node<T> node;
		while (true) {
			if (comp.compare(data, current.getData()) == 0)
				return false;
			if (comp.compare(data, current.getData()) > 0) {
				if (current.getRight() == null) {
					node = new Node<T>(data);
					current.setRight(node);
					node.setParent(current);
					size++;
					return true;
				}
				current = current.getRight();
			} else {
				if (current.getLeft() == null) {
					node = new Node<T>(data);
					current.setLeft(node);
					node.setParent(current);
					size++;
					return true;
				}
				current = current.getLeft();
			}
		}
	}

	public boolean contains(T data) {
		if (root == null) {
			return false;
		}

		Node<T> current = root;
		while (true) {
			if (comp.compare(data, current.getData()) == 0)
				return true;
			if (comp.compare(data, current.getData()) > 0) {
				if (current.getRight() == null)
					return false;
				current = current.getRight();
			} else {
				if (current.getLeft() == null)
					return false;
				current = current.getLeft();

			}
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean remove(T data) {
		if(data.equals(root.getData())) {
			root = root.getRight();
			root.setLeft(root.getRight().getLeft());
			size--;
			return true;
		}
		Node<T> current;
		while(contains(data)) {
			current = new Node<T>();
			if(current.getParent().getData()==data) {
				current.setParent(current.getRight());
				size--;
			return true;
//		}else if(current.) {
//			
	}
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		
		return new  RecursiveIterator<T>(root);
	}
	
//	тебе нужно на замену искать либо самы левый элемент правой ветки от элемента который удаляешь 
//	и ставить на его место, 
//	либо самый правый левой ветки от элемента который 
}
