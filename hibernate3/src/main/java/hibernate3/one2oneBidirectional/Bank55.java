package hibernate3.one2oneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank55 {
	@Id
	private int id;
	private String name;
	private String location;
	
	@OneToMany
	private  Account55 a;
	public Bank55() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Account55 getA() {
		return a;
	}
	public void setA(Account55 a) {
		this.a = a;
	}
	
	

}
