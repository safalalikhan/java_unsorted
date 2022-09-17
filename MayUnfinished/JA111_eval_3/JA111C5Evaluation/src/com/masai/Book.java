package com.masai;

import java.util.Objects;

public class Book {
	private int bookId;
	private String bookName,author;
	
	public Book() {
		
	}
	public Book(int id,String name, String author) {
		this.setBookId(id);
		this.setBookName(name);
		this.setAuthor(author);
	}

	@Override
	public String toString() {
		String item = "[ " + this.getBookId() + ", " + this.getBookName() + ", " + this.getAuthor() + " ]";
		return item;
	}
@Override
public boolean equals(Object obj) {
	Book book1 = this;
	Book book2 =(Book)obj;
	return (book1.getBookId() == book2.getBookId());
}
@Override
public int hashCode() {
	return Objects.hash(bookId);
}
	
	
	
	
	
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
