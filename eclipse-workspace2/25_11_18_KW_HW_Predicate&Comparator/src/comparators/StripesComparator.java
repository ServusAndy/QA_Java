package comparators;

import java.util.Comparator;

import item.Tiger;

public class StripesComparator implements Comparator<Tiger>{

	@Override
	public int compare(Tiger t, Tiger t1) {
		
		return t.getNumberOfStripers()-t1.getNumberOfStripers();
	}

}
