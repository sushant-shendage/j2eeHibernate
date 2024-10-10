package com.pack8;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Petients{
@Id	
private int petientId ;
private String petientName;
private int petientAge;

@ManyToOne
private Doctor d1;
 

public Petients() {
	super();
	// TODO Auto-generated constructor stub
}

 
public int getPetientId() {
	return petientId;
}

public void setPetientId(int petientId) {
	this.petientId = petientId;
}

public String getPetientName() {
	return petientName;
}

public void setPetientName(String petientName) {
	this.petientName = petientName;
}

public int getPetientAge() {
	return petientAge;
}

public void setPetientAge(int petientAge) {
	this.petientAge = petientAge;
}

public Doctor getD1() {
	return d1;
}

public void setD1(Doctor d1) {
	this.d1 = d1;
}



}
