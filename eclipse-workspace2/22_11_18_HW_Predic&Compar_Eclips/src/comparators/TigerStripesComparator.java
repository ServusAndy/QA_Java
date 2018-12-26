package comparators;

import item.Tiger;
import java.util.Comparator;

public class TigerStripesComparator implements Comparator<Tiger>{

    @Override
    public int compare(Tiger t, Tiger t1) {
       return t.getNumberOfStripers()-t1.getNumberOfStripers();
}
    
}
