package ro.ase.cts.seminar11.exemplu.main;

import ro.ase.cts.seminar11.exemplu.adapter.AdapterCont;
import ro.ase.cts.seminar11.exemplu.adapter.BankAccount;
import ro.ase.cts.seminar11.exemplu.factory.ContBancar;
import ro.ase.cts.seminar11.exemplu.single.SingleBanca;

public class Main {
	public static void main(String[] args) {
		SingleBanca singleBanca = SingleBanca.getInstance("BCR", "Strada x");
		ContBancar contBancar1 = singleBanca.createInstance("CREDIT");
		ContBancar contBancar2 = singleBanca.createInstance("DEBIT");
		System.out.println(contBancar1);
		System.out.println(contBancar2);

		System.out.println("Numar conturi: " + SingleBanca.NRCONT);

		ContBancar adapterCont=new AdapterCont();
		System.out.println(adapterCont);
		
		BankAccount bankAccount=new AdapterCont();
		System.out.println(adapterCont);

		adapterCont.transfer(contBancar1,200);
		System.out.println(adapterCont);
		
		adapterCont.depunere(500);
		System.out.println(adapterCont);
		
		((BankAccount)adapterCont).accountTransfer(bankAccount, 200);
		System.out.println(adapterCont);

	}
}
