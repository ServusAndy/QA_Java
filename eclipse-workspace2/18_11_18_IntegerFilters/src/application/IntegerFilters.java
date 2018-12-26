package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

import interfaces.EvenPredicate;
import interfaces.MultipleOfPredicate;
import interfaces.RangePredicate;

public class IntegerFilters {

	private static final int NUM_NUM = 20;
	static Random gen = new Random(123456789);
	public static void main(String[] args) {
		
		ArrayList<Integer> ali = new ArrayList<>();
		for(int i = 0 ; i<NUM_NUM;i++)ali.add(100 + gen.nextInt(900));
		System.out.println(ali);
		
		System.out.println(filter(ali,new EvenPredicate()));
		
		System.out.println(filter(ali, new MultipleOfPredicate(19)));
		
		int min = 300;
		int max =500;
		System.out.println(filter(ali, new RangePredicate(min,max)));
		
	}
	
	private static ArrayList<Integer> filter(ArrayList<Integer> ali,Predicate<Integer> predicate) {
		ArrayList<Integer> res = new ArrayList<>();
		for(Integer i : ali) {
			if(predicate.test(i))res.add(i);
		}
		return res;
	}

}

