package com.pack4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NamedAttributeNode;
import javax.persistence.Persistence;

public class CarDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//[p1]insert [_/]
//[p2]update
//[p3]delete 
//[p4]fetch by id
//fetch by  other than id/pk
//DQL queries

//-----------------[p1]-----------------------\\
//		Car ob1 = new Car();
//		ob1.setName("c8");
//		ob1.setCompanyName("cmp8");
//
//		et.begin();
//		em.persist(ob1);
//		et.commit();
//		System.out.println("data saved..!");
//-----------------[p1]-----------------------//
		
//-----------------[p2]-----------------------\\
//		Car ob3=em.find(Car.class, "c1");
//		if(ob3!=null)
//		{
//			et.begin();
//			ob3.setCompanyName("cmp1u1");
//			em.merge(ob3);
//			et.commit();
//			System.out.println("record updated..!");
//		}else {
//			System.out.println("record not found..!");
//		}
//-----------------[p2]-----------------------//
		
//-----------------[p3]-----------------------\\
		
//		Car ob4=em.find(Car.class,"c1");
//		if(ob4!=null) 
//		{
//		 et.begin();
//		 em.remove(ob4);
//		 et.commit();
//		 System.out.println("object removed..!");
//		}else {
//			System.out.println("object is not avilable..!");
//
//		}
//-----------------[p3]-----------------------//
				
		
//-----------------[p4]-----------------------\\
		
//		Car ob2=em.find(Car.class,"c16");
//		if(ob2!=null) 
//		{
//			System.out.println("    car name : "+ob2.getName());
//			System.out.println("company name : "+ob2.getCompanyName());
//			System.out.println("------------------------------------------");
//		}else {
//			System.out.println("object is not avilable..!");
//
//		}
//-----------------[p4]-----------------------//
		

	}

}
