package item;

import exception.BookWrongDataException;

public class Book {
	private String author;
	private String title;
	private int pages;
	private double weight;
	private boolean cover;
	
	public Book() {}
	
	public Book(String author,String title,int pages,double weight,boolean cover) throws BookWrongDataException {
		try {
			setAuthor(author);
		} catch (BookWrongDataException e) {
			System.out.println("Author column is set to default: No Author");
			this.author = "No Author";
		}
		try {
			setTitle(title);
		} catch (BookWrongDataException e) {
			System.out.println("Title column is set to default: No Title");
			this.title = "No Title";
		}
		try {
			setPages(pages);
		} catch (BookWrongDataException e) {
			System.out.println("Pages is set to default: 0");
			this.pages = 0;
		}
		try {
			setWeight(weight);
		} catch (BookWrongDataException e) {
			System.out.println("Weight is set to default: 0");
			this.weight = 0;
		}
		setCover(cover);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws BookWrongDataException {
		if(author==null) {
			throw new BookWrongDataException("Author column is null");
		}
		else if (author.length()==0) {
			throw new BookWrongDataException("Author column is empty"); 
		}
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws BookWrongDataException {
		if(title==null) {
			throw new BookWrongDataException("Title column is null");
		}
		else if (title.length()==0) {
			throw new BookWrongDataException("Title column is empty"); 
		}
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws BookWrongDataException {
		if(pages<3)throw new BookWrongDataException("Pages can't be less than 3");
		else if(pages > 1200) {
			throw new BookWrongDataException("Pages can't be greather than 1200");
		}
		this.pages = pages;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) throws BookWrongDataException {
		if(weight<0.1)throw new BookWrongDataException("Weight can't be less than 0.1");
		else if(weight > 15.) {
			throw new BookWrongDataException("Weight can't be greather than 15.");
		}
		this.weight = weight;
	}

	public boolean isCover() {
		return cover;
	}

	public void setCover(boolean cover) {
		this.cover = cover;
	}

	@Override
	public String toString() {
		return "Author: " + author + " Title: " + title + " Pages: " + pages + " Weight: " + weight + " Cover: "
				+ cover;
	}
	
	
}	
