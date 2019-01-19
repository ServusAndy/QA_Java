package item;


import exception.BookWrongDataException;
import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Book implements Comparable<Book>{

	private static final int MIN_YEAR = 1938;

	private static final int MAX_YEAR = 2018;

	private static final double MIN_PRICE = 70.;

	private static final double MAX_PRICE = 1200.;

	private static final String[] AUTHOR_ARRAY = { "Sagan", "Tolkien", "Salvatore", "Korbjinski", "Kraus", "Afanasev",
			"Nabokov", "Tabletkin", "Bakenbetov", "Eastwood" };

	private static RandomExt gen = new RandomExt();

	private String author;
	private String title;
	private int year;
	private double price;

	public Book() {
	}

	public Book(String author, String title, int year, double price)
			throws BookWrongDataException, NullPointerException {
		try {
			setAuthor(author);
		} catch (BookWrongDataException e) {
			System.out.println("Author column is set to default: No Author");
			this.author = "No Author";
		} catch (NullPointerException e) {
			System.out.println("Author column is null (set to default)");
			this.author = "No Author";
		}
		try {
			setTitle(title);
		} catch (BookWrongDataException e) {
			System.out.println("Title column is set to default: No Title");
			this.title = "No Title";
		} catch (NullPointerException e) {
			System.out.println("Title column is null (set to default)");
			this.title = "No Title";
		}
		try {
			setYear(year);
		} catch (BookWrongDataException e) {
			System.out.println("Year is not correct (set to default)");
			this.year = 1111;
		}
		try {
			setPrice(price);
		} catch (BookWrongDataException e) {
			System.out.println("Price is not correct (set to default)");
			this.price = 1.;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws BookWrongDataException, NullPointerException {
		if (author == null) {
			throw new NullPointerException("Author column is null");
		} else if (author.length() == 0) {
			throw new BookWrongDataException("Author column is empty");
		}
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws BookWrongDataException, NullPointerException {
		if (title == null) {
			throw new NullPointerException("Title column is null");
		} else if (title.length() == 0) {
			throw new BookWrongDataException("Title column is empty");
		}
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws BookWrongDataException {
		if (year < 1111) {
			throw new BookWrongDataException("year before 1111: " + year);
		} else if (year > 2019) {
			throw new BookWrongDataException("year is  greather than 2019");
		}
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws BookWrongDataException {
		if (price < 1.) {
			throw new BookWrongDataException("price can't be less than 1.: " + price);
		} else if (price > 10000.) {
			throw new BookWrongDataException("Max limit of Book price");
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Author: " + author + " Some Title: " + title + " Year: " + year + " Price: "
				+ String.format("%.2f", price);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.getAuthor() != null)
				return false;
		} else if (!author.equals(other.getAuthor()))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.getPrice()))
			return false;
		if (title == null) {
			if (other.getTitle() != null)
				return false;
		} else if (!title.equals(other.getTitle()))
			return false;
		if (year != other.getYear())
			return false;
		return true;
	}

	public static Book getRandomBook() throws RandomLibraryException, NullPointerException, BookWrongDataException {
		String randomAuthor = gen.nextString(AUTHOR_ARRAY);

		String randomTitle = Integer.toString(gen.nextIntRange(999, 99999));

		int randomYear = gen.nextIntRange(MIN_YEAR, MAX_YEAR);

		double randomPrice = gen.nextDoubleRange(MIN_PRICE, MAX_PRICE);

		return new Book(randomAuthor, randomTitle, randomYear, randomPrice);
	}

	@Override
	public int compareTo(Book book) {
//		return this.author.compareTo(book.getAuthor());
//		return this.title.compareTo(book.getAuthor());
		return this.year - book.getYear();
	}

}