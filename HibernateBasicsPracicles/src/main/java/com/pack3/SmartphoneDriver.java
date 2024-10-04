package com.pack3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SmartphoneDriver 
{
	public static void main(String[] args) 
	{	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
	 

		System.out.println("data inserted successfully..!");
		
		
		
		
		
		
	}
}
