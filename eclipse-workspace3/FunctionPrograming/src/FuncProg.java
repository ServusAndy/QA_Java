import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FuncProg {

	public static void main(String[] args) {
		//lambda: (параметры) -> {тело метода}  ||    параметры -> одно условие метода ({}не нужно)
		
		Map<String,BinaryOperator<Integer>> map = new HashMap<>();
		map.put("*",(a,b)->a*b);
		map.put("/",(a,b)->a/b);
		map.put("-",(a,b)->a-b);
		map.put("+",(a,b)->a+b);
		System.out.println(map.get("*").apply(4,2));
		System.out.println(map.get("+").apply(4,2));
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,10,4,-4,20,13));
		System.out.println("even numbers: " + find(list,x->x%2==0));
		System.out.println("odd numbers: " + find(list,x->x%2!=0));
		//=============================================================
		
		list.sort(Integer::compare);
		list.forEach(System.out::println);
		
		System.out.println("========");
		
		list.sort(FuncProg::evenOdd);//podsunul svoi method
		list.forEach(System.out::println);
		//list.sort(new FuncProg()::evenOdd); esli method evenOdd ne static !!!!!

	}
	
	public static List<Integer> find(List<Integer> list,Predicate<Integer> predicate){
		List<Integer> res = new ArrayList<>();
		for(Integer num : list) {
			if(predicate.test(num))res.add(num);
		}
		return res;
	}
	
	
	
	private static int evenOdd(int a,int b) {
		if(a%2==0 && b%2!=0)return -1;
		if(a%2!=0 && b%2==0)return 1;
		if(a%2==0 && b%2==0)return a-b;
		return a-b;
	}

}
