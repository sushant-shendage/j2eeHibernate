package com.pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GameDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager         em=emf.createEntityManager();
		EntityTransaction     et=em.getTransaction();
		
		GameUser ob1=new GameUser(); 
		 ob1.setUserId(3);
		 ob1.setUserName("user2");
		 ob1.setScore(122);
		
		et.begin();
		em.persist(ob1);
		et.commit();
		System.out.println("data saved..!");
		
	}
}
