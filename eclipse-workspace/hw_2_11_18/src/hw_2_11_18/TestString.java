//Home work 2.11.18 Andrey Zelener
package hw_2_11_18;

public class TestString {

	public static void main(String[] args) {

		String s = "Delorian";
		String s1 = "lor";

		System.out.println(isSubstring(s, s1));

		System.out.println("====================================");

		String s2 = "This is a true Havy Metal Man! They can't stop us! Let them try, For heavy metal We will die";

		System.out.println(countWords(s2, "metal"));

		System.out.println("====================================");

	}

	public static boolean isSubstring(String s, String s1) {// true if s1 is substring of s OR s substring of s1
		if (s1 == null || s == null)
			return false;
		if (s.contains(s1))
			return true;
		return false;
	}

	public static int countWords(String s, String word) {
		int count = 0;
		if (s==null || word==null ) return -1;
			String[] arrStr = s.split(" ");
			for (int i = 0; i < arrStr.length; i++) {
				if (word.trim().equalsIgnoreCase(arrStr[i]))
					count++;
			}
			return count;
		
	}
}
