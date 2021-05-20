package ro.ase.cts.seminar12.observer;

public class SMSNotification implements NotificationInterface{

	@Override
	public void notifyUser(double amount) {
		System.out.println("[EMAIL NOTIFICATION]: "+amount+ " sent");
		
	}

}
