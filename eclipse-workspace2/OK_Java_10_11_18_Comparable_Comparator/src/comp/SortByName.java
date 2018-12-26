package comp;

import java.util.Comparator;

import item.Penguins;

public class SortByName implements Comparator<Penguins>{

	@Override
	public int compare(Penguins o1, Penguins o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
