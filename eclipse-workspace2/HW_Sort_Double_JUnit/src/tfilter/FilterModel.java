package tfilter;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterModel {
	public static <T> List<T> filter(List<T> orig, Predicate<T> predicate){
		ArrayList<T> result = new ArrayList<>();
		for(T i : orig) {
			if(predicate.test(i)) result.add(i);
		}
		return result;
	}
}
