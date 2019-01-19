import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		Integer res = map.put("Vasya", 23);
		System.out.println(res);
		res = map.put("Vasya", 32);
		System.out.println(res);
		
		int value = map.get("Vasya");
		System.out.println(value);
		
		value = map.remove("Vasya");
		System.out.println(value + " size " + map.size());
		map.put("Key", 45);
		
		boolean isRemove = map.remove("Key", 37);//schreib 45!!!!
		System.out.println(isRemove);
		
		boolean isContains = map.containsKey("Key");
		System.out.println(isContains);
		Set<String> kays = map.keySet();
		Collection<Integer> values = map.values();//schickt alle zhalen her
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry:entries) {
			System.out.println("K= " + entry.getKey() + " V= " + entry.getValue());
		}
		
		HashMap<String,Person> persons = new HashMap<>();
		Person p1 = new Person("Vasya",23,"1234567");
		Person p2 = new Person("Olga",23,"1234987");
		Person p3 = new Person("Misha",23,"7654567");
		Person p4 = new Person("Petya",23,"12388867");
		
		persons.put(p1.getId(), p1);
		persons.put(p2.getId(), p2);
		persons.put(p3.getId(), p3);
		persons.put(p4.getId(), p4);
		
		System.out.println(persons.get("1234567"));
		
		TreeMap<Integer,String> names = new TreeMap<>();//TreeSet operaetsa na binarnoe derevo
		names.put(23, "Vasya");
		names.put(12, "Petya");
		names.put(9, "Anna");
		names.put(11, "Nikol");
		Set<Map.Entry<Integer, String>> entriesNames = names.entrySet();
		for(Map.Entry<Integer, String> entry:entriesNames){
			System.out.println("K= " + entry.getKey() + " V= " + entry.getValue());
		}
		
		
		
		
	}

}
