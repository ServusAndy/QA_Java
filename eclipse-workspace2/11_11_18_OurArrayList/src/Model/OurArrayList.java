package Model;

public class OurArrayList<T> {

	private int capacity = 10;
	private int size = 0;
	private Object[] arr = new Object[10];

	public OurArrayList() {
	};

	public void add(T data) {

		if (size == capacity)
			enlargeArray();

		arr[size] = data;
		size++;
	}

	T get(int i) {
		if (i < 0 || i >= size)
			return null;
		return (T) arr[i];
	}

	public boolean set(T data, int i) {
		if (i < 0 || i >= size)
			return false;
		arr[i] = data;
		return true;
	}
	
	public boolean contains(T data) {
		for(int i =0;i<size;i++) {
			if(arr[i].equals(data))return true;
		}
		return false;
	}

	public void display() {
		String result = "[";
		for (int i = 0; i < size; i++)
			result = result + arr[i] + " ";
		System.out.println(result + "]");
	}

	private void enlargeArray() {
		int newCapacity = capacity * 2;
		Object[] newArray = new Object[newCapacity];
		for (int i = 0; i < capacity; i++)
			newArray[i] = arr[i];
		arr = newArray;
		capacity = newCapacity;
	}
	
	public boolean addByIndex(T data, int i) {
		if(i<0||i>size) return false;
		
		if(size == capacity)enlargeArray();
		for(int j = size-1;j>=i;j--)arr[j+1]=arr[j];
		arr[i]=data;
		size++;
		return true;
	}
	
	
	
	public T remove(int i){
		if(i<0||i>size)return null;
		
		T oldData = (T) arr[i];
		for(int j = i+1 ;j<size;j++)arr[j-1]=arr[j];
		size--;
		arr[size]=null;
		return oldData;
	}
	
	public int indexOf(T data) {
		for(int i = 0;i<size;i++) {
			if(arr[i].equals(data))return i;
		}
		return -1;
	}
	
	public int size() {
		return size;
	}

}
/*
 *my work))! 
 *
	public T remove(int i) {
		T deleteData = null;
		if (i >= 0 || i < size) {
			deleteData = (T) arr[i];
			for (int j = i; j < size - 1; j++) {
				arr[j] = arr[j + 1];
			}
			size--;
		}
		return deleteData;
	}
	
	public boolean addByIndex(T data, int i) {
		if(i<0)return false;
		for(int j = size+1;j>=i;j--) {
			arr[j]=arr[j-i];
		}
		size++;
		arr[i] = data;
		return true;
	}
}*/


