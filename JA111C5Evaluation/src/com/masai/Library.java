package com.masai;

import java.util.HashSet;

public class Library {
	public static void main(String[] args) {
		//Use suitable collection to store books by the name booksCollection
		HashSet<Book> booksCollection = new HashSet<>(10);
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		//Implement the logic to iterate through the collection and print the books
		for(Book b : booksCollection) {
			System.out.println(b.toString());
		}
		
		}

}
