package com.pack7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankDriver {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager         em = emf.createEntityManager();
	static EntityTransaction     et = em.getTransaction();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// insert2TablesData...(int number_account_object);
		// insert2TablesData();
		// update2TablesData();//[***]
		// insert2TablesDataD();//[***]
		// delete2TableDataById();//[***]
		// fetch[!!!]
		// fetchAll[!!!]
		
		System.out.println("program execution completed..!");
		
	}
	static void delete2TableDataById(){
		System.out.println("Enter the bank id :");
		int bankId=sc.nextInt();
		Bank b1=em.find(Bank.class, bankId);
		if(b1!=null){
			et.begin();
			em.remove(b1);
			List<Account> acList=b1.getAc();
			for (Account i : acList) {
				em.remove(i);
			}
			et.commit();
		}
		else {
			System.out.println("bank id not exist..!");
		}
	}
	static void insert2TablesDataD() {
		Bank b = new Bank();
		System.out.println("----------------Bank info---------------------");

		System.out.println("Enter bank id ::");
		int idTemp = sc.nextInt();
		if (em.find(Bank.class, idTemp) != null) {
			System.out.println("bank id is already present ...Try another idea..!");
			return;
		}
		b.setBankId(idTemp);

		System.out.println("Enter bank name ::");
		sc.nextLine();
		b.setBankName(sc.nextLine());

		System.out.println("Enter bank location ::");
		b.setLocation(sc.nextLine());

		System.out.println("----------------accounts info---------------------");

		System.out.println("Enter total number of accounts you want to enter::");
		int totalAcs = sc.nextInt();

		Account accountsGroup[] = new Account[totalAcs];

		System.out.println(Arrays.toString(accountsGroup));

		for (int i = 0; i < totalAcs; i++) {
			System.out.println("--------------Enter " + (i + 1) + " ac info -------------");
			accountsGroup[i] = new Account();
			System.out.println("Enter " + (i + 1) + " account id :");
			accountsGroup[i].setAcId(sc.nextInt());

			sc.nextLine();
			System.out.println("Enter " + (i + 1) + " account name :");
			accountsGroup[i].setUserName(sc.nextLine());

			System.out.println("Enter " + (i + 1) + " account balance :");
			accountsGroup[i].setBalance(sc.nextDouble());
		}

		List<Account> alAc = new ArrayList();

		for (int i = 0; i < totalAcs; i++) {
			alAc.add(accountsGroup[i]);
		}

		b.setAc(alAc);
		System.out.println("bank id       : " + b.getBankId());
		System.out.println("bank name     : " + b.getBankName());
		System.out.println("bank location : " + b.getLocation());
		System.out.println("bank ACs      : " + b.getAc());

		for (Account i : alAc) {
			et.begin();
			em.persist(i);
			et.commit();
		}

		et.begin();
		em.persist(b);
		et.commit();

		System.out.println("All records saved successfully..!");
	}

	static void update2TablesData() {
		System.out.println("Enter the id of bank :");
		int id = sc.nextInt();
		if (em.find(Bank.class, id) != null) {
			System.out.println("bank id exists..!");
			Bank b = em.find(Bank.class, id);
			
			
			System.out.println("Enter your new bank name :");
			b.setBankName(sc.nextLine());
			List<Account> acl = b.getAc();

			System.out.println("Enter the account id whoes ballance you want to update :");
			int tempAcId=sc.nextInt();
			for (Account i : acl) {
				if (i.getAcId() == tempAcId){
					System.out.println("ac id seleected ... now enter the updated amount ..!");
					int tempBal=sc.nextInt();
					i.setBalance(tempBal);
					et.begin();
					em.merge(i);
					et.commit();
				}
			}
			
			
			et.begin();
			em.merge(b);
			et.commit();
			System.out.println("bank X name ac_X1 balance updated...!");
		} else {
			System.out.println("bank id is not exist..!");
		}

	}

}
