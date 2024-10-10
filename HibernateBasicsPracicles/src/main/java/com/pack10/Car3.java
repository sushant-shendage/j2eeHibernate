package com.pack10;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car3 
{
	@Id
	private int cid;
	private String cName;
	private int cBrand;

	@OneToOne
	@JoinColumn
	private Eng3 e;

	public Car3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcBrand() {
		return cBrand;
	}

	public void setcBrand(int cBrand) {
		this.cBrand = cBrand;
	}

	public Eng3 getE() {
		return e;
	}

	public void setE(Eng3 e) {
		this.e = e;
	}
	
	


}
