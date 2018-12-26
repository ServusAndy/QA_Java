package tutorial_8;

public class main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int[] arr1 = {9,4,7,3,5,8,6};
		
		reversArr(arr1);
		
	}
	public static void reversArr(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		for(int i = left; i < arr.length; i++) {
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
		System.out.print(arr[i]);
		
	}
	}
}
