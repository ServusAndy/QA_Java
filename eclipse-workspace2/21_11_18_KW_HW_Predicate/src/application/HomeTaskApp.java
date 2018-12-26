package application;

import java.util.ArrayList;
import java.util.function.Predicate;

import predicates.FullSquarePredicate;
import predicates.PrimesPredicate;
import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class HomeTaskApp {

	private static final int NUM_NUM = 30;

	public static void main(String[] args) throws RandomLibraryException {
		RandomExt gen = new RandomExt();
		ArrayList<Integer> ali = new ArrayList<>();
		for(int i =0;i<NUM_NUM;i++)ali.add(gen.nextIntRange(0,300));
		System.out.println(ali);
		
	//	System.out.println(filter(ali,new FullSquarePredicate()));
		
		System.out.println(filter(ali,new PrimesPredicate()));

	}
	
	public static <T> ArrayList<T> filter(ArrayList<T>orig,Predicate<T>predicate){
		ArrayList<T> result =new ArrayList<>();
		for(T t:orig) {
			if(predicate.test(t))result.add(t);
		}
		return result;
	}

}
