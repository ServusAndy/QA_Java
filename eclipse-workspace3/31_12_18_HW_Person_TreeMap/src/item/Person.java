package item;


import exception.PersonWrongDataException;
import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person implements Comparable<Person>{

	private static final int MAX_AGE = 120;

	private static final double MIN_WEIGHT = 10.;

	private static final double MAX_WEIGHT = 100.;

	private static final int MIN_MARRIED_AGE = 18;
	
	private static final String[] NAMES_ARRAY = {"Sascha","Mascha","Dascha","Pascha","Glascha","Arcascha","Mischa","Moischa","Natascha","Abrascha"};

	private static final int MIN_AGE = 2;

	private static RandomExt gen = new RandomExt();
	
	private String name;
	private int age;
	private double weight;
	private boolean married;
	
	
	public Person() {}
	
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
		} else if (weight > 100.) {
			throw new PersonWrongDataException("Max limit of weight 100.");
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
		return "name: " + name + " age: " + String.format("%4d", age) + " weight: " + String.format("%.1f", weight) + " " + (married? "married" : "single");
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (married ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (married != other.married)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	public static Person getRandomPerson() throws PersonWrongDataException, RandomLibraryException {
		String randomName = gen.nextString(NAMES_ARRAY);
		
		int randomAge = gen.nextIntRange(MIN_AGE,MAX_AGE);
		
		double randomWeight =gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);
		
		boolean randomMarried = randomAge < MIN_MARRIED_AGE ? false : gen.nextBoolean();
		
		return new Person(randomName,randomAge,randomWeight,randomMarried);
	}


	@Override
	public int compareTo(Person p) {
		
	//	return this.name.compareTo(p.getName());
		return this.age - p.getAge();
	}
	
}

