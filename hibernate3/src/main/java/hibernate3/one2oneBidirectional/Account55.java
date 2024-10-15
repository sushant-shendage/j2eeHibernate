package hibernate3.one2oneBidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account55 {
	@Id
	private int id;
	private String name;
	private double balance;
	
	@ManyToOne
	private Bank55 bank;

	public Account55() {
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank55 getBank() {
		return bank;
	}

	public void setBank(Bank55 bank) {
		this.bank = bank;
	}
	
	
	
	

}
