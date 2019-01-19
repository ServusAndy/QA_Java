package appl;

import java.util.TreeSet;

import exception.BookWrongDataException;
import item.Book;
import randomLib.RandomLibraryException;

public class BookApp {

	private static final int NUM_NUM = 100;

	public static void main(String[] args) throws NullPointerException, RandomLibraryException, BookWrongDataException {
		TreeSet<Book> tsb = new TreeSet<>();
		
		for(int i = 0;i<NUM_NUM;i++) {
			tsb.add(Book.getRandomBook());
		}
		tsb.forEach(System.out::println);
		System.out.println("====================================================================");
		
		Book fromBook = new Book();
		fromBook.setYear(1980);
		Book toBook = new Book();
		toBook.setYear(1991);
		
		for(Book b: tsb.subSet(fromBook, toBook)) {
			System.out.println(b);
		}

	}

}
