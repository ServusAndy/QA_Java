package comparators;

import java.util.Comparator;

import item.Cats;

public class ComparatorByAge implements Comparator<Cats>{

	@Override
	public int compare(Cats o1, Cats o2) {
		
		return o1.getAge()-o2.getAge();
	}

}
