package dto;

public class Cat {
	private int numberOfStripes;

	public Cat() {
		super();
	}

	public Cat(int numberOfStripes) {
		super();
		this.numberOfStripes = numberOfStripes;
	}

	public int getNumberOfStripes() {
		return numberOfStripes;
	}

	public void setNumberOfStripes(int numberOfStripes) {
		this.numberOfStripes = numberOfStripes;
	}

	@Override
	public String toString() {
		return "Cat [numberOfStripes=" + numberOfStripes + "]";
	}
	
	
}
