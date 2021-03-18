package ro.ase.cts.seminar2;

import ro.ase.acs.interfaces.Depositable;
import ro.ase.acs.interfaces.Transferable;
import ro.ase.acs.interfaces.Withdrawable;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable, Transferable {

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > 0) {
			this.balance -= amount;
		}

	}

	@Override
	public void transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {
		throw new UnsupportedOperationException(); // nu poate face o operatiune de tip transfer

	}

}
