package hibernate3.entityclass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Watch {
	@Id
	private int id;
	private String watch;
	private double price;
	public Watch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWatch() {
		return watch;
	}
	public void setWatch(String watch) {
		this.watch = watch;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
