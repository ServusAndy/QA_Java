import java.util.ArrayList;
import java.util.Random;

public class Test {
	
	private static final int NUM_NUM = 20;
	private static Random gen = new Random();
	
	public static void main(String[] args) {
			
			ArrayList<Integer> ali = new ArrayList<>();
			for(int i =0; i<NUM_NUM;i++)ali.add(gen.nextInt(10));
			System.out.println(ali.get(10));
			ali.set(10, 22);
			ali.add(10, 33);
		    System.out.println(ali);
		    ali.remove(3);
		    System.out.println(ali);
		    ali.remove(5);
		    System.out.println(ali);
		    ali.remove((Integer)0);
		    System.out.println(ali);
		    
		    System.out.println(filterRange(ali,4,7));
		    
	}
	
	public static ArrayList<Integer> filterRange(ArrayList<Integer>ali,int from,int to) {
		ArrayList<Integer> result = new ArrayList<>();
		for(int i =0; i< ali.size();i++) {
			if(ali.get(i) >= from && ali.get(i) <= to) result.add(ali.get(i));
		}
		return result;
	}

}
