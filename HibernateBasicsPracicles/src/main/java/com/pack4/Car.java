package com.pack4;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car 
{
	@Id
	private String name;
	private String companyName;
	
	
	public Car() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	
	

}
