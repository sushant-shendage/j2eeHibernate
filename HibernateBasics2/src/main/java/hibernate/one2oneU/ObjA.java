package hibernate.one2oneU;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ObjA {
	@Id
	 private String oAatt1;
	 private String oAatt2;
	 private int oAatt3;
	 
	 @OneToOne
	 private ObjB Ob;
	 
	public ObjA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getoAatt1() {
		return oAatt1;
	}

	public void setoAatt1(String oAatt1) {
		this.oAatt1 = oAatt1;
	}

	public String getoAatt2() {
		return oAatt2;
	}

	public void setoAatt2(String oAatt2) {
		this.oAatt2 = oAatt2;
	}

	public int getoAatt3() {
		return oAatt3;
	}

	public void setoAatt3(int oAatt3) {
		this.oAatt3 = oAatt3;
	}

	public ObjB getOb() {
		return Ob;
	}

	public void setOb(ObjB ob) {
		Ob = ob;
	}
	 
	
	 
	 
}
//one to one (unidirectional)