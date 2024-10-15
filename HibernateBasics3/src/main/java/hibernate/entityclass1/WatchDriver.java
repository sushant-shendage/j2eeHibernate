package hibernate.entityclass1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WatchDriver {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	 

	public static void main(String[] args) {

		insertById(11, "watch1", 123.45);
	}

	static void insertById(int id,String name,double price) {
		
		if(em.find(Watch.class,id) == null) {
			Watch w1=new Watch();
				w1.setId(id);
				w1.setName(name);
				w1.setPrice(price);
				System.out.println("Record inserted successfully..!");
				
		}else {
			System.out.println("Id is already present..!");
		}
	}
}
