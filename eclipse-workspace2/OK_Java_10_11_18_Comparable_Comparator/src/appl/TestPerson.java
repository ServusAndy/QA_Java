package appl;

import java.util.Arrays;

import item.Person;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person(1980,"Vasya");
		Person p2 = new Person(1980,"Petya");
		Person p3 = new Person(1979,"Masha");
		Person p4 = new Person(1981,"Igor");
		Person p5 = new Person(1978,"Moshe");
		
		Person[] persons = {p1,p2,p3,p4,p5};
		display(persons);
		
		Arrays.sort(persons);
		display(persons);
		
		
	}
	
	public static void display(Person[] arr) {
		for(int i =0;i <arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
