package com.pack7;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

 

@Entity
public class Bank 
{
	@Id
	private int bankId;
	private String bankName;
	private String location;
	
	@OneToMany
	private List <Account> ac;

	public Bank() {
		super();
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Account> getAc() {
		return ac;
	}

	public void setAc(List<Account> ac) {
		this.ac = ac;
	}
	
	
}
