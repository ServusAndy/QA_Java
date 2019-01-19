import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String,Integer> des = new HashMap<>();
		String roomer1 = "Vasya Pupkin";
		int dira1 = 10;
		String roomer2 = "Petya Pupkin";
		int dira2 = 10;
		String roomer3 = "Masha Gurkin";
		int dira3 = 11;
		
		System.out.println(des.put(roomer1,dira1));
		System.out.println(des.put(roomer2, dira2));
//		System.out.println(des.put(roomer2, 22));
		System.out.println(des.put(roomer3, dira3));
		System.out.println(des);
		
		System.out.println(des.size());
		System.out.println(des.values());
		System.out.println(des.keySet());
		
		for(Integer room:des.values()) {
			System.out.println(room);
		}
		for(String roomer:des.keySet()) {
			System.out.println(roomer);
		}
		System.out.println("========================================");
		System.out.println(des.remove(roomer2));
		System.out.println("========================================");
		
		for(Map.Entry<String, Integer> roomer:des.entrySet()) {
			if(roomer.getValue()==10) {
				System.out.println(roomer.getKey());
			}
		}
		
		TreeMap<String,Integer> des2 = new TreeMap<>();
		
		des2.put(roomer1, 1);
		des2.put(roomer2, 1);
		des2.put(roomer3, 1);
		System.out.println(des2);
		des2.clear();
		System.out.println(des2);
		System.out.println(des2.isEmpty());

	}

}
