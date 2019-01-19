
public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private int id;
	
	
	public Person() {}


	public Person(String name, int age,int id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Name: " + name + " age: " + age + " id: "+ id + "]";
	}


	@Override
	public int compareTo(Person p) {
		
		return this.id - p.id;
	}


	

}
