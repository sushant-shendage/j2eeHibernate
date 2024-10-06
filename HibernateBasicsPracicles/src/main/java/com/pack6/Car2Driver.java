package com.pack6;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Car2Driver 
{
	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
	static EntityManager         em= emf.createEntityManager();
	static EntityTransaction     et= em.getTransaction();
	static Query                  q;
	
	public static void main(String[] args) 
	{
		//enter carId,carBrand,engineCc,engineId
		//insertRecordInTwoTable(9,"brand9","99",999);
		
		//car_id,new_brabdName,new_EngineCc
		//updatBrandNameAndEngineCc(3,"brand1New3","33333");
		
		//delete both record by ID of car
		//deleteRecordsByCar2Id(4);
		
		//fetching record by carId
        //fetchRecordByIdOfCar(6);
		
		//fetching data of both table
		//fetchAllTableRecord();

		int option = 0;

//
//		while (true) {
//		 
//
//			boolean runLoop = true;
//
//			while (runLoop) {
//				menue();
//				System.out.println("Enter the choice :");
//				option = sc.nextInt();
//				switch (option) {
//				case 1: {
//					System.out.println("--:insert operation:--");
//					insertBookDataById();
//					break;
//				}
//
//				case 2: {
//					System.out.println("--:update operation(id):--");
//					updateBookById();
//					break;
//				}
//				case 3: {
//					System.out.println("--:delete operation(id):--");
//					deleteBookById();
//					break;
//				}
//				case 4: {
//					System.out.println("--:fetch record(single(id)):--");
//					findBookById();
//					break;
//				}
//				case 5: {
//					System.out.println("--:fetch record(single(author name)):--");
//					findBookByAuthorName();
//					break;
//				}
//				case 6: {
//					System.out.println("--:fetch record(all):--");
//					fetchAllBookData();
//					break;
//				}
//				case 7: {
//					runLoop = false;
//
//					break;
//				}
//
//				}
//
//			}
//			if (!runLoop) {
//				break;
//			}
//		}
	 
	}
	
	static void menue() {
		System.out.println("[choice] :operation");
		System.out.println("[01]     :insert record in both table");
		System.out.println("[02]     :update brand & engine cc");
		System.out.println("[02]     :delete record by car id");


		 
	}
	static void fetchAllTableRecord() 
	{
		q=em.createQuery("select c2 from Car2 c2");
		List <Car2> carAndEngineInfo=q.getResultList();
		for ( Car2 i: carAndEngineInfo  ) {
			Engine e=i.getE1();
			System.out.println("==============================");
			System.out.println("car details ::--");
			System.out.println("car id    : "+i.getId());
			System.out.println("car brand : "+i.getBrand());
			System.out.println("--------------------");
			System.out.println("engine id : "+e.getEid());
			System.out.println("engine cc : "+e.getCc());
			System.out.println("==============================");	
		}
		
	}
	static void fetchRecordByIdOfCar(int car2Id) 
	{
		Car2 ob1=em.find(Car2.class, car2Id);
		Engine e=ob1.getE1();
		System.out.println("==============================");
		System.out.println("car details ::--");
		System.out.println("car id    : "+ob1.getId());
		System.out.println("car brand : "+ob1.getBrand());
		System.out.println("--------------------");
		System.out.println("engine id : "+e.getEid());
		System.out.println("engine cc : "+e.getCc());
		System.out.println("==============================");	
	}
	static void deleteRecordsByCar2Id(int car2Id)
	{
		 Car2 ob1=em.find(Car2.class, car2Id);
			
			Engine e=ob1.getE1();
			 
			et.begin();
			em.remove(ob1);
			em.remove(e);
			et.commit();
			System.out.println(" record deleted in both table..!");
		
	}
	static void updatBrandNameAndEngineCc(int idCar,String brandNameCar,String eCC) 
	{
		 Car2 ob1=em.find(Car2.class, idCar);
			
			ob1.setId(idCar);
			ob1.setBrand( brandNameCar);
			
			Engine e=ob1.getE1();
			e.setCc(eCC);
			 
			
			ob1.setEngine(e);
			et.begin();
			em.merge(e);
			em.merge(ob1);
			et.commit();
			System.out.println(" record updated in both table..!");
			
		
	}
	static void insertRecordInTwoTable(int setIdVal,String setBrandVal,String setCcVal,int setEidVal) 
	{
        Car2 ob1=new Car2();
		
		ob1.setId(setIdVal);
		ob1.setBrand(setBrandVal);
		
		Engine e=new Engine();
		e.setCc(setCcVal);
		e.setEid(setEidVal);
		
		ob1.setEngine(e);
		
		et.begin();
		em.persist(e);
		em.persist(ob1);
		et.commit();
		System.out.println(" record saved in both table..!");
	}

}
