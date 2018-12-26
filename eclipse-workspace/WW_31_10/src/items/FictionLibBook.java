package items;

public class FictionLibBook extends LibBook{
	
	private String genre;

	public FictionLibBook(String author, String title, int page, int catNumber, String genre) {
		super(author, title, page, catNumber);
		this.genre = genre;
	}

	public FictionLibBook() {
		super();
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString() + " FictionLibBook: " + genre;
	}
	
	
}
