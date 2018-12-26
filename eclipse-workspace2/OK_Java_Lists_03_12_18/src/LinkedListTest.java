import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> cats = new LinkedList<>();
		
		System.out.println(cats.isEmpty());
		cats.add("Pisun");
		System.out.println(cats.isEmpty());
		cats.forEach(System.out::println);
		cats.addFirst("Galya");
		System.out.println("=============================");
		cats.forEach(System.out::println);
		cats.removeFirst();
		System.out.println("=============================");
		cats.forEach(System.out::println);
		System.out.println("=============================");
		cats.addLast("Masha");
		System.out.println(cats.getLast());
		System.out.println(cats.getFirst());
		
		cats.clear();
		System.out.println(cats.isEmpty());
	}

}
