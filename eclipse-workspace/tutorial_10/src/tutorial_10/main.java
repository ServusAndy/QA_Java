package tutorial_10;

public class main {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 7, 6, 8, 10, 0, 1, 9, 2 };
		int[] arr1 = { 6, 5, 3, 2, 8, 4, 1, 0, 9, 7, 10 };

		selectionSort(arr);
		printArr(arr);
		System.out.println();
		bubbleSort(arr1);
		printArr(arr1);

	}

	public static void selectionSort(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int min_i = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]");
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

}
