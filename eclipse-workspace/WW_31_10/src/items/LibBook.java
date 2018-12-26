package items;

public class LibBook extends Book {

	private int catNumber;

	public LibBook(String author, String title, int page, int catNumber) {

		super(author, title, page);
		this.catNumber = catNumber;
	}

	public LibBook() {
		super();

	}

	public int getCatNumber() {
		return catNumber;
	}

	public void setCatNumber(int catNumber) {
		this.catNumber = catNumber;
	}
	
	public String toString() {
		
		return super.toString() + " catNumber: " + catNumber;
	}

}
