package appl;

import exception.BookWrongDataException;
import item.Book;

public class BookApp {

	public static void main(String[] args) throws BookWrongDataException {
		Book b = new Book("","LordOfTheRing",489,.349,true);
		Book b1 = new Book("K.Sagan","The Demon-Haunted World:Science as a Candle in the Dark",345,.220,true);
		
		System.out.println(b);
		System.out.println(b1);

	}

}
