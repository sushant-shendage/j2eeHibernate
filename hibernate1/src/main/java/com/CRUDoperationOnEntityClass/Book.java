package com.CRUDoperationOnEntityClass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

//[Entity attributes]		
//---------------------------------------------------\\
	@Id
	private int    bookId     ;//primery key
	private String bookName   ;
	private String authorName ;
//---------------------------------------------------//

	
//[public no argument constructor]	
//---------------------------------------------------\\
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
//---------------------------------------------------//



//[getters and setters]	
//---------------------------------------------------\\

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
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
//---------------------------------------------------//



}
