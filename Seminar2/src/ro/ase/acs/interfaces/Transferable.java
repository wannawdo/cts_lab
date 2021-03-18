package ro.ase.acs.interfaces;

import ro.ase.cts.seminar2.Account;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public interface Transferable {
	public abstract void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException;
}
