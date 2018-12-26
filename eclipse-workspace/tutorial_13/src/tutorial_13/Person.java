package tutorial_13;

public class Person {

	private static int count = 0;
	private static int age = 30;
	
	public Person() {
		count++;
	}
	
	public void printCount() {
		System.out.println(count);
	}
	
	public static void printAge() {
		System.out.println(age);
	}
}
