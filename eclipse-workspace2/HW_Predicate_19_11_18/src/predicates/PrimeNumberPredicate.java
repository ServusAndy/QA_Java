package predicates;

import java.util.function.Predicate;

public class PrimeNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer i) {
		if(i<0)i = -i;
		if(i>1) {
			if(i%2!=0) {
				return true;
			}
		}
		return false;
	}
	
}
