import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("name 1");
		list.add("name 2");
		list.add("name 3");
		list.add("name 4");
		list.add("name 5");
		list.add("name 6");
		list.add("name 7");
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		String e = list.remove(0);
		System.out.println(e);
		
		System.out.println(list.remove("name 2"));
		
		e = list.get(3);
		System.out.println(e);
		
		boolean res = list.contains("name 4");
		list.trimToSize();
		list.add(0, "new name");
	//	String[] arr = (String[]) list.toArray();
		String[] arr1 = list.toArray(new String[0]);
		for(String s : arr1)System.out.println(s);
		String[] arr2 = list.toArray(arr1);
		System.out.println(arr2.length);
		
		e = list.set(0, "test Set");
		System.out.println(e);
//		ArrayDeque<String> arr = new ArrayDeque<>();
//		arr.add("rjfkjg");
//		for(String s:list)System.out.println(s);
		
		removeInRange(list, 0,3 );
		System.out.println(list.size());
		list.sort((o1,o2)->o1.compareTo(o2));
		
		HashSet<String> set = new HashSet<>();
		set.addAll(list);
		for(String str:set)System.out.println("Set e: " + str);

	}
	
	public static void removeInRange(ArrayList<?> list,int fromIndx,int toIndx) {
		list.subList(fromIndx, toIndx).clear();
	}

}
