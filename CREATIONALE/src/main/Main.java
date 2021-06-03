package main;

import builder.BuiderConcret;
import builder.Factura;
import builder2.BuilderCont;
import builder2.ContClient;
import factory.Supa;
import factory.SupaFactory;
import factory.TipSupa;
import factory2.Credit;
import factory2.CreditFactory;
import factory2.CreditIpotecar;
import factory2.TipCredit;
import factorymethod.CiuperciFactory;
import factorymethod.SupaFActory;
import factorymethod2.CreditNevoiPersnaleFactory;
import prototype.Client;
import singleton.Presedinte;

public class Main {
	// System.out.println("---------------FACTORY METHOD-----------");
	public static void afisare(SupaFActory fabrica, float gramaj) {
		factorymethod.Supa s = fabrica.creareSupa(gramaj);
		s.descriere();
	}

	// System.out.println("---------------FACTORY METHOD2-----------");
	public static void afisareCredit(factorymethod2.CreditFactory cf) {
		factorymethod2.Credit cred = cf.creeazaCredit2();
		cred.descriereCredit2();
	}

	public static void main(String[] args) {
		System.out.println("-----------SINGLETON----------");
		Presedinte p = Presedinte.creareInstnta("IOn", 6, 2000);
		Presedinte p2 = Presedinte.creareInstnta("IOnellll", 7, 2100);

		System.out.println(p.getNume());
		System.out.println(p2.getNume());

		System.out.println("---------------FACTORY-----------");
		try {
			Supa sCiuperci = SupaFactory.creeaza(TipSupa.CIUPERCI, 150);
			System.out.println(sCiuperci.toString());
			Supa sVita = SupaFactory.creeaza(TipSupa.VITA, 150);
			System.out.println(sVita.toString());
			Supa sLegume = SupaFactory.creeaza(TipSupa.LEGUME, 150);
			System.out.println(sLegume.toString());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------FACTORY METHOD-----------");

		CiuperciFactory c = new CiuperciFactory();
		afisare(c, 500);

		System.out.println("---------------FACTORY2-----------");
		try {
			Credit credit = CreditFactory.creeazaCredit(TipCredit.IPOTECARE);
			credit.descrieCredit();
			Credit credit2 = CreditFactory.creeazaCredit(TipCredit.NEVOI_PERSONALE);
			credit2.descrieCredit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------FACTORY METHOD2-----------");
		CreditNevoiPersnaleFactory cnp = new CreditNevoiPersnaleFactory();
		afisareCredit(cnp);

		System.out.println("---------------PROTOTYPE-----------");
		Client client1 = new Client("112", "3277 4378", "Ionel");
		Client client2 = (Client) client1.copiazaClient();
		System.out.println(client1.toString());
		System.out.println(client2.toString());

		System.out.println("---------------PROTOTYPE2-----------");
		prototype2.Client c2 = new prototype2.Client(10, "ionel", "ion");
		prototype2.Client c3 = (prototype2.Client) c2.copiazaClientt();
		System.out.println(c2.toString());
		System.out.println(c3.toString());

		System.out.println("---------------BUILDER-----------");
		BuiderConcret b1 = new BuiderConcret();
		Factura fac1 = b1.setCardFidelitate(true).setNrPungi(10).creeaza();
		System.out.println(fac1.toString());

		System.out.println("---------------BUILDER2-----------");
		BuilderCont bc = new BuilderCont();
		ContClient cc = bc.setCardAtasat(true).creeazaCont();
		System.out.println(cc.toString());
	}

}
