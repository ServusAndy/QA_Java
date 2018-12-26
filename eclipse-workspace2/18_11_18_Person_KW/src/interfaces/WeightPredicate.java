package interfaces;

import java.util.function.Predicate;

import dto.Person;

public class WeightPredicate implements Predicate<Person> {

	private double minWeight;
	private double maxWeight;

	public WeightPredicate(double minWeight, double maxWeight) {
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	@Override
	public boolean test(Person person) {
		
		return person.getWeight() >= minWeight && person.getWeight() <=maxWeight;
	}

}
