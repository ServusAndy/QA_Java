
public class Otlatchik {

	public static void main(String[] args) throws ArithmeticException, Exception {
		
		double a = 10;
		double b = 3;
		String str = "+";
		Double res = calc(a,b,str);
		System.out.println(res);

	}

	private static double calc(double a, double b, String oper) throws ArithmeticException,Exception{
		switch (oper) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
			
		default:
			throw new Exception("Wrong oper");
		}
	}

}
