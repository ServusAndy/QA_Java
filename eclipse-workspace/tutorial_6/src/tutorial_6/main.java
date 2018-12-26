package tutorial_6;

public class main {

	public static void main(String[] args) {
		
		calc(8,4,5);

	}
	public static void calc(int a, int b, int oper) {
		switch(oper) {
		case 1:
			int sum = a + b;
			System.out.println("Sum: a + b = " + sum);
			break;
		case 2:
			int diff = a - b;
			System.out.println("Differance: a - b = " + diff);
			break;
		case 3:
			int multi = a * b;
			System.out.println("Multiplication: a * b = " + multi);
			break;
		case 4:
			float div = (float)a / b;
			System.out.println("Division: a/b = " + div);
			break;
			default:
				System.out.println("WTF!!!!");
		}
	}

}
