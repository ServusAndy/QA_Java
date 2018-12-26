package comparators;

import java.util.Comparator;

import dto.Crocodile;

public class CrocodileTeethComparable implements Comparator<Crocodile>{

	@Override
	public int compare(Crocodile o1, Crocodile o2) {
		
		return o1.getNumberOfTeeth() - o2.getNumberOfTeeth();
	}

}
