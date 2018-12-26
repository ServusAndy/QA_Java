package telran.person.comparators;

import java.util.Comparator;

import telran.person.model.Person;

public class PersonAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getAge() - p2.getAge();
	}

}
