import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.TreeSet;

import exception.PersonWrongDataException;
import item.Person;
import randomLib.RandomLibraryException;

public class TestSecond {

	private static final int NUM_NUM = 30;

	public static void main(String[] args) throws RandomLibraryException, PersonWrongDataException, IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("writtenPersons.txt"));
		
	/*
		String line = null;
		File file = new File("writtenPersons.txt");
		if(!file.exists())file.createNewFile();
		PrintWriter pw = new PrintWriter(new FileWriter(file)); //PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		for(int i =0;i<NUM_NUM;i++) {
			pw.println(Person.getRandomPerson());
		}
		pw.close();*/
		
		TreeSet<Person> tsp = new TreeSet<>();
		for(int i =0;i<100;i++) {
			tsp.add(Person.getRandomPerson());
		}
		for(Person p: tsp)System.out.println(p);
		System.out.println("=========================================");
//		for(Person p: tsp) {
//			if(p.getAge()>=45 && p.getAge()<=50) {
//				System.out.println(p);
//			}
//		}
		
		String line = null;
		File file = new File("writtenPersons.txt");
		if(!file.exists())file.createNewFile();
		PrintWriter pw = new PrintWriter(new FileWriter(file)); //PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		for(Person p:tsp) {
			if(p.getAge()>=45 && p.getAge()<=50) {
				pw.println(p);
			}
		}
		pw.close();
		
	}

}
