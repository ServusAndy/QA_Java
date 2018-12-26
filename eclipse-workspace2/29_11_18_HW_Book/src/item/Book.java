package item;

public class Book implements Comparable<Book>{
	private String author;
	private String title;
	private int pages;
	private double weight;
	private boolean cover;
	
	
	public Book() {}


	public Book(String author,String title, int pages, double weight, boolean cover) {
		this.author = author;
		this.title = title;
		this.pages = pages;
		this.weight = weight;
		this.cover = cover;
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


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		if(pages>0)
		this.pages = pages;
		else this.pages = 1;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		if(weight>0)
		this.weight = weight;
		else this.weight = 1.;
	}


	public boolean isCover() {
		return cover;
	}


	public void setCover(boolean cover) {
		this.cover = cover;
	}


	@Override
	public String toString() {
		return "Author: " + author + " Title:" + title + " Pages: " + pages + " Weight: " + weight + " Cover: " + cover;
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
		if (other.getAuthor() == null) {
			if (other.getAuthor() != null)
				return false;
		} else if (!author.equals(other.getAuthor()))
			return false;
		if (this.cover != other.isCover())
			return false;
		if (this.pages != other.getPages())
			return false;
		if (this.title == null) {
			if (other.getTitle() != null)
				return false;
		} else if (!this.title.equals(getTitle()))
			return false;
		if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.getWeight()))
			return false;
		return true;
	}


	@Override
	public int compareTo(Book b) {
		if(this.weight>b.getWeight())
			return 1;
		return this.weight<b.getWeight()?-1:0;
	}
	
}
