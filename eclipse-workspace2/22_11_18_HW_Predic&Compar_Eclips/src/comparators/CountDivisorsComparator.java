package comparators;

import java.util.Comparator;

public class CountDivisorsComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer i2) {

		return countDivisors(i) - countDivisors(i2);
	}

	private int countDivisors(int n) {
		int c, res = 1;

		for (int i = 2; i * i <= n; i++){
			if (n % i == 0) {
				c = 0;
			while (n % i == 0){
					n /= i;
					c++;
				}
				res *= (c + 1);
			}
		}
		if (n > 1)
			res *= 2;
		return res;
	}

}
