package com.pack6;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car2 
{
	@Id
	private int id;
	private String brand;
	
	@OneToOne
	private  Engine e1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getE1() {
		return e1;
	}
	
	
	public void setEngine(Engine e) {
		e1 = e;
	}
	

	public Car2() {
		super();
	}

	 
	
	
	

}
