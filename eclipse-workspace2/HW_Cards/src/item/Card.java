package item;

import exception.SuiteException;
import exception.ValueException;

public class Card {
	private int value; // (2-10-figures,1-A,11-J,12-Q,13-K)
	private String suite;// "spades","heart","diamond","club"
	
	public Card() {
	}

	public Card(int value, String suite) throws SuiteException,ValueException{
		if(value >=1 && value<=13) 
		    this.value = value;
			else throw new ValueException("Wrong value of Cards!");
		if(suite=="Spade"||suite=="Club"||suite=="Diamond"||suite=="Heart")
			this.suite = suite;
			else throw new SuiteException("Wrong Cards Suite!");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) throws ValueException {
		if(value >=1 && value<=13) 
	    this.value = value;
		else throw new ValueException("Wrong value of Cards!");
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) throws SuiteException {
		if(suite=="Spade"||suite=="Club"||suite=="Diamond"||suite=="Heart")
			this.suite = suite;
		else throw new SuiteException("Wrong Cards Suite!");
	}

	@Override
	public String toString() {
		return "\nCard value: " + value + " suite: " + suite;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suite == null) {
			if (other.suite != null)
				return false;
		} else if (!suite.equals(other.suite))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	
}
