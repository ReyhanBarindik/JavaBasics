package com.syntax.class19;

public class Book {

	/*Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed
     */

	
	String bookAuthor;
	String bookName;
	int bookYear;
	
	Book (String bookAuthor, String bookName) {
		this.bookAuthor=bookAuthor;
		this.bookName=bookName;
	}
	
	Book (int bookYear ) {
		this("Jane Austen", "Pride&Prejudice");
		System.out.println("I like "+bookAuthor+" books and one of her books is "+bookName+" "+bookYear);
	}
	
	public static void main(String[] args) {
	Book book1 = new Book (1813);
    
	}

}
