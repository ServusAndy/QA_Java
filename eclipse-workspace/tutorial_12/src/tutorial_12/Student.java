package tutorial_12;

public class Student {
	private int id;
	private int age;
	private String name;
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		if(id <= 0) {
			System.out.println("Wrong id!");
			return;
		}
		this.id = id;
	}
	
	public String toString() {
		return "id: " + id + " age: " + age + " name: " + name; 
	}
}
