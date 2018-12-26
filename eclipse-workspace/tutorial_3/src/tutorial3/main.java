package tutorial3;

public class main {

	public static void main(String[] args) {
		int revers = reversNumber(156);
		System.out.println(revers);

	}
	public static int reversNumber(int num) {
		int revers = 0;
		while(num != 0) {
			revers = revers * 10 + num % 10;
			num /=10;
		}
		return revers;
	}

}
