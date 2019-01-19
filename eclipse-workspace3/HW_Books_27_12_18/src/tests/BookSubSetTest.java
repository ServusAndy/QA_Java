package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import exception.BookWrongDataException;
import item.Book;

class BookSubSetTest {
	private static final int NUM_NUM = 100;
	static TreeSet<Book> tsb = new TreeSet<>();
	static TreeSet<Book> checkSet = new TreeSet<>();
	static Book fromBook = new Book();
	static Book toBook = new Book();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		for (int i = 0; i < NUM_NUM; i++) {
			tsb.add(Book.getRandomBook());
		}
		tsb.forEach(System.out::println);
		System.out.println("====================================================================");
		fromBook.setYear(1980);
		toBook.setYear(1991);
	}


	@Test
	void subSetTest1() throws BookWrongDataException {
		for (Book b : tsb.subSet(fromBook, toBook)) {
			checkSet.add(b);
			assertEquals(checkSet.contains(b), tsb.contains(b));
		}
	}

	@Test
	void subSetTest2() throws BookWrongDataException {
		int b = tsb.subSet(fromBook, toBook).size();
		int b1 = checkSet.size();
		assertEquals(b, b1);		
	}
	
	@Test
	void subSetTest3() throws BookWrongDataException {
			int expected = tsb.size() - tsb.subSet(fromBook, toBook).size();
			int actual = tsb.size() - checkSet.size();
			assertEquals(expected, actual);
	}
	
	@Test
	void uniqueTest() {
		boolean flag = true;
		Iterator<Book> itr = tsb.iterator();
		Book prev = itr.next();
		while(itr.hasNext()) {
			Book curr = itr.next();
			if(curr.equals(prev)) {
				flag = false;
				break;
			}
			prev=curr;
		}
		assertTrue(flag);
	}
	
	
}
