package comp;

import java.util.Comparator;

import item.Penguins;

public class SortByPrice implements Comparator<Penguins>{

	@Override
	public int compare(Penguins o1, Penguins o2) {
		
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}
