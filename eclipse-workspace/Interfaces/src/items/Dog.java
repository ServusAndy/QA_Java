package items;

import Inter.IBarkable;

public class Dog extends Animals implements IBarkable{
	private String name;

	public Dog(String kind, String subspacies, String name) {
		super(kind, subspacies);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog "+ super.toString() + " name: " + name;
	}

	@Override
	public void bark() {
	System.out.println("Gav!gav!!!!");
		
	}
	
	
}
