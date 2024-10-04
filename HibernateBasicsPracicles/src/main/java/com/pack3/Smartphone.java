package com.pack3;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Smartphone 
{
	//attributes
	@Id
	String modelName;//Primary key
	String company;
	String ram;
	String display;
	String refreshRate;
	String buildQuality;
	String connectivity;
	
	//public no-argument constructor
	public Smartphone() {
		super();
	}

	//getters and setters
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(String refreshRate) {
		this.refreshRate = refreshRate;
	}

	public String getBuildQuality() {
		return buildQuality;
	}

	public void setBuildQuality(String buildQuality) {
		this.buildQuality = buildQuality;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	
	
	
	

}
