package predicates;

import java.util.function.Predicate;

public class RangePredicate implements Predicate<Integer>{
	private int min;
	private int max;
	
	

	public RangePredicate() {
		this.min = 0;
		this.max = 0;
	}

	public RangePredicate(int min, int max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean test(Integer i) {
		
		return i>=min && i<=max;
	}

}
