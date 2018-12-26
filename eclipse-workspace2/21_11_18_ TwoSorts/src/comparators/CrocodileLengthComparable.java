package comparators;

import java.util.Comparator;

import dto.Crocodile;

public class CrocodileLengthComparable implements Comparator<Crocodile>{

	@Override
	public int compare(Crocodile o1, Crocodile o2) {
		double l1 = o1.getLength();
		double l2 = o2.getLength();
		return l1 > l2 ? 1 : l1 == l2 ? 0 : -1;
	}

}
