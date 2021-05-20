package ro.ase.cts.seminar12.observer;


public interface Withdrawable {
	public abstract void withdraw(double amount) throws InsufficientFundsException;
}
