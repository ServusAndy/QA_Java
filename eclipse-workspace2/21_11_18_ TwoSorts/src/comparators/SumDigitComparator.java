package comparators;

import java.util.Comparator;

public class SumDigitComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
			
		return sumDigit(i1) - sumDigit(i2);
	}
	
	private int sumDigit(int num) {
		int sum = 0;
		while(num>0) {
			sum = sum +num%10;
			num = num/10;
		}
		return sum;
	}

}
