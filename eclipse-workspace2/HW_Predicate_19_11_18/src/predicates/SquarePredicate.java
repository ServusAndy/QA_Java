package predicates;

import java.util.function.Predicate;

public class SquarePredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer i) {
		if(i<0) {
			i = -i;
		}
		 int tmp = (int)(Math.sqrt(i));
		  return tmp*tmp == i;
	}
}
