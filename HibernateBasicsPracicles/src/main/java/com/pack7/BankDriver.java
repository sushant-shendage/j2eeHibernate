package com.pack7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankDriver 
{
	
	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	static EntityManager         em= emf.createEntityManager();
	static EntityTransaction     et= em.getTransaction();

	
	
	public static void main(String[] args) 
	{
		
		
		//		insert2TablesData(int number_account_object);

		insert2TablesData();
	}

	static void insert2TablesData()
	{
		 Bank b=new Bank();	 
		b.setBankId(444);
		b.setBankName("Bank444");
		b.setLocation("Bank444Loc");
		
		Account ac1=new Account();
		ac1.setAcId(4441);
		ac1.setUserName("user4441");
		ac1.setBalance(4443.45);
		
		Account ac2=new Account();
		ac2.setAcId(4432);
		ac2.setUserName("user4442");
		ac2.setBalance(5444.45);
		
		 

		
		List<Account> alAc=new ArrayList();
		alAc.add(ac1);
		alAc.add(ac2);
		 
		b.setAc(alAc);
		
		et.begin();
		em.persist(ac1);
		em.persist(ac2);
		em.persist(b);
		et.commit();
		 
		 
		System.out.println("All records saved successfully..!");
	}
}
