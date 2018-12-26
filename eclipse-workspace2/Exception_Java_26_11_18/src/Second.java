
public class Second {

	public static void main(String[] args) throws ArithmeticException, Exception {
		int a = 10;
		int b = 0;
		double res;
		try {
			res = div(a, b);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End programm");
		// ================================================
		try {
			System.out.println(div2(3, 10));
		} catch (DivBy10Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		double y = 10;
		double x = 3;
		String str = "+";
		Double result = calc(y,x,str);
		System.out.println(result);

	}

	public static double div(int a, int b) throws Exception {
		return a / b;
	}

	public static boolean div2(int a, int b) throws DivBy10Exception {
		if (b == 10)
			throw new DivBy10Exception("Div by 10");
		if (a / b > 0)
			return true;
		return false;
	}

	public static double calc(double a, double b, String oper) throws ArithmeticException,Exception{
		
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
