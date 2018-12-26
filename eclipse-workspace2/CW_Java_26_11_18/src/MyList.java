import java.util.Iterator;

public class MyList {
	private String[] arr = new String[10];
	private int count = 0;
	
	public void add(String str) {
		if(count<arr.length) {
			arr[count++]=str;
		}
	}
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			int curr = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return curr<count;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return arr[curr++];
			}
		};
	}
}
