package com.CRUDoperationOnEntityClass;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager        ;
import javax.persistence.EntityManagerFactory ;
import javax.persistence.EntityTransaction    ;
import javax.persistence.Persistence          ;
import javax.persistence.Query                ;

public class BookDriver 
{
	static Scanner               sc = new Scanner(System.in)                       ;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager         em = emf.createEntityManager()                    ;
	static EntityTransaction     et = em.getTransaction()                          ;
	static Query                  q                                                ;
	static Book                   b = new Book()                                   ;
	static List<Book>            l1                                                ;
 
public static void main(String[] args) {
//insertRecord(40,"b40","b40a");
//updateBookNameByBookId(40,"b40au1");
//deleteRecordById(0);
//fetchRecordById(1121);
//fetchAllRecords();
}


//----------------------------------------------------------------------------------------\\
static void insertRecord(int bookid,String bookname,String authorName){
	System.out.println("Inserting record..!");
	
	if(em.find(Book.class,bookid)==null){
		
		System.out.println("id is not present..!");
		
		b.setBookId    (bookid    );
		b.setBookName  (bookname  );
		b.setAuthorName(authorName);
		
		et.begin  ( );
		em.persist(b);
		et.commit ( );
		
		System.out.println("Record inserted..!");
	}else {
		System.out.println("Id is already present..!");
	}
}
//----------------------------------------------------------------------------------------//
//----------------------------------------------------------------------------------------\\
static void updateBookNameByBookId(int bookid,String newBookName){
	System.out.println("Updating record..!");
if(em.find(Book.class,bookid)!=null){
	    b.setAuthorName(em.find(Book.class, bookid).getBookName());
		b.setBookName  (newBookName);
		b.setBookId    (bookid);
		
		et.begin  ( );
		em.merge  (b);
		et.commit ( );
		
		System.out.println("Record updated..!");
	}else {
		System.out.println("Id is NOT present..!");
	}
	System.out.println("Record updated..!");
}
//----------------------------------------------------------------------------------------//
//----------------------------------------------------------------------------------------\\
static void deleteRecordById(int bookid){
	System.out.println("deleting record..!");
	 
	if(em.find(Book.class,bookid)!=null){
		    b=em.find(Book.class, bookid);
			
			et.begin  ( );
			em.remove (b);
			et.commit ( );
			
			System.out.println("Record deleted..!");
		}else {
			System.out.println("Id is NOT present..!");
			return;
		}
		System.out.println("Record updated..!");
}
//----------------------------------------------------------------------------------------//
//----------------------------------------------------------------------------------------\\
static void fetchRecordById(int bookid){
	 
	System.out.println("fetching All records..!");
	 
	if(em.find(Book.class,bookid)!=null){
		    b=em.find(Book.class, bookid);
			
		    System.out.println("Book Id      :"+b.getBookId());
		    System.out.println("Book Name    :"+b.getBookName());
		    System.out.println("Book  Author :"+b.getAuthorName());
			System.out.println("Record fetched..!");
			
		}else {
			System.out.println("Id is NOT present..!");
			return;
		}
	
}
//----------------------------------------------------------------------------------------//
static void fetchAllRecords(){
	 
	System.out.println("fetching record..!");
	q=em.createQuery("select b from Book b");
	l1=q.getResultList();
	
	for (Book i : l1) {
		System.out.println("id     :"+i.getBookId());
		System.out.println("name   :"+i.getBookName());
		System.out.println("Author :"+i.getAuthorName());
System.out.println("==============================================");
	}
	System.out.println("All records fetched");
}
//----------------------------------------------------------------------------------------//

}
