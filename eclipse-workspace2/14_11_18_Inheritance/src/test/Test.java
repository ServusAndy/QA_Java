package test;

import dto.Cat;
import dto.Person;

public class Test {

	public static void main(String[] args) {
		
		Person person = new Person("Vasya");
		
		Cat cat = new Cat(33);
		
		Object obj = new Object(); 
		
		
		obj = person;// upcasting
		
		Person p = (Person) obj;// downcasting
		System.out.println(p.getName());
		
		obj = cat;
		Cat cat2 = (Cat)obj;
		System.out.println(cat2.equals(cat2));

	}

}
