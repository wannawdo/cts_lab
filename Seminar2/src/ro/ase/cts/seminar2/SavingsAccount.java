package ro.ase.cts.seminar2;

import ro.ase.acs.interfaces.Depositable;
import ro.ase.acs.interfaces.Profitable;
import ro.ase.acs.interfaces.Transferable;
import ro.ase.acs.interfaces.Withdrawable;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount implements Profitable, Depositable, Withdrawable, Transferable {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double b, String i) {
		super(b, i);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		// throw new UnsupportedOperationException();

	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (this.balance > amount) {
			this.balance -= amount;
		}

	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		if (((BankAccount) destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("Conturile coincid");
		} else {
			this.withdraw(amount);
			((Depositable) destination).deposit(amount);
		}
	}

	@Override
	public void addInterest(double interest) {
		this.balance *= (1 + interest / 100);

	}

}
