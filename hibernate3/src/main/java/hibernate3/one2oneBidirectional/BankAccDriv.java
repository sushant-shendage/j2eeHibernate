package hibernate3.one2oneBidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankAccDriv {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	
	public static void main(String[] args) {
		insert();
	}
	static void insert() {
		System.out.println("hi");
	}
	

}
