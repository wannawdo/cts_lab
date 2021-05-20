package facade.main;

import facade.Client;
import facade.Facade;

public class Main {

	public static void main(String[] args) {
		Client c = new Client("Ion");
		if (Facade.esteEligibil(c)) {
			System.out.println("E eliginil");
		} else
			System.out.println("nu e");

	}

}
