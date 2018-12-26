import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> cats = new ArrayList<>();
		System.out.println(cats.isEmpty());
		cats.add("Murzik");
		System.out.println(cats.size());
		cats.add("Kisya");
		cats.add("Pussy");
		System.out.println(cats.size());
		for(int i =0;i<cats.size();i++) {
			System.out.print(cats.get(i) + " ");
		}
		System.out.println();
		cats.add(0,"Garfild");
		for(String cat:cats) {
			System.out.print(cat + " ");
		}
		
		System.out.println();
		cats.remove("Kisya");
		for(String cat:cats) {
			System.out.print(cat + " ");
		}
		System.out.println();
		System.out.println(cats.indexOf("Garfild"));
		System.out.println(cats.lastIndexOf("Garfild"));
		System.out.println(cats.contains("Garfild"));
		System.out.println(cats.contains("Kisya"));
		cats.clear();
		System.out.println(cats.isEmpty());
		
		Object[] catsTemp = cats.toArray();
	}

}
