package hibernate3.one2oneUnidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student44 {
	@Id
	private int id;
	private double cgpa;
	@OneToOne
	private University u1;
	
	public Student44() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public University getU1() {
		return u1;
	}

	public void setU1(University u1) {
		this.u1 = u1;
	}
	
	

}
