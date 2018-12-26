package hw_6_11_18;

public class TestString {

	private static String[] arrStr = new String[5];
	private static String[] arrStr1 = new String[5];
	
	public static void main(String[] args) {

		System.out.println(compare("1", "12"));
		
		System.out.println("=========================");
		
		String s = "masha33@mail.ru";

		printStringArray(splitMail(s, '@'));
		printStringArray(splitMailAfter(s, '@'));

	}

//	public static int myCompare(String str, String str1) {
//		if(str instanceof String && str == null)return 0;
//		if(str1 instanceof String && str == null)return 0;
//	}

	public static int compare(String str1, String str2) {
		int res;
		int num1 = isNumber(str1);
		int num2 = isNumber(str2);

		if (num1 != -1 && num2 != -1)
			res = num1 - num2;
		else
			res = str1.compareTo(str2);

		return res;
	}

	public static Integer isNumber(String str) {
		int length = str.length();
		int res = str.codePointCount(0, length);
		return res;
	}

	public static String[] splitMail(String str, char delimiter) {
		String parseStr = "";
		String str1 = "";
		int to = 0;
		if (delimiter != 0)
			parseStr = Character.toString(delimiter);
		to = str.indexOf(parseStr);
		str1 = str.substring(0, to);
		for (int i = 0; i < arrStr.length; i++)
			arrStr[i] = str1;
		return arrStr;

	}

	public static String[] splitMailAfter(String str, char delimiter) {
		String parseStr = "";
		String str1 = "";
		int from = 0;
		if (delimiter != 0)
			parseStr = Character.toString(delimiter);
		from = str.indexOf(parseStr);
		str1 = str.substring(from + 1);
		for (int i = 0; i < arrStr1.length; i++)
		 arrStr1[i] = str1;
		return arrStr1;

	}

	public static void printStringArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
