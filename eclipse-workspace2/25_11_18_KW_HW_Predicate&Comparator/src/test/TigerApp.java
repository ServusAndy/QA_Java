package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import comparators.StringComparator;
import comparators.StripesComparator;
import comparators.WeightComparator;
import item.Tiger;
import predicates.ManEaterPredicate;
import randomLib.RandomLibraryException;

public class TigerApp {

	private static final int NUM_TIGERS = 10;

	public static void main(String[] args) throws RandomLibraryException {
		ArrayList<Tiger> alt = new ArrayList<>();
		for(int i = 0; i<NUM_TIGERS;i++)alt.add(Tiger.getRandomTiger());
		
		
		System.out.println(alt);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Collections.sort(alt, new StripesComparator());
		System.out.println(alt);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Collections.sort(alt, new WeightComparator());
		System.out.println(alt);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		Collections.sort(alt, new StringComparator());
		System.out.println(alt);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		ArrayList<Tiger> manEaters = filter(alt,new ManEaterPredicate());
		System.out.println(manEaters);
		
	}
	
	public static <T> ArrayList<T> filter(ArrayList<T> orig, Predicate<T> predicate) {
		ArrayList<T> result = new ArrayList<>();
		for (T t : orig) {
			if (predicate.test(t))
				result.add(t);
		}
		return result;
	}
	

}
