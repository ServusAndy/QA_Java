package comparators;

import java.util.Comparator;

public class CountDivisorsComparator1 implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return numDividors(i1)-numDividors(i2);
	}

	private int numDividors(Integer num) {
		if (num==0)return Integer.MAX_VALUE;
		if(num==1)return 1;
		int res=2;
		int i = 0;
		for(i = 2; i*i<num && i*i>0;i++) {
			if(num%i==0)res = res+2;
		}
		if(i*i==num)res=res+1;
		return res;
	}

}
