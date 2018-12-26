package predicates;

import item.Tiger;
import java.util.function.Predicate;

public class TigerManEaterPredicate implements Predicate<Tiger>{

    @Override
    public boolean test(Tiger t) {
        return t.isManEater()==false?true:false;
    }
    
}