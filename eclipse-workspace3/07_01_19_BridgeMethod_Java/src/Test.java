
public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 32;
		Person p2 = new Person();
		p2.age = 37;
		
		PersonComparator compr = new PersonComparator();
		int i = compr.compare(p1, p2);
		
	//	Method[] methods = PersonComparator.class.Dacl...
	}

}
