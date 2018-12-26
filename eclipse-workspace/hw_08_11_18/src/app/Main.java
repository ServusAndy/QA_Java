package app;

import java.util.Stack;

import bookstore.Book;

public class Main {

	public static void main(String[] args) {

		String s = "http://mySite/add?author=Tolstoy&title=Buratino&year=2018&price=47.50&pictures=true";
		
		String s1 = "http://mySite)/add?author=Tolstoy&title= {Buratino}&year=2018&price=[47.50]&pictures=true";
		System.out.println(isParenthesisMatch(s1));
		// Book book = new Book();
		// bookRecovery(book,s);
		// System.out.println(book.toString());

		Book b = bookRecovery(s);
		System.out.println(b.toString());

		

	}

	public static Book bookRecovery(String s) {
		Book book = new Book();
		int indexOf = 0;
		String[] arr = s.split("&");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("author")) {
				indexOf = arr[i].indexOf("=");
				String author = arr[i].substring(indexOf + 1).trim();
				book.setAuthor(author);
			}
			if (arr[i].contains("title")) {
				indexOf = arr[i].indexOf("=");
				String title = arr[i].substring(indexOf + 1).trim();
				book.setTitle(title);
			}
			if (arr[i].contains("year")) {
				indexOf = arr[i].indexOf("=");
				String tmpyear = arr[i].substring(indexOf + 1);
				int year = Integer.parseInt(tmpyear.trim());
				book.setYaer(year);
			}
			if (arr[i].contains("price")) {
				indexOf = arr[i].indexOf("=");
				String tmpprice = arr[i].substring(indexOf + 1);
				double price = Double.parseDouble(tmpprice.trim());
				book.setPrise(price);
			}
			if (arr[i].contains("pictures")) {
				indexOf = arr[i].indexOf("=");
				String tmppictures = arr[i].substring(indexOf + 1);
				boolean pictures = Boolean.parseBoolean(tmppictures.trim());
				book.setPictures(pictures);
			}

		}
		return book;
	}
	
	public static boolean isParenthesisMatch(String str) {
	    if (str.charAt(0) == '{')
	        return false;

	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);

	        if(c == '(')
	            stack.push(c);
	        else if(c == '{')
	            stack.push(c);
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                stack.pop();
	            else
	                return false;
	        else if(c == '}')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '{')
	                stack.pop();
	            else
	                return false;
	    }
	    return stack.empty();
	}

}
