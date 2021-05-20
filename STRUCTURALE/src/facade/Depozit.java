package facade;

public class Depozit {
	public static boolean areMedicament(Client c) {
		if (c.getNume().length() > 4)
			return true;
		else
			return false;
	}

}
