package appl;

import comparators.CountDivisorsComparator;
import comparators.CountDivisorsComparator1;
import comparators.ParityComparator;

import java.util.ArrayList;
import java.util.Collections;


import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class IntTest {

    private static final int NUM_NUM = 20;
    public static void main(String[] args) throws RandomLibraryException {

        RandomExt gen = new RandomExt();
        ArrayList<Integer> ali = new ArrayList<>();
        for (int i = 0; i < NUM_NUM; i++) {
            ali.add(gen.nextIntRange(-100, 100));
        }
        System.out.println(ali);

        Collections.sort(ali);
        System.out.println(ali);

        Collections.sort(ali, new ParityComparator());
        System.out.println(ali);
        
        Collections.sort(ali, new CountDivisorsComparator());
        System.out.println(ali);      
        System.out.println("================================");
        Collections.sort(ali, new CountDivisorsComparator1());
        System.out.println(ali);     
   }
 
}


