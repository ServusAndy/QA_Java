package application;

import dto.Book;

public class HttpRequestParseTest {
	
	public static final String request = "http://mySite/add?author=Tolstoy&title=Buratino&year=2018&price=47.50&title=Buratino";	
	
	public static void main(String[] args) {
		
		 int indexQuestion = request.lastIndexOf('?');
		 String data = request.substring(indexQuestion+1);
		 
		 String[] properties = data.split("&");
		 
		 
		 for(int i = 0 ; i< properties.length;i++)System.out.println(properties[i]);
		 
		 String bookAuthor = null;
		 String bookTitle = null;
		 int bookYear = 0;
		 double bookPrice = 0;
		 boolean bookPictures = false;
		 
		 for(int i = 0 ; i< properties.length;i++) {
			 String[] key_value = properties[i].split("=");
			 String key = key_value[0];
			 String value = key_value[1];
			 switch (key) {
			 case "author": bookAuthor = value;break;
			 case "title" : bookTitle = value;break;
			 case "year" : bookYear = Integer.parseInt(key_value[1]);break;
			 case "price" : bookPrice = Double.parseDouble(key_value[1]);break;
			 case "pictures" : bookPictures = Boolean.parseBoolean(key_value[1]);break;
			 }
		 }
		 Book book = new Book(bookAuthor, bookTitle, bookYear,bookPrice,bookPictures);
		 System.out.println(book);
	}

}
