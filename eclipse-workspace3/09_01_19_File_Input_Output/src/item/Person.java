package item;

import exception.PersonWrongDataException;
import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person implements Comparable<Person>{

	private static final String[] NAMES_ARRAY = {"Sascha","Mascha","Dascha","Pascha","Glascha","Arcascha","Mischa","Moischa","Natascha","Abrascha","Dunkan",
			"Vasya","John"};

	private static final int MIN_AGE = 1;

	private static final int MAX_AGE = 120;

	private static final double MIN_WEIGHT = 10.;

	private static final double MAX_WEIGHT = 140.;

	private static final int MIN_MARRIED_AGE = 18;

	static RandomExt gen = new RandomExt();
	
	private String name;
	private int age;
	private double weight;
	private boolean married;

	public Person() {}
	
	public static Person getPerson(String csv, String delimiter) throws PersonWrongDataException {
		String[] fields = csv.split(delimiter);
		String n = fields[0];
		int a = Integer.parseInt(fields[1]);
		double w = Double.parseDouble(fields[2]);
		boolean m = Boolean.parseBoolean(fields[3]);
		
		return new Person(n,a,w,m);
	}

	public Person(String name, int age, double weight, boolean married) throws PersonWrongDataException {
		try {
			setName(name);
		} catch (PersonWrongDataException e) {
			System.out.println("Name column is set to default: No Name");
			this.name = "No name";
		}
		try {
			setAge(age);
		} catch (PersonWrongDataException e) {
			System.out.println("age is not correct (set to default)");
			this.age = 1;
		}
		try {
			setWeight(weight);
		} catch (PersonWrongDataException e) {
			System.out.println("Weight is not correct (set to default)");
			this.weight = 10.;
		}
		setMarried(married);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) throws PersonWrongDataException {
		if (name == null) {
			throw new NullPointerException("name column is null");
		} else if (name.length() == 0) {
			throw new PersonWrongDataException("name column is empty");
		}
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws PersonWrongDataException {
		if (age < 1) {
			throw new PersonWrongDataException("age less than 1: " + age);
		} else if (age > 120) {
			throw new PersonWrongDataException("Max limit age 120");
		}
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) throws PersonWrongDataException {
		if (weight < 10.) {
			throw new PersonWrongDataException("weight less than 10.: " + weight);
		} else if (weight > 140.) {
			throw new PersonWrongDataException("Max limit of weight 140.");
		}
		this.weight = weight;
	}


	public boolean getMarried() {
		return married;
	}


	public void setMarried(boolean married) {
		this.married = married;
	}


	@Override
	public String toString() {
		return "name: " + name + " age: " + String.format("%2d", age) + " weight: " + String.format("%.1f", weight) + " " + (married? "married" : "single");
	}

	public String toCSV() {
		return name + ";" + age + ";" + String.format("%.1f", weight) + ";" + married;
	}
	
	public static Person getRandomPerson() throws RandomLibraryException, PersonWrongDataException {
          String randomName = gen.nextString(NAMES_ARRAY);
		
		int randomAge = gen.nextIntRange(MIN_AGE,MAX_AGE);
		
		double randomWeight =gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);
		
		boolean randomMarried = randomAge < MIN_MARRIED_AGE ? false : gen.nextBoolean();
		
		return new Person(randomName,randomAge,randomWeight,randomMarried);
	}

	@Override
	public int compareTo(Person o) {
		
		return Integer.compare(this.age,o.getAge());
	}

}
