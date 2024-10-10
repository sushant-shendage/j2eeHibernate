package com.pack8;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	private  int doctorId;
	private String doctorName;
	private String specialization ;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 


	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}
