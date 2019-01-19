package comparator;

import java.util.Comparator;

import item.Child;

public class ComparatorReverse implements Comparator<Child>{

	@Override
	public int compare(Child o1, Child o2) {
		
		return Character.compare(o2.getSex(), o1.getSex());
	}

}
