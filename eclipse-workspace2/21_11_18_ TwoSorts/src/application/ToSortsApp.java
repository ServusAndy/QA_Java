package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import comparators.CrocodileLengthComparable;
import comparators.CrocodileTeethComparable;
import comparators.SumDigitComparator;
import dto.Crocodile;

public class ToSortsApp {
	
	private static final int NUM_NUM = 30;
	static Random gen = new Random();
	public static void main(String[] args) {
		
		ArrayList<Integer> ali = new ArrayList<>();
		for(int i =0; i<NUM_NUM;i++)ali.add(gen.nextInt(100));
		System.out.println(ali);
		
		Collections.sort(ali);
		System.out.println(ali);
		
		Collections.sort(ali, new SumDigitComparator());
		System.out.println(ali);
		
		System.out.println("================================================================================");
		
		ArrayList<Crocodile> alc = new ArrayList<>();
		alc.add(new Crocodile("Sasha",32,1.76));
		alc.add(new Crocodile("Masha",22,1.56));
		alc.add(new Crocodile("Pascha",12,1.86));
		alc.add(new Crocodile("Natasha",18,1.73));
		alc.add(new Crocodile("Dasha",55,1.78));
		alc.add(new Crocodile("Glasha",28,1.80));
		
		for(Crocodile c: alc)System.out.println(c);
		System.out.println("================================================================================");
		Collections.sort(alc, new CrocodileTeethComparable());
		for(Crocodile c: alc)System.out.println(c);
		System.out.println("================================================================================");
		Collections.sort(alc, new CrocodileLengthComparable());
		for(Crocodile c: alc)System.out.println(c);
		
	}

}
