package hw_24_10_18;

public class DataType {
	
	public static void main(String[] args) {
		
		System.out.println("BYTE MAX: " + Byte.MAX_VALUE + " MIN: " + Byte.MIN_VALUE);
		
		System.out.println("SHORT MAX: " + Short.MAX_VALUE + " MIN: " + Short.MIN_VALUE);
		
		System.out.println("INTEGER MAX: " + Integer.MAX_VALUE + " MIN: " + Integer.MIN_VALUE);
		
		System.out.println("LONG MAX: " + Long.MAX_VALUE + " MIN: " + Long.MIN_VALUE);
		
		System.out.println("DOUBLE MAX: " + Double.MAX_VALUE + " MIN: " + Double.MIN_VALUE);
		
		System.out.println("FLOAT MAX: " + Float.MAX_VALUE + " MIN: " + Float.MIN_VALUE);
		
		char c = (char) -1;
		System.out.println("MAX CHAR VALUE: " + Integer.valueOf(c).toString());
		
		
		System.out.println("===============================================================");
		
		String a = changeRadix("9",10,2);
		System.out.println(a);
	}
	
	public static String changeRadix(String numberString, int radixOld, int radixNew) {
		int number = Integer.parseInt(numberString, radixOld);

		String value = Integer.toString(number, radixNew);
		
		return value;
		
	}

}
