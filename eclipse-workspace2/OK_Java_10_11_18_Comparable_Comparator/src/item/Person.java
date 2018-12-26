package item;

public class Person implements Comparable<Person>{
	private int birthYear;
	private String name;
	
	
	public Person(int birthYear, String name) {
		this.birthYear = birthYear;
		this.name = name;
	}


	public int getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(int birthYear) {
		if(birthYear>0 && birthYear<=120)
		this.birthYear = birthYear;
		else
			System.out.println("Wrong birthYear!");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name!=null&&name!="")
		this.name = name;
		else
			System.out.println("Wrong name");
	}


	@Override
	public String toString() {
		return "Person [birthYear=" + birthYear + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Person p) {
		 int result = Integer.compare(this.birthYear,p.birthYear);
		 //this.birthYear - p.birthYear
		 if(result==0)
			 return this.name.compareTo(p.name);
		return result;
	}
	
	
	
}
