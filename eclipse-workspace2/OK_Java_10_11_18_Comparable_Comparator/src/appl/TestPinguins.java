package appl;

import java.util.Arrays;

import comp.SortByName;
import comp.SortByPrice;
import comp.SortByWeigth;
import item.Penguins;
import item.Person;

public class TestPinguins {

	public static void main(String[] args) {
		
		Penguins p1 = new Penguins(7.45,300,"Napoleon");
		Penguins p2 = new Penguins(5.45,500,"Pushkin");
		Penguins p3 = new Penguins(10.45,2500,"Kovalsky");
		Penguins p4 = new Penguins(11.35,3000,"Vasya");
		Penguins p5 = new Penguins(9.99,300,"Shkiper");
		
		Penguins[] pins = {p1,p2,p3,p4,p5};
		display(pins);
		
		SortByWeigth sb = new SortByWeigth();
		Arrays.sort(pins, sb);
		display(pins);
		
		Arrays.sort(pins, new SortByPrice());
		display(pins);
		
		Arrays.sort(pins, new SortByName());//Comparator
		display(pins);
		
		Arrays.sort(pins);//Comparable
		display(pins);
		
	}
	
	public static void display(Penguins[] arr) {
		for(int i =0;i <arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
