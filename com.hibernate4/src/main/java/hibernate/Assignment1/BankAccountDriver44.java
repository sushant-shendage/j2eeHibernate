package hibernate.Assignment1;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 

public class BankAccountDriver44 {
	static Scanner               sc = new Scanner(System.in)                       ;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	public static EntityManager         em = emf.createEntityManager()                    ;
	public static EntityTransaction     et = em.getTransaction()                          ;
	 
	public static void main(String[] args) {
		
		insertBankRecordByBankId(11,"bank11","loc11");
			
		
		
	}
	static void insertBankRecordByBankId(int id,String name,String location) {
		System.out.println("hi");
		
	}
}
