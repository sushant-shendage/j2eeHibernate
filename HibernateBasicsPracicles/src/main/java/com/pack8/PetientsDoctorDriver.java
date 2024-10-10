package com.pack8;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PetientsDoctorDriver {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager         em = emf.createEntityManager();
	static EntityTransaction     et = em.getTransaction();
//	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		 
		
		
//		et.begin();
//		em.persist(d1);
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.persist(p4);
//		et.commit();
		
		System.out.println("data saved..!");
		
	}
}
