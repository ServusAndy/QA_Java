package comp;

import java.util.Comparator;

import item.Penguins;

public class SortByWeigth implements Comparator<Penguins>{

	@Override
	public int compare(Penguins o1, Penguins o2) {
		double res1 = o1.getWeigth();
		double res2 = o2.getWeigth();
		if(res1>res2)return 1;
		else if(res1<res2)return -1;
		else
		return 0;
	}

}
