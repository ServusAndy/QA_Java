package item;

public class Child extends Parent implements Comparable<Child>{
	private char sex;

	public Child(String name, int age , char sex) {
		super(name,age);
		this.sex = sex;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return super.toString() + " sex: " + sex + "]";
	}

	@Override
	public int compareTo(Child o) {
		
		return Character.compare(sex, o.sex);
	}
	
	
}
