package appl;

import java.util.ArrayList;
import java.util.Collections;

import exception.*;

import item.*;

public class CardTest {

	private static final int DECK_SIZE = 52;
	private static final ArrayList<Card> div1 = new ArrayList<>();
	private static final ArrayList<Card> div2 = new ArrayList<>();
	private static final ArrayList<Card> div3 = new ArrayList<>();
	private static final ArrayList<Card> div4 = new ArrayList<>();

	public static void main(String[] args) throws SuiteException, ValueException {
		ArrayList<Card> deck = new ArrayList<>();
		for (int i = 0; i < DECK_SIZE; i++) {

			int count = 1;
			while (count < 14) {
				deck.add(new Card(count++, "Club"));
			}
			if (deck.size() == 13) {
				count = 1;
				while (count < 14) {
					deck.add(new Card(count++, "Diamond"));
				}
				if (deck.size() == 26) {
					count = 1;
					while (count < 14) {
						deck.add(new Card(count++, "Heart"));
					}
					if (deck.size() == 39) {
						count = 1;
					}
					while (count < 14) {
						deck.add(new Card(count++, "Spade"));
					}
					if (deck.size() == 52)
						break;
				}
			}
		}
		for (Card c : deck)
			System.out.println(c);

		System.out.println("==================================================");

		Collections.shuffle(deck);
		for (Card c : deck)
			System.out.println(c);
		System.out.println("==================================================");

		for (int i = 0; i < DECK_SIZE; i++) {
			if (i >= 0 && i <= 12) {
				div1.add(deck.get(i));
			}
			if (i >= 13 && i <= 25) {
				div2.add(deck.get(i));
			}
			if (i >= 26 && i <= 38) {
				div3.add(deck.get(i));
			}
			if (i >= 39 && i <= 52) {
				div4.add(deck.get(i));
			}

		}

		Person p1 = new Person("Antonio", div1);
		Person p2 = new Person("Mario", div2);
		Person p3 = new Person("Juno", div3);
		Person p4 = new Person("Bruno", div4);
		Person[] players = { p1, p2, p3, p4 };
		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i].toString());
		}

	}

}
