package ro.ase.cts.seminar2;

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
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}

}
