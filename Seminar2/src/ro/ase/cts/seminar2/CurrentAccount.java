package ro.ase.cts.seminar2;

import ro.ase.acs.interfaces.Depositable;
import ro.ase.acs.interfaces.NotificationService;
import ro.ase.acs.interfaces.Transferable;
import ro.ase.acs.interfaces.Withdrawable;
import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable {
	public static double MAX_CREDIT = 5000;
	public NotificationService notificationService;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double b, String i) {
		super(b, i);

	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(getBalance() + amount);

	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (getBalance() >= amount)
			this.setBalance(getBalance() - amount);
		else {
			throw new InsufficientFundsException("Fonduri insuficiente");
		}
		if (this.notificationService != null) {
			this.notificationService.sendNotification("S-a extras suma de " + amount + " RON.");
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

}
