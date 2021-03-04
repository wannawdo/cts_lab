package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
	public static double MAX_CREDIT=5000;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double b, String i) {
		super(b, i);
		
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(getBalance()+amount);
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(getBalance()>=amount)
			this.setBalance(getBalance()-amount);
		else
			throw new InsufficientFundsException("Fonduri insuficiente");
			
		
	}

	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)){
			throw new IllegalTransferException("Conturile coincid");
		}
			else
			{
				this.withdraw(amount);
				destination.deposit(amount);				
			}
		}
		
	}


