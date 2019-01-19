package appl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import exception.PersonWrongDataException;
import item.Person;
import randomLib.RandomLibraryException;

public class PersonFilesApp {

	public static void main(String[] args) throws IOException, RandomLibraryException, PersonWrongDataException {

		ArrayList<Person> alp = new ArrayList<>();
		for (int i = 0; i < 300; i++) {
			alp.add(Person.getRandomPerson());
		}
		Collections.sort(alp,(p1,p2)->p1.getAge()-p2.getAge());

		List<Person> subByAge = subListPersonByAge(alp,45,50);
		List<Person> subByWeight = subListPersonByWeight(alp,70,72);
		List<Person> subByAgeAndMarried = subListPersonByAgeAndMarried(alp, 18, 20,true);
		
		putPersonDataInFile(subByAge, "personInAgeRange.csv");
		putPersonDataInFile(subByWeight, "personInWeightRange.csv");
		putPersonDataInFile(subByAgeAndMarried, "marriedPersonInAgeRange.csv");
	}

	public static void putPersonDataInFile(List<Person> sp, String nameFile) throws IOException {
		File file = new File(nameFile);
		if (!file.exists())
			file.createNewFile();

		String head = "name;age;weight;married";
		PrintWriter pw = new PrintWriter(file); //add with true, to save file, or false to receive !
		pw.println(head);

		for (Person p : sp) {
			pw.println(p.toCSV());
		}
		pw.close();
	}
	
	public static List<Person> subListPersonByAge(ArrayList<Person> orig, int minAge, int maxAge) {
		List<Person> list = new ArrayList<>();
		for (Person p : orig) {
			if (p.getAge() >= minAge && p.getAge() <= maxAge) {
				list.add(p);
			}
		}
		return list;
	}
	  
	public static List<Person> subListPersonByWeight(ArrayList<Person> orig, double minWeight, double maxWeight) {
		List<Person> list = new ArrayList<>();
		for (Person p : orig) {
			if (p.getWeight() >= minWeight && p.getWeight() <= maxWeight) {
				list.add(p);
			}
		}
		return list;
	}
	
	public static List<Person> subListPersonByAgeAndMarried(ArrayList<Person> orig, int minAge, int maxAge,boolean married) {
		List<Person> list = new ArrayList<>();
		for (Person p : orig) {
			if (p.getAge() >= minAge && p.getAge() <= maxAge && p.getMarried()==married) {
				list.add(p);
			}
		}
		return list;
	}
	
		/*
		String head = "name;age;weight;married";
		
		File file = new File("personInAgeRange.csv");
		if(!file.exists()) {
			file.createNewFile();
		}
		PrintWriter pw1 = new PrintWriter(new FileWriter(file));//add with true, to save file, or false to receive
		pw1.println(head);
		for(Person p:hsp) {
			if(p.getAge()>=45 && p.getAge()<=50) {
			pw1.println(p.toCSV());
			}
		}
		pw1.close();
		
		File file1 = new File("personInWeightRange.csv");
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		
		
		PrintWriter pw2 = new PrintWriter(new FileWriter(file1));//add with true, to save file, or false to receive
		pw2.println(head);
		for(Person p:hsp) {
			if(p.getWeight()>=70 && p.getWeight()<=72) {
			pw2.println(p.toCSV());
			}
		}
		pw2.close();
		
		File file2 = new File("marriedPersonInAgeRange.csv");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		PrintWriter pw3 = new PrintWriter(new FileWriter(file2));//add with true, to save file, or false to receive
		pw3.println(head);
		for(Person p:hsp) {
			if(p.getAge()>=18 && p.getAge()<=20 && p.getMarried()==true) {
			pw3.println(p.toCSV());
			}
		}
		pw3.close();
		*/

}
