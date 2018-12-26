package Appl;

import items.Book;
import items.EducationLibBook;
import items.LibBook;

public class Test {

	public static void main(String[] args) {

		Book book1 = new Book();
		LibBook lb1 = new LibBook("Tolstoy","Burotino",234,11111);
		LibBook lb2 = new LibBook("Tolstoy","Burotino",234,11111);
		System.out.println(lb1.equals(lb2));
		
		EducationLibBook elb = new EducationLibBook();
		
		Object ob1 = new Book();
		Object ob2 = book1;
		Object ob3 = lb1;
		Object ob4 = elb;
		
		EducationLibBook test = (EducationLibBook)ob4;
		System.out.println(test.getCatNumber());
		
		if(ob3 instanceof LibBook)
		{
		LibBook test2 = (LibBook)ob3;
		System.out.println(test2.getCatNumber());
		}
		
		Object[] libs = {ob1,ob2,ob3,elb};
		
		for(int i =0; i<libs.length;i++) {
			if(libs[i] instanceof EducationLibBook) {
				EducationLibBook elb2 =(EducationLibBook)libs[i];
				System.out.println(elb2.getSubject());
			}
		}
		
		
		

		System.out.println(book1);
		 System.out.println(lb1);

	}

}
