package item;

import java.util.ArrayList;

import randomLib.RandomExt;

public class Person {
	
	private static final int MAX_AGE = 120;

	private static final double MIN_WEIGHT = 10.;

	private static final double MAX_WEIGHT = 180.;

	private static final int MIN_MARRIED_AGE = 18;
	
	private static final String[] NAMES_ARRAY = {"Davina","Margery","Rona","Fiona","Ramsy","Gregor","Gerald","Wilyams","Robert","Dunkan"};

	
	
	private String name;
	private int age;
	private double weight;
	private boolean married;
	
	public Person() {}

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
		if(name!=null&&name!="")
		this.name = name;
		else
			System.out.println("Wrong name!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0 && age<=120)
		this.age = age;
		else
			System.out.println("Wrong age!");
	}

	public double getWeigth() {
		return weight;
	}

	public void setWeigth(double weight) {
		if(weight>0 && weight<200)
		this.weight = weight;
		else
			System.out.println("Wrong weight!");
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Weight: " + String.format("%.1f", weight) + " Married: " + married;
	}
	
	public static Person getRandomPerson(){
		RandomExt gen = new RandomExt();
		
		 String randomName = gen.nextString(NAMES_ARRAY);
		
		 int randomAge = gen.nextInt(MAX_AGE);
		
		double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);
		
		boolean randomMarried = randomAge < MIN_MARRIED_AGE ? false : gen.nextBoolean();
		
		return new Person(randomName,randomAge,randomWeight,randomMarried);
	}
	
	public static ArrayList<Person> filterPersonAge(ArrayList<Person> alp){
		ArrayList<Person> result = new ArrayList<Person>();
		for(int i = 0 ; i<alp.size();i++) {
			if(alp.get(i).getAge()>=50 && alp.get(i).getAge()<=80) {
				result.add(alp.get(i));
			}
		}
		return result;
	}
	
	
}
