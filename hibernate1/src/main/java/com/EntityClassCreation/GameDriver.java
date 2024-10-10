package com.EntityClassCreation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GameDriver{
	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager         em=emf.createEntityManager();
	static EntityTransaction     et=em.getTransaction();
	
	public static void main(String[] args){
		Game g1=new Game();
		g1.setGameId(1);
		g1.setGameName("BGMI");
		g1.setPlayerType("Multiplayer");
		g1.setGameMode("Online");
		
		et.begin();
		em.persist(g1);
		et.commit();
		
		System.out.println("Data saved..!");
		
	}
}
