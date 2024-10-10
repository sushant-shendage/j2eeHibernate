package One2oneU;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	
//------------------------------------------------------\\
	@Id
	private int adharId;
	private String fullName;
	private long mobNo;
	private String address;
//------------------------------------------------------//
	
	
//------------------------------------------------------\\
	public Adhar() {
		super();
		// TODO Auto-generated constructor stub
	}
//------------------------------------------------------//
//------------------------------------------------------\\
	public int getAdharId() {
		return adharId;
	}
//------------------------------------------------------
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
//------------------------------------------------------\\
	public String getFullName() {
		return fullName;
	}
//------------------------------------------------------\\

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
//------------------------------------------------------//

//------------------------------------------------------\\
	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
//------------------------------------------------------//
//------------------------------------------------------\\
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//------------------------------------------------------//

}