package com.pack6;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Car2Driver 
{
	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	static EntityManager         em= emf.createEntityManager();
	static EntityTransaction     et= em.getTransaction();
	public static void main(String[] args) 
	{
		
		
 
	insertRecordInTwoTable(7,"brand7","77",777);
	}
	
	static void insertRecordInTwoTable(int setIdVal,String setBrandVal,String setCcVal,int setEidVal) 
	{
        Car2 ob1=new Car2();
		
		ob1.setId(setIdVal);
		ob1.setBrand(setBrandVal);
		
		Engine e=new Engine();
		e.setCc(setCcVal);
		e.setEid(setEidVal);
		
		ob1.setEngine(e);
		
		et.begin();
		em.persist(e);
		em.persist(ob1);
		et.commit();
		System.out.println("program execution completed..!");
	}

}
