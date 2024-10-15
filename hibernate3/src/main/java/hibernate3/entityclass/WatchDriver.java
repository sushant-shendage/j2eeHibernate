package hibernate3.entityclass;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class WatchDriver {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager     em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	static Watch             w1 = new Watch();

	public static void main(String[] args) {
		
		insertRecordById(18,"watch18",4488.4);
//		updatePriceById(11,123.45);
//		deleteRecordById(11);
//		fetchRecordById(14);		
//      fetchAll();
		
	}	
	
	static void fetchAll() {
		Query q=em.createQuery("select w from Watch w ");
		
		List<Watch> watchList=q.getResultList();
		
		for (Watch i : watchList) {
			System.out.println("watch Id    :: "+ i.getId());
			System.out.println("watch name  :: "+ i.getWatch());
			System.out.println("watch price :: "+ i.getPrice());
			System.out.println("-----------------------------");
		}
	}

	static void fetchRecordById(int id) {
		if(em.find(Watch.class, id)==null){
			System.out.println("Id is not avilable..!");
		}else{
			System.out.println("Id is avilable..!");
			
			w1=em.find(Watch.class, id);
			
			System.out.println("watch id    :: "+id);
			System.out.println("watch name  :: "+w1.getWatch());
			System.out.println("watch price :: "+w1.getPrice());
			
			System.out.println("data fetched successfully...");

		}
	}
	
	static void insertRecordById(int id, String name, double price) {
		if (em.find(Watch.class, id) == null) {
			System.out.println("id is not present..!");
			w1.setId(id);
			w1.setWatch(name);
			w1.setPrice(price);

			et.begin();
			em.persist(w1);
			et.commit();

			System.out.println("Record saved..!");

		} else {
			System.out.println("id is already avilable..!");
		}
	}

	static void updatePriceById(int id, double price) {
		if (em.find(Watch.class, id) == null) {
			System.out.println("id is not present..!");

		} else {
			System.out.println("id is already avilable present..!");
			w1 = em.find(Watch.class, id);

			w1.setPrice(price);
			et.begin();
			em.merge(w1);
			et.commit();

			System.out.println("Record price updated..!");
		}
	}

	static void deleteRecordById(int id) {
		if (em.find(Watch.class, id) == null) {
			System.out.println("id is not present..!");
		} else {
			System.out.println("id is already avilable present..!");
			w1 = em.find(Watch.class, id);

			et.begin();
			em.remove(w1);
			et.commit();

			System.out.println("Record deleted..!");
		}
	}

}
