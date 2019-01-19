package test;

import java.util.Arrays;

import appl.Counter;
import comparator.ComparatorReverse;
import item.Child;
import item.MyArray;
import item.Parent;

public class Main {

	public static void main(String[] args) {
		
		Object[] oAr = {"mama",23,'C'};
		
//		Counter<Object> c = new Counter<>(oAr);
//		System.out.println(c.countArrElement());
		
		Child ch = new Child("susi",5,'f');
		Child ch1 = new Child("petya",10,'m');
		Child ch2 = new Child("sara",5,'f');
		
		Parent[] parAr = {ch,ch1,ch2};
		Child[] chAr = {ch,ch1,ch2};
		
//		Counter<Parent> c2 = new Counter<>(parAr);
//		System.out.println(c2.countArrElement());
		
		Counter<Parent> c = new Counter<>();
		System.out.println(c.countArrElement(parAr));
		//System.out.println(c.countArrElement(oAr));
		System.out.println(c.countArrElement(chAr));
		//=======================================
		
		Arrays.sort(chAr);
		for(Child child:chAr) {
			System.out.println(child);
		}
		System.out.println("========================");
		Arrays.sort(chAr,new ComparatorReverse());
		for(Child child:chAr) {
			System.out.println(child);
		}
		
		MyArray<Child> myCh = new MyArray<>();
		myCh.add(ch);
		myCh.add(ch1);
		myCh.add(ch2);
		System.out.println("========================");
		printArr(myCh);
		
		MyArray<Parent> myCh2 = new MyArray<>();
		myCh2.add(ch);
		myCh2.add(ch1);
		myCh2.add(ch2);
		printArr(myCh2);//polimorfism rabotat perestanet, strogo tepesirovaniy!!No s ? extends Parent
	}

	private static void printArr(MyArray<? extends Parent> myCh) {
		for(Parent child: myCh)System.out.println(child);
		
	}

}
