package application;

import java.util.ArrayList;
import java.util.function.Predicate;

import dto.Person;
import interfaces.MarriedPredicate;
import interfaces.WeightPredicate;
import randomLib.RandomLibraryException;

public class FilterArrayListApp {

	private static final int NUM_PERSON = 20;

	public static void main(String[] args) throws RandomLibraryException {

		ArrayList<Person> peaple = new ArrayList<>();
		for (int i = 0; i < NUM_PERSON; i++)
			peaple.add(Person.getRandomPerson());

		for (Person person : peaple)System.out.println(person);
		
		System.out.println("=======================================");
		int minAge = 40;
		int maxAge = 60;
		for (Person person : filterAge(peaple, minAge, maxAge))System.out.println(person);
		
		System.out.println("=======================================");
		for (Person person : filterMarried(peaple))System.out.println(person);
		
		System.out.println("=======================================");
		for(Person person: filter(peaple, new MarriedPredicate()))System.out.println(person);;
		
		System.out.println("=======================================");
		double minWeight = 50;
		double maxWeight = 100;
		for(Person person: filter(peaple, new WeightPredicate(minWeight,maxWeight)))System.out.println(person);;// foreach!!!
		
	/*	for(Person person: filter(peaple, new WeightPredicate(minWeight,maxWeight)))System.out.println(person);;// foreach!!!
	 * 
	 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!SAME THINK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * 
		ArrayList<Person> res = filter(peaple, new WeightPredicate(minWeight,maxWeight));
		for(int i =0 ; i <res.size();i++)System.out.println(res.get(i)); */
		

	}

	private static ArrayList<Person> filterAge(ArrayList<Person> peaple, int minAge, int maxAge) {
		ArrayList<Person> result = new ArrayList<>();
		for (Person person : peaple) {
			if (person.getAge() >= minAge && person.getAge() <= maxAge)
				result.add(person);
		}
		return result;
	}
	
	private static ArrayList<Person> filterMarried(ArrayList<Person> peaple){
		ArrayList<Person> result = new ArrayList<>();
		for(Person person: peaple) {
			if(person.isMarried())result.add(person);
		}
		return result;
	}
	
	private static ArrayList<Person> filter(ArrayList<Person> orig,Predicate<Person> predicate){
		ArrayList<Person> result = new ArrayList<>();
		for(Person person:orig) {
			if(predicate.test(person))result.add(person);
		}
		return result;
	}
	
	
}
