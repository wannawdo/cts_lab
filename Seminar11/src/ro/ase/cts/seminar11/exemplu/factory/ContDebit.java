package ro.ase.cts.seminar11.exemplu.factory;

public class ContDebit implements ContBancar {
	private double total = 1000;

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total=total - suma;
		destinatie.depunere(suma);
		System.out.println(" suma: " + suma + " de lei a fost adaugata in cont bancar - cont debit");
		

	}

	@Override
	public void depunere(double suma) {
		total=total+suma;
		System.out.println(" suma: " + suma + " de lei a fost adaugata in contul curent - cont debit");

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContDebit [total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}

}
