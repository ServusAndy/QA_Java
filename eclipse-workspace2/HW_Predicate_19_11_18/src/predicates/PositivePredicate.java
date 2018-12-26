package predicates;

import java.util.function.Predicate;

public class PositivePredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {

		return i > 0;
	}

}
