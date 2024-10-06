package com.pack7;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account 
{
	@Id
	private int AcId;
	private String userName;
	private double balance;
	public int getAcId() {
		return AcId;
	}
	public void setAcId(int acId) {
		AcId = acId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
		super();
 	}
	
	

}
