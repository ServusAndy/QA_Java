package predicates;

import java.util.function.Predicate;

import item.Tiger;

public class ManEaterPredicate implements Predicate<Tiger>{

	@Override
	public boolean test(Tiger t) {
		if(t.isManEater()==true)return true;
		return false;
	}

}
