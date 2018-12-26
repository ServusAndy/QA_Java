package item;

public class Card implements Comparable<Card>{
	
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

	@Override
	public int compareTo(Card c) {
		int s1 = suitNum(this.getSuites());
		int s2 = suitNum(c.getSuites());
		
		if(s1 != s2) return s1-s2;
		int v1 = this.getValues();
	    int v2 = c.getValues();
	    
	    v1 = v1 == 0 ? 13 : v1;
	    v2 = v2 == 0 ? 13 : v2;
		
		return v1-v2;
	}
	
	public int suitNum(String strings) {
		switch(strings) {
		case"spade":return 0;
		case"club":return 1;
		case"diamond":return 2;
		case"heart":return 3;
		}
		return -1;
	}
	
}