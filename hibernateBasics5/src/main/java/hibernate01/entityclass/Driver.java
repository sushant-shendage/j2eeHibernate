package hibernate01.entityclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	static Book99 b = new Book99();

	public static void main(String[] args) {
		insertRecordById1(1, "bname1", "aname1", 7);
		insertRecordById1(2, "bname2", "aname2", 8);
		insertRecordById1(3, "bname3", "aname3", 5);
		 
		insertRecordById1(5, "bname5", "aname5", 6);
		insertRecordById1(6, "bname6", "aname6", 10);

	}

	static void insertRecordById1(int id, String bname, String aname, int published) {
		if (em.find(Book99.class, id) == null) {
			System.out.println("[_/] id is not available..!");
			b.setId(id);
			b.setBookName(bname);
			b.setAuthorName(aname);
			b.setBookPublished(published);

			et.begin();
			em.persist(b);
			et.commit();

			System.out.println("[_/] Record saved successfully..!");
		} else {
			System.out.println("[_/] Id is already present..!");
		}
	}
}
