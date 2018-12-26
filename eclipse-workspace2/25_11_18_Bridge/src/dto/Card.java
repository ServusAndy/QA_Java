package dto;

public class Card {
	
	public static String[] suites = {"spade ","club  ","diamond","heart "};
	public static String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private int num;
	private String suit;
	private int value;
	
	
	public Card(int num) {
		this.num = num;
		
		suit = suites[num/13];
		value = num%13;
	}
	
	public String getSuites() {
		return suit;
	}

	public int getValues() {
		return value;
	}

	public String toString() {
		return suit + " " + values[value];
	}

	public int getNum() {
		return num;
	}
	
}