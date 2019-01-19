
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Vasya", 44,3388);
		Person p2 = new Person("Kolya", 12,7532);
		Person[] arr = {p1,p2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort(Person[] arr) {
		for(int i = 0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(compare(arr[j],arr[j+1])>0) {
					Person tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		}
	}
	
	public static int compare(Person p1,Person p2) {
		//return p2.getAge()-p1.getAge();
		return Integer.compare(p1.getAge(), p2.getAge());
	}

}
