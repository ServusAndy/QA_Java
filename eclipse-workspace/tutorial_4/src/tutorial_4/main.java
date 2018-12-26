package tutorial_4;

public class main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum = sumArr(arr);
		System.out.println(sum);

	}
	public static int sumArr(int[] array) {
		int sum = 0;
		for(int i = 0 ; i<array.length; i++) {
			if(array[i] != 0) {
				sum = sum + array[i];
			} 		
		}
		return sum;
	}
}
