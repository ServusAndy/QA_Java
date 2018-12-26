package bookstore;

public class Book {
	private String author;
	private String title;
	private int year;
	private double price;
	private boolean pictures;

	public Book() {

	}

	public Book(String author, String title, int yaer, double prise, boolean pictures) {
		this.author = author;
		this.title = title;
		this.year = yaer;
		this.price = prise;
		this.pictures = pictures;
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

	public int getYaer() {
		return year;
	}

	public void setYaer(int yaer) {
		this.year = yaer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrise(double prise) {
		this.price = prise;
	}

	public boolean isPictures() {
		return pictures;
	}

	public void setPictures(boolean pictures) {
		this.pictures = pictures;
	}

	@Override
	public String toString() {
		return "author: " + author + " title: " + title + " yaer: " + year + " prise: " + price + " pictures: "
				+ pictures;
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
			if (other.getAuthor() != null) {
				return false;
			}
		} else if (!author.equals(other.getAuthor())) {
			return false;
		}
		if (pictures != other.isPictures()) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.getPrice())) {
			return false;
		}
		if (title == null) {
			if (other.getTitle() != null) {
				return false;
			}
		} else if (!title.equals(other.getTitle())) {
			return false;
		}
		if (year != other.getYaer()) {
			return false;
		}
		return true;
	}



}
