package hibernate01.entityclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book99 {
	@Id
	private int id;
	private String bookName;
	private String authorName;
	private int bookPublished;
	public Book99() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getBookPublished() {
		return bookPublished;
	}
	public void setBookPublished(int bookPublished) {
		this.bookPublished = bookPublished;
	}
	 
	
	
	
	
	
	

}
