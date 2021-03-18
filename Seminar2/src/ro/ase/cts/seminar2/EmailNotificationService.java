package ro.ase.cts.seminar2;

import ro.ase.acs.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sent email notification with message: " + message);
	}

}
