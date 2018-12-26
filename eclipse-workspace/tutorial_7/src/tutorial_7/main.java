package tutorial_7;

public class main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum =sumArr(arr);
		System.out.println(sum);
		
		printEvenNumbers(arr);
		
	}
	public static int sumArr(int[] arr) {
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				tmp = tmp + arr[i];
			}
		}
		return tmp;
	}
	public static void printEvenNumbers(int[] arr) { // печатает чётные цифры 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0 && arr[i]%2 == 0) { // поменять 0 на 1 для нечётный цифр
				System.out.print("[" + arr[i] + "]");
			}			
		}
	}
	
}