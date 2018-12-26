package interfaces;

import java.util.function.Predicate;

import dto.Person;

public class MarriedPredicate implements Predicate<Person>{

	@Override
	public boolean test(Person person) {
		
		return person.isMarried();
	}

}
