package com.pack2;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pack1.GameUser;

public class BookDriver {
	static Scanner               sc = new Scanner(System.in);
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager         em = emf.createEntityManager();
	static EntityTransaction     et = em.getTransaction();

	public static void main(String[] args) {
		 

		int option = 0;


		while (true) {
		 

			boolean runLoop = true;

			while (runLoop) {
				menue();
				System.out.println("Enter the choice :");
				option = sc.nextInt();
				switch (option) {
				case 1: {
					System.out.println("--:insert operation:--");
					insertBookDataById();
					break;
				}

				case 2: {
					System.out.println("--:update operation(id):--");
					updateBookById();
					break;
				}
				case 3: {
					System.out.println("--:delete operation(id):--");
					deleteBookById();
					break;
				}
				case 4: {
					System.out.println("--:fetch record(single(id)):--");
					findBookById();
					break;
				}
				case 5: {
					System.out.println("--:fetch record(single(author name)):--");
					findBookByAuthorName();
					break;
				}
				case 6: {
					System.out.println("--:fetch record(all):--");
					fetchAllBookData();
					break;
				}
				case 7: {
					runLoop = false;

					break;
				}

				}

			}
			if (!runLoop) {
				break;
			}
		}
		System.out.println("program execution completed..!");
	}

	static void menue() {
		System.out.println("[choice] :operation");
		System.out.println("[01]     :insert record");
		System.out.println("[02]     :update record");
		System.out.println("[03]     :delete record");
		System.out.println("[04]     :fetch  record(single (id))");
		System.out.println("[05]     :fetch  record (single (Author name)) ");
		System.out.println("[06]     :fetch  record(all)");
		System.out.println("[07]     :exit ");
	}

	static void fetchAllBookData() {
		Query q = em.createQuery("select b from Book b");

		List<Book> bookRecords = q.getResultList();

		for (Book b : bookRecords) {
			System.out.println("Id    : " + b.getId());
			System.out.println("Name  : " + b.getName());
			System.out.println("phone : " + b.getAuthor());
			System.out.println("------------------------------------");
		}
	}

	static void deleteBookById() {
		System.out.println("Enter id to delete record :");
		int id = sc.nextInt();
		Book b = em.find(Book.class, id);
		if (b != null) {
			et.begin();
			em.remove(b);
			et.commit();
			System.out.println("data having id " + id + " removed successfully..!");
		} else {
			System.out.println("Id is not available..!");

		}

	}

	static void updateBookById() {
		System.out.println("Enter id to update book name :");
		int id = sc.nextInt();
		Book b = em.find(Book.class, id);
		if (b != null) {

			System.out.println("Update Book data..!");
			System.out.println("-->Current data ");
			System.out.println("Id     : " + b.getId());
			System.out.println("Name   : " + b.getName());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Single value data using primery-key fetched successfully..!");
			System.out.println("-->Current data ");
			et.begin();
			System.out.print("---->update name(" + b.getName() + ") :");
			sc.nextLine();
			String updated_name = sc.nextLine();
			b.setName(updated_name);
			et.commit();
			System.out.println("Updated Book data............................!");
			System.out.println("Id     : " + b.getId());
			System.out.println("Name   : " + b.getName());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Data updated successfully..!");

		} else {
			System.out.println("Id is not available..!");
		}

	}

	static void findBookById() {
		System.out.println("Enter id to fetch record :");
		int id = sc.nextInt();
		Book b = em.find(Book.class, id);
		if (b != null) {
			System.out.println("Book data..!");
			System.out.println("Id     : " + b.getId());
			System.out.println("Name   : " + b.getName());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Single value data using primery-key fetched successfully..!");
		} else {
			System.out.println("Id is not available..!");
		}
	}

	static void findBookByAuthorName() {
		System.out.println("Enter name of author to get record :");
		sc.nextLine();
		String AuthorName = sc.nextLine();
		Query q = em.createQuery("select b from Book b where b.author=?1");
		q.setParameter(1, AuthorName);
		try {
			Book b = (Book) q.getSingleResult();

			System.out.println("Book data..!");
			System.out.println("Id     : " + b.getId());
			System.out.println("Name   : " + b.getName());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Single value data using author name fetched successfully..!");
		} catch (NoResultException nre) {
			System.out.println("Author is not available..!");
		}

	}

	static void insertBookDataById() {
		try {
		Book b = new Book();
		System.out.println("Enter book id     : ");
		b.setId(sc.nextInt());
		System.out.println("Enter book name   : ");
		sc.nextLine();
		b.setName(sc.nextLine());

		System.out.println("Enter book author : ");
		b.setAuthor(sc.nextLine());

		et.begin();
		em.persist(b);
		et.commit();
		System.out.println("data saved..!");
}
catch(Exception e){
	System.out.println("Id already present ...!");
	System.out.println("insert unique id ...!");
}
	}
}
