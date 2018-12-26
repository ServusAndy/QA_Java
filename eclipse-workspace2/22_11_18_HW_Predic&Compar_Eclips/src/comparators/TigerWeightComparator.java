package comparators;

import item.Tiger;
import java.util.Comparator;

public class TigerWeightComparator implements Comparator<Tiger>{

    @Override
    public int compare(Tiger t, Tiger t1) {
        double res = t.getWeight();
        double res1 = t1.getWeight();
        if(res>res1)return 1;
        else if(res<res1)return -1;
        else return 0;
    }
    
}
