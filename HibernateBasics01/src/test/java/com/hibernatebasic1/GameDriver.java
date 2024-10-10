package com.hibernatebasic1;

 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GameDriver {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager         em=emf.createEntityManager();
	static EntityTransaction     et=em.getTransaction();
	
	public static void main(String[] args){
		try {
			Game game1=new Game();
			game1.setgId(1);
			game1.setGameName("PUBG");
			game1.setGameType("online");
			game1.setPlayer("multiplayer");
			
			et.begin();
			em.persist(game1);
			et.commit();
			
			System.out.println("Data inserted.");
			
		} catch (Exception e) {
			 System.out.println("Exception :"+e.getMessage())     ;
		}
		
	}
}
