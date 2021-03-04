package ro.ase.cts.seminar2;

public abstract class BankAccount extends Account {
	private double balance;
	protected String iban;
	
	public BankAccount() {
		this.balance=0;
		this.iban="N/A";
	}
	
	public BankAccount(double b, String i) {
		this.balance=b;
		this.iban=i;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double newBalance) {
		this.balance=newBalance;
	}
}
