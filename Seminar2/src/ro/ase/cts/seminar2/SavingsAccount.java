package ro.ase.cts.seminar2;

import ro.ase.acs.interfaces.Profitable;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount implements Profitable{

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double b, String i) {
		super(b, i);
	}

	@Override
	public void deposit(double amount) {
		this.balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance>amount) {
			this.balance-=amount;
		}
		
		
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)){
			throw new IllegalTransferException("Conturile coincid");
		}
			else
			{
				this.withdraw(amount);
				destination.deposit(amount);				
			}
		}
		
	

	@Override
	public void addInterest(double interest) {
		this.balance*=(1+interest/100);
		
	}

}
