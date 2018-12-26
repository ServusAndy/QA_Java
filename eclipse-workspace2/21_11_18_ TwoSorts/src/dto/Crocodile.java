package dto;

public class Crocodile {
	private String name;
	private int numberOfTeeth;
	private double length;
	
	public Crocodile() {}

	public Crocodile(String name, int numberOfTeeth, double length) {
		this.name = name;
		this.numberOfTeeth = numberOfTeeth;
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfTeeth() {
		return numberOfTeeth;
	}

	public void setNumberOfTeeth(int numberOfTeeth) {
		this.numberOfTeeth = numberOfTeeth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Crocodile [name=" + name + ", numberOfTeeth=" + numberOfTeeth + ", length=" + length + "]";
	}
	
	
}
