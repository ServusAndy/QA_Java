package predicates;

import java.util.function.Predicate;

public class FullSquarePredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		
		return isFullSquare(t);
	}
	
	private boolean isFullSquare(int num) {
		num = num <0?-num:num;
		for(int i = 0 ; i*i<=num;i++) {
			if(i*i==num)return true;
		}
		return false;
	}

}
