package appl;

import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

import exception.PersonWrongDataException;
import item.Person;

public class BufferPersonSecondApp {

	public static void main(String[] args) throws IOException, PersonWrongDataException {
		
		Person p = Person.InputPerson();
		Person p1 = Person.InputPerson();
		Person p2 = Person.InputPerson();
	
		HashSet<Person> hsp = new HashSet<>();
		hsp.add(p);
		hsp.add(p1);
		hsp.add(p2);
		System.out.println(hsp.size());
		for(Person pr :hsp) {
			System.out.println(pr);
			
			
		}
	}
}
