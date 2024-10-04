package com.pack6;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine 
{
	@Id
	private int eid;
	private String cc;
	public Engine() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	
	
	

}
