package comparators;

import java.util.Comparator;

import item.Tiger;

public class StringComparator implements Comparator<Tiger>{

	@Override
	public int compare(Tiger o1, Tiger o2) {		
		String s=o1.getName();		
		String s1 = o2.getName();		
	
	
	return s.compareTo(s1);
	}

}
