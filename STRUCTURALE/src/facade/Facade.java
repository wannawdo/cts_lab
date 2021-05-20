package facade;

public class Facade {
	public static boolean esteEligibil(Client client) {
		if (client.getNume().length() < 4)
			return false;
		else if (!(Depozit.areMedicament(client))) {
			return true;
		} else if (!(BDCardSanatate.areCard(client)))
			return true;
		return true;

	}
}
