package dto;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person {
	private static final int NUM_NAMES = 10;
	private static final int MAX_AGE = 80;
	private static final double MIN_WEIGHT = 55;
	private static final double MARRIED_PROBABILITY = 0.5;
	private static final double MAX_WEIGHT = 180;
	private static final int MIN_AGE = 20;
	private String name;
	private int age;
	private double weight;
	private boolean married;

	public Person() {
	}

	public Person(String name, int age, double weight, boolean married) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "name: " + name + " age: " + age + " weight: " + String.format("%.1f", weight) + " married: " + married;
	}

	public static Person getRandomPerson() throws RandomLibraryException {
		RandomExt gen = new RandomExt();

		String randomName = "name#" + gen.nextInt(NUM_NAMES);

		int randomAge = gen.nextIntRange(MIN_AGE, MAX_AGE);

		double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);

		boolean randomMarried = gen.nextBoolean(MARRIED_PROBABILITY);

		return new Person(randomName, randomAge, randomWeight, randomMarried);
	}

}
