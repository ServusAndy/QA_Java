package myCompiler;

public class TestMain {

	public static void main(String[] args) {
		
		 String s1 = "blablacar";
		 String s2 = "blab";
		 int l = s1.length() - s2.length();
		 
		 int dif = 0;
		 for(int i =0 ; i<l;i++)dif = s1.charAt(i) - s2.charAt(i);
			 System.out.println(dif);

	}

}
