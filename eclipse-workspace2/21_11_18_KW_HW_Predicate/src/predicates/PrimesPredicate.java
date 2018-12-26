package predicates;

import java.util.function.Predicate;

public class PrimesPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		return isPrime(t);
	}

	private boolean isPrime(int num) {
		num = num > 0?num:-num;
		if(num < 2)return false;
		if(num<4)return true;
		if(num%2==0)return false;
		for(int i = 3; i*i <= num && i*i >0;i = i+2) {
			if(num%i == 0)return false;
		}
		return true;
	}

}
