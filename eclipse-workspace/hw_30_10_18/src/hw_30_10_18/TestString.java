package hw_30_10_18;

public class TestString {

	public static void main(String[] args) {

		String mystr = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		char a = 'k';
		char b = 's';

		System.out.println(ourContains(mystr, a));

		System.out.println(ourIndexOf(mystr, b));

		int countOfChar = countChar(mystr, b);
		System.out.println(countOfChar);
		
		String mystr1 = "Vasya";
		String mystr2 = "Vasya";
		System.out.println(ourEquelsIgnoreCase(mystr1,mystr2));
		
	}

	public static boolean ourContains(String str, char c) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				return true;
		}
		return false;
	}

	public static int ourIndexOf(String str, char c) {
		int flag = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				int tmp = str.indexOf(str.charAt(i));
				return tmp;
			}
		}
		return flag;
	}

	public static int countChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}
		return count;
	}
	
	public static boolean ourEquelsIgnoreCase(String s1,String s2){
		if(s1.equals(s2)) {
			return true;
		}
		return false;
	}
}
