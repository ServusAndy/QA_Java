package tutorial;

public class Main {

	public static void main(String[] args) {
		TestClass t = new TestClass("Wight of Man on the Moon: ");

		int[] arr = { 6, 7, 4, 10, 9, 2, 1, 3, 8, 5 };
		printArr(arr);
		//selectionSort(arr);
		bublleSort(arr);
		printArr(arr);
		
		System.out.println(t.calcWightofMoon(78, 0.42));

	}
	public static void selectionSort(int[] ar) {
		int tmp;
		for(int i = 0 ; i < ar.length; i++) {
			int min = ar[i];
			int min_i = i;
			for(int j = i+1; j<ar.length; j++) {
				if(ar[j] < min) {
					min = ar[j];
					min_i = j;
				}
			}
			if(i != min_i) {
				tmp = ar[i];
				ar[i]=ar[min_i];
				ar[min_i] = tmp;
			}
		}
	}

	public static void bublleSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length -1-i; j++) {
				if (ar[j] > ar[j+1]) {
				int tmp = ar[j];
				ar[j] = ar[j+1];
				ar[j+1] = tmp;
				}
			}
		}
	}

	public static void printArr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print("[" + ar[i] + "]");
		}
		System.out.println();
	}

}
