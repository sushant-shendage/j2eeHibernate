package hibernate.one2oneU;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ObjABDriver {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager         em = emf.createEntityManager();
	static EntityTransaction     et = em.getTransaction();
	
	public static void main(String[] args){
		ObjA oa1=new ObjA();
		oa1.setoAatt1("A_att1_str1");
		oa1.setoAatt2("A_att1_str2");
		oa1.setoAatt3(1234);
		
		ObjB ob1=new ObjB();
		
		ob1.setoBatt1("B_att1_str1");
		ob1.setoBatt2("B_att1_str1");
		
		oa1.setOb(ob1);
		
		et.begin();
		em.persist(ob1);
		em.persist(oa1);
		et.commit();
	}
}
