package coparators;

import java.util.Comparator;

import dto.Card;

public class CardComparator implements Comparator<Card>{

	@Override
	public int compare(Card c1, Card c2) {
		int s1 = suitNum(c1.getSuites());
		int s2 = suitNum(c2.getSuites());
		
		if(s1 != s2) return s1-s2;
		int v1 = c1.getValues();
	    int v2 = c2.getValues();
	    
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
