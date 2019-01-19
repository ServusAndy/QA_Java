package appl;

public class Counter <T>
{
//	private T[] ar;
//	
//	public Counter(T[] ar) {
//		super();
//		this.ar = ar;
//	}
	
	public int countArrElement(T[] ar) {
		int count =0;
		for(int i=0;i<ar.length;i++)count++;
		return count;
	}
}
