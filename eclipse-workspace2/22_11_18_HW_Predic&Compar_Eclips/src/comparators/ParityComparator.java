package comparators;

import java.util.Comparator;

public class ParityComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer i, Integer i1) {
       return parity(i)-parity(i1); 
    }

    private int parity(Integer i) {
       if(i>0)i=-i;
        return i%2!=0?i:0;
    }
    
}
