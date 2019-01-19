import java.util.Arrays;

public class MyList<T> {
	private T[] arr;
	private int count;
	
	public MyList() {
		arr = (T[]) new Object[10];
		count = 0;
	}
	
	public void add(T obj) {
		if(count>=arr.length) {
			arr = Arrays.copyOf(arr, arr.length*2);
		}
		arr[count++]=obj;
	}
	
	public T get(int index) {
		if(index<0 || index>=0) {
			throw new IndexOutOfBoundsException(String.valueOf(index));
		}
		return arr[index];
	}

	public int size() {
		return count;
	}
	
	public void addAll(MyList<T> from) {
		for(int i=0;i<from.size();i++) {
			add(from.get(i));
		}
	}
	
	public void getAll(MyList<T> to) {
		for(int i =0;i<count;i++) {
			to.add(arr[i]);
		}
	}
}
