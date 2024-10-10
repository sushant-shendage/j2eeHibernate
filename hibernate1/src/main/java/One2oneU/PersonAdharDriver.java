package One2oneU;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.CRUDoperationOnEntityClass.Book;

public class PersonAdharDriver {
	static Scanner               sc = new Scanner(System.in)                       ;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	public static EntityManager         em = emf.createEntityManager()                    ;
	public static EntityTransaction     et = em.getTransaction()                          ;
	static Person                p1 = new Person()                                 ;
	static Adhar                  a1=new Adhar()                                   ;
	public static void main(String[] args) {
		insertRecordById(11, "person1", "male", "city1",1101,"person 1 Fullname",1122334455,"c1c1a1");
	}

	static void insertRecordById(int personId, String persoName, String Gender, String personCity,int adId,String fullName,long Mobile,String Address) {
		 if(em.find(Person.class,personId)==null) {
			 System.out.println("id is not avilable..!");
		 }else {
			 System.out.println("id is  already avilable..!");

		 }
	}
}
