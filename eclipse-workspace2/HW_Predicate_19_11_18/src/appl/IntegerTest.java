package appl;

import java.util.ArrayList;
import java.util.function.Predicate;

import predicates.PositivePredicate;
import predicates.PrimeNumberPredicate;
import predicates.RangePredicate;
import predicates.SquarePredicate;
import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class IntegerTest {

	private static final int NUMBERS = 25;
	private static final int MAX_NUM = 1000;
	private static final int MIN_NUM = -1000;

	static RandomExt gen = new RandomExt();

	public static void main(String[] args) throws RandomLibraryException {

		ArrayList<Integer> ali = new ArrayList<>();
		for (int i = 0; i < NUMBERS; i++)
			ali.add(gen.nextIntRange(MIN_NUM, MAX_NUM));
		System.out.println(ali);

		System.out.println(filter(ali, new PositivePredicate()));

		System.out.println(filter(ali, new RangePredicate(-300, 300)));

		System.out.println(filter(ali, new SquarePredicate()));

		System.out.println(filter(ali, new PrimeNumberPredicate()));

	}

	public static ArrayList<Integer> filter(ArrayList<Integer> ali, Predicate<Integer> predicate) {
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer i : ali) {
			if (predicate.test(i))
				result.add(i);
		}
		return result;
	}

}
