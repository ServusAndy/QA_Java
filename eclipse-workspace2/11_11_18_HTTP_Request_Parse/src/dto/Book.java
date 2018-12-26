package dto;

public class Book {
	private String author;
	private String title;
	private int year;
	private double price;
	private boolean pictures;
	
	
	
	public Book() {
		
	}
	
	public Book(String author, String title, int year, double price, boolean pictures) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.price = price;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isPictures() {
		return pictures;
	}

	public void setPictures(boolean pictures) {
		this.pictures = pictures;
	}

	@Override
	public String toString() {
		return "author: " + author + " title: " + title + " year: " + year + " price: " + price + " pictures: "
				+ pictures;
	}
	
	
}
