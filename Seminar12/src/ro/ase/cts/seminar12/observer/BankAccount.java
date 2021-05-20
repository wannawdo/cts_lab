package ro.ase.cts.seminar12.observer;

import java.util.ArrayList;

public abstract class BankAccount extends Account {
	// entitate Observabil

	// colectie de observatori
	protected ArrayList<NotificationInterface> observers;
	protected double balance;
	protected String iban;

	public BankAccount() {
		this.observers = new ArrayList<NotificationInterface>();
		this.balance = 0;
		this.iban = "N/A";
	}

	public BankAccount(double b, String i) {
		this.observers = new ArrayList<NotificationInterface>();
		this.balance = b;
		this.iban = i;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}

	public void addObserver(NotificationInterface observer) {
		this.observers.add(observer);
	}

	public void removeObserver(NotificationInterface observer) {
		this.observers.remove(observer);
	}
}
