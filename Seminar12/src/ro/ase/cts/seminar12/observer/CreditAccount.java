package ro.ase.cts.seminar12.observer;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable {
	
//entitate Observabil concret
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
//are rolul de a notifica un observator
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > 0) {
			this.balance -= amount;
		}
		for(NotificationInterface observer : this.observers) {
			observer.notifyUser(amount);
		}
	}

}
