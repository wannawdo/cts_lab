package chain.main;

import chain.numain.Notificator;
import chain.numain.NotificatorEmail;
import chain.numain.NotificatorManager;
import chain.numain.NotificatorSMS;
import chain.numain.Client;

public class Main {

	public static void main(String[] args) {
		Notificator notificatorEmail=new NotificatorEmail();
		Notificator notificatorSMS=new NotificatorSMS();
		Notificator notificatorMananger=new NotificatorManager();
		
		Client client= new Client("Ionel",null,null);
		
		notificatorEmail.setUrmatorulNotificator(notificatorSMS);
		notificatorSMS.setUrmatorulNotificator(notificatorMananger);
		
		notificatorEmail.notifica(client, "BAA");
		

	}

}
