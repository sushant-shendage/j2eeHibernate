package hibernate.one2oneU;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ObjB {
	@Id
	 private String oBatt1;
	 private String oBatt2;
	 
	 
	public ObjB() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getoBatt1() {
		return oBatt1;
	}


	public void setoBatt1(String oBatt1) {
		this.oBatt1 = oBatt1;
	}


	public String getoBatt2() {
		return oBatt2;
	}


	public void setoBatt2(String oBatt2) {
		this.oBatt2 = oBatt2;
	}
	 
	 
	  

	
	

}
