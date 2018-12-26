package appl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


import item.Book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("J.R.Tolkien","LordOfTheRing",489,634.,true);
		Book b2 = new Book("J.Simenon","Megre",320,349.,true);
		Book b3 = new Book("R.Salvatore","Apostate",330,424.,false);
		Book b4 = new Book("K.Sagan","The Science,Like a Light in The Dark",345,342.,true);
		Book b5 = new Book("K.Smith","Klerks",211,180.,false);
		Book[] books = {b1,b2,b3,b4,b5};
		
		ArrayList<Book> arrayBooks = new ArrayList<>(Arrays.asList(books));
		
		arrayBooks.forEach(System.out::println);
		System.out.println("=============================================================");
		
		Collections.sort(arrayBooks,(bk,bk1)->bk.getPages()-bk1.getPages());
		
		arrayBooks.forEach(System.out::println);
		System.out.println("=============================================================");
		
		Collections.sort(arrayBooks);
		
		arrayBooks.forEach(System.out::println);
		

	}

}
