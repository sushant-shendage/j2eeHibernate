 

import javax.persistence.ManyToOne;

import AssignmentOct.Bank44;

public class Account44 {
	private int id;
	private String name;
	private double balance;
	
	@ManyToOne
	private Bank44 bank;

	public Account44() {
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

	public Bank44 getBank() {
		return bank;
	}

	public void setBank(Bank44 bank) {
		this.bank = bank;
	}
	
	

}
