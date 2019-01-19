import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		ArrayList<String> stringAL = new ArrayList<>();
		stringAL.get(12);
		HashMap<Integer,String> stringHM = new HashMap<>();
		stringHM.get(12); 
		
		 HashMap<Integer,Integer> sumDig = new HashMap<>();
		
		System.out.println(sumDig);
		
		sumDig.put(46, 10);
		sumDig.put(73, 10);
		sumDig.put(87, 15);
		
		System.out.println(sumDig);
		System.out.println(sumDig.get(77));
		System.out.println(sumDig.containsKey(46));
		
		for(Integer key: sumDig.keySet()) {
			System.out.println(key + " : " + sumDig.get(key));
		}
		
//		System.out.println(myToStringKV(sumDig));
		
		String[] words = {"to","be","or","not","to","be","that","is","the","question"};
		TreeMap<String,Integer> dict = new TreeMap<>();
		for(int i = 0; i<words.length;i++) {
			dict.put(words[i], words[i].length());
		}
//		System.out.println(dict);
//		System.out.println(myToStringKV(dict));
		
//		System.out.println("++++++++++++++++++++++++++++++++");
//		for(Map.Entry<String, Integer> m:dict.entrySet()) {
//			if(m.getKey() == "question") {
//				System.out.println(m.getValue());
//			}
//		}
//		System.out.println("++++++++++++++++++++++++++++++++");
		
		
		ArrayList<Integer> ali = new ArrayList<>();
		Random gen = new Random();
		for(int i =0;i<10000000;i++) {
			ali.add(gen.nextInt(10));
		}
		TreeMap<Integer,Integer> tmii = new TreeMap<>();
		
		for(Integer i:ali) {
			if(tmii.containsKey(i)) {
				tmii.put(i, tmii.get(i)+1);
			}else {
				tmii.put(i, 1);
			}
		}
		System.out.println(myToStringKV(tmii));
//--------------------------------------------------------------------------------------
		String str = "Never trauble traubles till traubles trauble you. This only doubles traubles and traubles other too";
		String[] arr = str.split(" ");
		TreeMap<String,Integer> ts = new TreeMap<>();
		
		for(int i =0;i<arr.length;i++) {
			String key = arr[i];
			if(ts.containsKey(key)) {
				ts.put(arr[i], ts.get(key)+1);
			}
			else {
				ts.put(key, 1);
			}
		}
		
		System.out.println(myToStringKV(ts));
		
	}
	
//	public static String myToString(Map<Integer,Integer> map) {
//		String[] entries = new String[map.size()];
//		int counter = 0;
//		for(Integer key: map.keySet())entries[counter++] = key + " : " + map.get(key);
//		return "{" + String.join(",",entries)+ "}";
//	}
//	
//	public static String myToString1(Map<String,Integer> map) {
//		String[] entries = new String[map.size()];
//		int counter = 0;
//		for(String key: map.keySet())entries[counter++] = key + " : " + map.get(key);
//		return "{" + String.join(" , ",entries)+ "}";
//	}
	
	public static <K,V> String myToStringKV(Map<K,V> map) {
		String[] entries = new String[map.size()];
		int counter = 0;
		for(K key: map.keySet())entries[counter++] = key + " : " + map.get(key);
		return String.join("\n\n",entries);
	}
	
	
//	public String toString(Map<String,Integer> map) {
//		String res = "";
//		for(Map.Entry<Integer, Integer> : map.entrySet()) {
//			res = res + vehicle.getValue().toString() + "\n";
//		}
//		res = res + "Car free parking = " + (parkLots.get("Car")-occupiedLots.get("Car")) + "\n" + 
//				 "Truck free parking = " + (parkLots.get("Truck")-occupiedLots.get("Truck")) + "\n" +
//				 "Moto free parking = " + (parkLots.get("Moto")-occupiedLots.get("Moto")) + "\n";
//		return res;
//	}
}
