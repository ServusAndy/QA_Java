package items;

public class Book {

	private String author;
	private String title;
	private int page;

	public Book(String author, String title, int page) {
		if (author != null && author != "")
			this.author = author;
		else {
			this.author = "Jon Doe";
			System.out.println("Wrong author!author is null!");
		}
		this.title = title;
		this.page = page;
	}

	public Book() {
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override//govorid ja preopredelyau metod!-drugaya logika
	public String toString() {
		return "author: " + author + " title: " + title + " page: " + page;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}
		if (page != other.page) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}
	
	
}
