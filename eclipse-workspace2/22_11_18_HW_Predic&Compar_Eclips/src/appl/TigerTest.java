package appl;

import comparators.*;
import item.Tiger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import predicates.TigerManEaterPredicate;
import randomLib.RandomLibraryException;

public class TigerTest {

	private static final int NUM_TIGERS = 100;

	public static void main(String[] args) throws RandomLibraryException {

		ArrayList<Tiger> alt = new ArrayList<>();
		for (int i = 0; i < NUM_TIGERS; i++)
			alt.add(i, Tiger.getRandomTiger());

		for (Tiger tiger : alt)
			System.out.println(tiger);
		System.out.println("====================================================================");

		Collections.sort(alt);
		for (Tiger tiger : alt)
			System.out.println(tiger);
		System.out.println("=====================================================================");

		Collections.sort(alt, new TigerStripesComparator());
		for (Tiger tiger : alt)
			System.out.println(tiger);
		System.out.println("=====================================================================");

		Collections.sort(alt, new TigerWeightComparator());
		for (Tiger tiger : alt)
			System.out.println(tiger);
		System.out.println("=====================================================================");

		ArrayList<Tiger> notEater = filter(alt, new TigerManEaterPredicate());
		for (Tiger tiger : notEater)
			System.out.println(tiger);

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
