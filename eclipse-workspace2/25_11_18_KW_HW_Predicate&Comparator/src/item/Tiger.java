package item;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Tiger {

	private static final String[] NAMES_ARRAY = { "Tigra", "Leon", "Tog", "Took", "Much", "Greg", "Zevs", "Agr", "Don",
			"Din", "Rex", "Dex", "Lex", "Bim", "Ciri", "Fugi", "Hagr", "Wix", "Fixy", "Simba", "Pury", "Jery", "Oxy",
			"Mopsy", "Yolo" };
	private static final int MAX_STRIPES = 180;
	private static final int MIN_STRIPES = 5;
	private static final double MAX_WEIGHT = 120;
	private static final double MIN_WEIGHT = 20;

	private String name;
	private int numberOfStripers;
	private double weight;
	private boolean manEater;

	public Tiger() {
	}

	public Tiger(String name, int numberOfStripers, double weight, boolean manEater) {
		this.name = name;
		this.numberOfStripers = numberOfStripers;
		this.weight = weight;
		this.manEater = manEater;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfStripers() {
		return numberOfStripers;
	}

	public void setNumberOfStripers(int numberOfStripers) {
		if (numberOfStripers > 0 && numberOfStripers < 200)
			this.numberOfStripers = numberOfStripers;
		else
			this.numberOfStripers = 5;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeigth(double weight) {
		if (weight > 0 && weight < 130)
			this.weight = weight;
		else
			this.weight = 5;
	}

	public boolean isManEater() {
		return manEater;
	}

	public void setManEater(boolean manEater) {
		this.manEater = manEater;
	}

	@Override
	public String toString() {
		return "\nTiger " + "name: " + name + " NumberOfStripers: " + numberOfStripers + " Weight:"
				+ String.format("%.1f", weight) + " ManEater: " + manEater;
	}

	public static Tiger getRandomTiger() throws RandomLibraryException {
		RandomExt gen = new RandomExt();

		String randomName = gen.nextString(NAMES_ARRAY);

		int randomNumberOfStripers = gen.nextIntRange(MIN_STRIPES, MAX_STRIPES);

		double randomWeight = gen.nextDoubleRange(MIN_WEIGHT, MAX_WEIGHT);

		boolean randomManEater = gen.nextBoolean();

		return new Tiger(randomName, randomNumberOfStripers, randomWeight, randomManEater);
	}
}