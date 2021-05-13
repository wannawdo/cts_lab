package chain.numain;

public class NotificatorSMS extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		if(client.getTelefon()!=null) {
			System.out.println(mesaj+" - SMS");
		}
		else
		{
			super.getUrmatorulNotificator().notifica(client, mesaj);;
		}
		
	}

}
