package tutorial_2;

import java.util.ArrayList;
import java.util.Iterator;



public class main {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<6; i++) {
			list.add(i);
		}
		int x = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			x += it.next();
		}
		System.out.println(x);
		sysout();
	}
	
	private static void sysout() {
		int f= 1, i =2;
		while(++i<5) {
			f*=i;
			System.out.println(f);
		}
	}

}

