package tutorial_9;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		
		shuffleArr(arr);

	}
	public static void shuffleArr(int[] arr) {
		Random rand = new Random();
		int tmp = 0;
		for(int i = 0; i < arr.length; i++) {
				arr[i]= rand.nextInt(20);
				System.out.print("[" + arr[i] + "]");
			
		}
	}

}
