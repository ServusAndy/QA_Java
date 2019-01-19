package appl;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import exception.PersonWrongDataException;
import item.Person;
import randomLib.RandomLibraryException;

public class PersonApp {

	private static final int NUM_PERSON = 10000;

	public static void main(String[] args) throws PersonWrongDataException, RandomLibraryException {
	/*	ArrayList<Person> alp = new ArrayList<>();
		for (int i = 0; i <100000; i++) {
			alp.add(Person.getRandomPerson());
		}
		TreeMap<Person, Integer> tmpi = new TreeMap<>();

		for (Person p : alp) {
			if (tmpi.containsKey(p)) {
				tmpi.put(p, tmpi.get(p) + 1);
			} else {
				tmpi.put(p, 1);
			}
		}
		System.out.println(myToStringKV(tmpi));

		TreeMap<String, Integer> tmp = new TreeMap<>();
		for (Person p : alp) {
			String key = "";
			if (p.getAge() >= 10 && p.getAge() < 20) {
				key = "persons from 10 to 19 years";
				if (tmp.containsKey(key)) {
					tmp.put(key, tmp.get(key) + 1);
				} else {
					tmp.put(key, 1);
				}
			}
			if (p.getAge() >= 20 && p.getAge() < 30) {
				key = "persons from 20 to 29 years";
				if (tmp.containsKey(key)) {
					tmp.put(key, tmp.get(key) + 1);
				} else {
					tmp.put(key, 1);
				}
			}
			if (p.getAge() >= 30 && p.getAge() < 40) {
				key = "persons from 30 to 39 years";
				if (tmp.containsKey(key)) {
					tmp.put(key, tmp.get(key) + 1);
				} else {
					tmp.put(key, 1);
				}
			}
		}
		System.out.println(myToStringKV(tmp));
	*/
		TreeSet<Person> tsp = new TreeSet<>();
		for(int i =0;i<NUM_PERSON;i++) {
			tsp.add(Person.getRandomPerson());
		}
		
		TreeMap<Integer,Integer> tmii = new TreeMap<>();
		for(Person p : tsp) {
			int key = p.getAge()/10;
			if(tmii.get(key)==null) {
				tmii.put(key, 1);
			}else {
				tmii.put(key, tmii.get(key)+1);
			}
		}
		
		for(Entry<Integer,Integer> e : tmii.entrySet()) {
			int low = e.getKey()*10;
			int high = low+10;
			System.out.println(low + "-" + high + " : " + e.getValue());
		}
		
	}

	public static <K, V> String myToStringKV(Map<K, V> map) {
		String[] entries = new String[map.size()];
		int counter = 0;
		for (K key : map.keySet())
			entries[counter++] = key + " : " + map.get(key);
		return String.join("\n", entries);
	}

}

//for(Map.Entry<Person, Integer> person:tmpi.entrySet()) {
//System.out.println((person.getKey()+ " : "+person.getValue()));
//
//}
