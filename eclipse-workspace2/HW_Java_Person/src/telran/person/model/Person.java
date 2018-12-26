package telran.person.model;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Person implements Comparable<Person>{
	//private  final int MAX_AGE = 120;
	//private  final int MIN_AGE = 18;	
	//private  final String[] NAMES_ARRAY = {"Davina","Margery","Rona","Fiona","Ramsy","Gregor","Gerald","Wilyams","Robert","Dunkan"};
	
	private String name;
	private int age;
	private int id;
	
	
	
	public Person() {}
	
	public Person(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Id: " + id;
	}
	@Override
	public int compareTo(Person o) {
		return Integer.compare(id, o.id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
	/*
	public Person getRandomPerson() throws RandomLibraryException{
		RandomExt gen = new RandomExt();
		
		 String randomName = gen.nextString(NAMES_ARRAY);
		
		 int randomAge = gen.nextIntRange(MIN_AGE, MAX_AGE);
		
		 int uniqueId =gen.nextInt(10000);
		  
		 return new Person(randomName,randomAge,uniqueId);
	}*/
	
}
