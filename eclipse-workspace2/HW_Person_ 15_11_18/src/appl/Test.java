package appl;

import java.util.ArrayList;

import item.Person;

public class Test {

	private static final int NUM_PERSON = 9;

	public static void main(String[] args) {

		ArrayList<Person> alp = new ArrayList<Person>();
		

		
		for(int i =0 ; i<NUM_PERSON;i++) {
			alp.add(i, Person.getRandomPerson());
			}
		for(int i =0 ; i<NUM_PERSON;i++) {
			System.out.println(alp.get(i));
		}
		System.out.println("=================================================");
		
		for(int i =0 ; i<Person.filterPersonAge(alp).size();i++) {
			  System.out.println(Person.filterPersonAge(alp).get(i));
		}
	}
	
}
