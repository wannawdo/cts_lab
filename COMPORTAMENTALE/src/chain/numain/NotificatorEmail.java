package chain.numain;

public class NotificatorEmail extends Notificator {
	@Override
	public void notifica(Client client, String mesaj) {
		if (client.getEmail() != null) {
			System.out.println(mesaj+" - email");
		} else {
			super.getUrmatorulNotificator().notifica(client, mesaj);
		}

	}
}
