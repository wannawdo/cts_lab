package ro.ase.cts.seminar11.exemplu.single;

import ro.ase.cts.seminar11.exemplu.factory.ContBancar;
import ro.ase.cts.seminar11.exemplu.factory.ContCredit;
import ro.ase.cts.seminar11.exemplu.factory.ContDebit;

public class SingleBanca {
	private String denumire;
	private String adresa;
	public static int NRCONT=0;

	private static SingleBanca INSTANCE;

	public SingleBanca(String denumire, String adresa) {
		this.denumire = denumire;
		this.adresa = adresa;
	}

	public static synchronized SingleBanca getInstance(String denumire, String adresa) {
		if (INSTANCE == null)
			INSTANCE = new SingleBanca(denumire, adresa);
		return INSTANCE;

	}

	public ContBancar createInstance(String tipCont) {
		ContBancar contBancar;
		switch (tipCont) {
		case "CREDIT":
			contBancar = new ContCredit();
			NRCONT++;
			break;
		case "DEBIT":
			contBancar = new ContDebit();
			NRCONT++;
			break;
		default:
			contBancar=null;
			break;
		}
		return contBancar;
	}

}
