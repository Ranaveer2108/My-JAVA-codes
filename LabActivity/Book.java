package com.LabActivity;

public class Book {
private int bookid;
private String bookName;
private String authorName;
public Book(int bookid, String bookName, String authorName) {
	super();
	this.bookid = bookid;
	this.bookName = bookName;
	this.authorName = authorName;
}
 public void displayBookDetails() {
	 System.out.println("Book id "+bookid);
	 System.out.println("Book name  "+bookName);
	 System.out.println("Author Name "+authorName);
 }

}
