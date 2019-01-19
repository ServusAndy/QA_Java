import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
	
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Vasya", 23);
		map.put("Petya", 34);
		System.out.println(map.put("Vasya",35));
		System.out.println(map.size());
		
		Integer value = map.get("Vasya");
		System.out.println(value);
		
		value = map.getOrDefault("fgg",123);
		System.out.println(value);
		
		map.replace("aaa", 33);
		System.out.println(map.get("aaa"));
		
		System.out.println(map.remove("aaa"));
		
		System.out.println(map.remove("Vasya", 35));
		
//		Set<String> keys = map.keySet();
//		for(String k :keys) {
//			Integer v = map.get(k);
//			map.put(k, v+10);
//		}
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		for(Entry<String,Integer> e:entries) {
			e.setValue(e.getValue()+10);
		}
		
		System.out.println(map.get("Petya"));
	}

}
