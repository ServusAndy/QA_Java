package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {

	private static final int NUM_NUM = 1000000;
	private static final int NUM_ITER = 1000;

	public static void main(String[] args) {
		Random gen = new Random();
	ArrayList<Integer> ali = new ArrayList<>();
	HashSet<Integer> hsi = new HashSet<>();
	
	int num = 0;
	for(int i = 0 ;i<NUM_NUM;i++) 
	{
		num = gen.nextInt(Integer.MAX_VALUE);
		hsi.add(num);
		ali.add(num);
	}
	
	System.out.println(hsi.size());
	System.out.println(ali.size());
	
	long t1 = System.currentTimeMillis();
	for(int i=0; i<NUM_ITER;i++)ali.contains(-1);
	//ali.contains(-1);
	long t2 = System.currentTimeMillis();
	System.out.println("ArrayList : " + (t2-t1) + "ms");
	
	t1 = System.currentTimeMillis();
	for(int i=0; i<NUM_ITER;i++)hsi.contains(-1);
	//ali.contains(-1);
	t2 = System.currentTimeMillis();
	System.out.println("HashSet : " + (t2-t1) + "ms");
	

	}

}
