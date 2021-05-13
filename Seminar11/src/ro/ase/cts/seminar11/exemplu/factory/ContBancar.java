package ro.ase.cts.seminar11.exemplu.factory;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depunere(double suma);
}
