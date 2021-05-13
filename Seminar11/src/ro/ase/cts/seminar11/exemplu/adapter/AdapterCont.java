package ro.ase.cts.seminar11.exemplu.adapter;

import ro.ase.cts.seminar11.exemplu.factory.ContBancar;

public class AdapterCont  implements BankAccount, ContBancar{
private double total=500;
	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.transfer(this, amount);
		
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total=total - suma;
		destinatie.depunere(suma);
		System.out.println(" suma: " + suma + " de lei a fost adaugata in cont bancar - adapter cont");
		
	}

	@Override
	public void depunere(double suma) {
		total=total+suma;
		System.out.println(" suma: " + suma + " de lei a fost adaugata in contul curent - adapter cont");
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdapterCont [total=");
		builder.append(total);
		builder.append("]");
		return builder.toString();
	}
	
	

}
