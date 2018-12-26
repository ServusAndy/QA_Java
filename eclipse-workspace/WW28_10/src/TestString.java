
public class TestString {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		System.out.println(str);

		String str1 = "Bye";
		System.out.println(str1);
		
		char[] hello = {'H','e','l','l','o','!'};
		String str2 = new String(hello);
		System.out.println(str2);
		
		byte[] byteToStr = {72,101,108,108,111,33};
		String str3 = new String(byteToStr);
		System.out.println(str3);
		
		String str4 = new String(byteToStr,1,2);
		System.out.println(str4);
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println("========================================");
		System.out.println(str2.intern()==str3.intern());
		//=========================================
		str3 = new String("Hello!").intern();
		
		System.out.println(str2.intern()==str3);
		
		System.out.println(str3.charAt(4));
		
		System.out.println(str3.length());
		
		System.out.println("=============================================");
		
		char[] charStr = str3.toCharArray();
		for(int i = 0;i<charStr.length;i++) {
			System.out.println(charStr[i]);
		}
		
		str3 = "mama mila ramu";
		charStr = str3.toCharArray();
		for(int i =charStr.length-1; i >=0;i--) {
			System.out.print(charStr[i]+"");
		}
		System.out.println();
		
		String[] strTest = str3.split(" ");// rasdelitel strok
		for(int i = 0;i<strTest.length;i++) {
			System.out.println(strTest[i]);
		}
		
		System.out.println("=================================");
		str3 = " mama mila ramu  ";
		System.out.println(str3);
		str3 = str3.trim();
		System.out.println(str3);
		
		System.out.println("=================================");
		
		System.out.println(str1.indexOf('y'));
		System.out.println(str1.lastIndexOf('y'));
		System.out.println(str1.replace('y', 'o'));
		
		System.out.println("=================================");
		System.out.println(str3 = str3.toUpperCase()); 
		System.out.println(str3 = str3.toLowerCase());
		
		System.out.println("=============================");
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println("lenght = " + sb1.length() + " " + "capacity = " + sb1.capacity());	
		
		sb1 = new StringBuilder(10);
		System.out.println("lenght = " + sb1.length() + " " + "capacity = " + sb1.capacity());
		
		sb1 = new StringBuilder("Hello");
		System.out.println("lenght = " + sb1.length() + " " + "capacity = " + sb1.capacity());
		
		
	}

}
