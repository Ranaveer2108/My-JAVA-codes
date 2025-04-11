package com.LabActivity;

import java.util.ArrayList;

public class BookCollection {

	public static void main(String[] args) {
		ArrayList<Book>booklist=new ArrayList<Book>();
		booklist.add(new Book(250,"The DREAMS OF POOR BOY","RanuVirat"));
		booklist.add(new Book(251,"STRUGGLE OF ENGINNER","Virat"));
		booklist.add(new Book(252,"CONTROL ANGER","ViratKohli"));
		booklist.add(new Book(253,"ONE STEP TO GET SUCCESS","Lingaiah"));
		for(Book book:booklist) {
			book.displayBookDetails();
		}
	}

}
