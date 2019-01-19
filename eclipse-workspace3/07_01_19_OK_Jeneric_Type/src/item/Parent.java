package item;

public class Parent {
	private int age;
	private String name;

	public Parent(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parent [age=" + age + ", name=" + name + "]";
	}
	
	

}
