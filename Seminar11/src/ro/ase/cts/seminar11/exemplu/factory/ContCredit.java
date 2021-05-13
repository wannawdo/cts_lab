package ro.ase.cts.seminar11.exemplu.factory;

public class ContCredit implements ContBancar {
	private double total = 1000;
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total=total - suma;
		destinatie.depunere(suma);
		System.out.println(" suma: " + suma + " de lei a fost adaugata in cont bancar - cont credit");
		
	}

	@Override
	public void depunere(double suma) {
		total=total+suma;
		System.out.println(" suma: " + suma + " de lei a fost adaugata in contul curent - cont credit");
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContCredit [total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}

}
