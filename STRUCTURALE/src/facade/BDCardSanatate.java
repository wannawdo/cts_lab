package facade;

public class BDCardSanatate {
	public static boolean areCard(Client c) {
		if (c.getNume().length() < 5) {
			return true;
		} else
			return false;
	}
}
