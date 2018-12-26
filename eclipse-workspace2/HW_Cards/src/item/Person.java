package item;

import java.util.ArrayList;


public class Person {
	private String name;
	private ArrayList<Card> handsCards;

	public Person() {
	}

	public Person(String name, ArrayList<Card> handsCards) {
		this.name = name;
		this.handsCards = handsCards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getHandsCards() {
		return  handsCards;
	}

	public void setHandsCards(ArrayList<Card> handsCards) {
		this.handsCards = handsCards;
	}

	@Override
	public String toString() {
		return "Person name:" + name + " handsCards: " + handsCards;
	}
	
	
}
