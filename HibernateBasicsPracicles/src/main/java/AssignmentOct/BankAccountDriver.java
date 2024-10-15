package AssignmentOct;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankAccountDriver {
	static Scanner               sc = new Scanner(System.in)                       ;
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager         em = emf.createEntityManager()                    ;
	static EntityTransaction     et = em.getTransaction()                          ;
	
	public static void main(String[] args) {
		 
	}
static void insert() {
	System.out.println("hi");
}
}
