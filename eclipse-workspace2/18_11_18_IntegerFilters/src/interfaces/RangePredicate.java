package interfaces;

import java.util.function.Predicate;

public class RangePredicate implements Predicate<Integer> {
	private int min;
	private int max;

	public RangePredicate() {
	}

	public RangePredicate(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean test(Integer i) {
		return i >= min && i<=max;
	}

}
