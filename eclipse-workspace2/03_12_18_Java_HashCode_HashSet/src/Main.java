import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Vasya".hashCode());

		HashSet<String> names = new HashSet<>();
		names.add("Vasya");
		names.add("Petya");
		names.add("Sofa");

		for (String str : names) {

		}

		HashSet<Person> persons = new HashSet<>();
		persons.add(new Person("Petya", 1111));
		persons.add(new Person("Petya", 2222));
		persons.add(new Person("Vasya", 3333));
		persons.add(new Person("Vasya", 4444));

//		boolean flag = false;// zalipuha chto prokatit
//		while (flag) {//bez while cicl v iteratore ne ostanovitsa i vse kaput;
//			flag = true;
//			for (Person p : persons) {
//				if (p.getName().equals("Vasya")) {
//					flag = false;
//					persons.remove(p);
//					break;
//				}
//			}
//		}
		
		Iterator<Person> iterator = persons.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			if(p.getName().equals("Vasya")) {
				iterator.remove();
			}
		}
		
	}

}
