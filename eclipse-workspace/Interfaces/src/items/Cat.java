package items;

import Inter.IMewable;

public class Cat extends Animals implements IMewable{
	private String name;
	private String color;
	
	public Cat(String kind, String subspacies, String name, String color) {
		super(kind, subspacies);
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat " + super.toString() + " name: " + name + " color: " + color;
	}

	@Override
	public void mew() {
		System.out.println("Meauuu!!");
		
	}
	
	
	
	
}
