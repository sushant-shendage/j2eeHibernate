package hibernate3.one2oneUnidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Student44UnicersityDriver {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	
	static Student44 s1=new Student44(); 
	static University u1=new University();

	public static void main(String[] args) {
//		insertBothrecordsById1(222,9.78,22,"un2",4);
//		updateBothrecordById1(111,7.77,"un1new");
		
		deleteBothRecordById1(111);
	}
	
	static void deleteBothRecordById1(int sid){
System.out.println("deleting  records..!");
		
		if(em.find(Student44.class,sid)==null){
			System.out.println("Record not exist..!");
		}else{
			System.out.println("Record exist..!");
			System.out.println("deleting record..!");
			s1=em.find(Student44.class,sid);
			u1=s1.getU1();
			 
			
			et.begin();
			em.remove(s1);
			em.remove(u1);
			et.commit();
			
			System.out.println("Record deleted successfully..!");
			

			
		}
		
	}
	
	static void  updateBothrecordById1(int sid ,double cgpa,String uname) {
		System.out.println("updating records..!");
		
		if(em.find(Student44.class,sid)==null){
			System.out.println("Record not exist..!");
		}else{
			System.out.println("Record exist..!");
			System.out.println("Updating record..!");
			s1=em.find(Student44.class,sid);
			s1.setCgpa(cgpa);
			 
			u1=s1.getU1();
			u1.setName(uname);
			
			et.begin();
			em.persist(s1);
			em.persist(u1);
			et.commit();
			
			System.out.println("Record updated successfully..!");
			

			
		}
		
	}
	
	static void insertBothrecordsById1(int sid,double cgpa,int uid,String uname,int rank) {
		if(em.find(Student44.class, sid)==null) {
			System.out.println("id is not present..!");
			s1.setId(sid);
			s1.setCgpa(cgpa);
			u1.setId(uid);
			u1.setName(uname);
			u1.setRank(rank);
			s1.setU1(u1);
			
			et.begin();
			em.persist(s1);
			em.persist(u1);
			et.commit();
			
			System.out.println("Record saved successfully..!");
			
		}else {
			System.out.println("id is present..!");

		}
		
	}
}
