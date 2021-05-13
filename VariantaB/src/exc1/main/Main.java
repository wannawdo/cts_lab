package exc1.main;

import exc1.factorymethod.Supa;
import exc1.factorymethod.SupaCiuperci;
import exc1.factorymethod.SupaCiuperciFactory;
import exc1.factorymethod.SupaFactory;
import exc1.factorymethod.SupaLegumeFactory;
import exc1.factorymethod.SupaVitaFactory;

public class Main {
	public static void afisareSupa(SupaFactory s) {
		Supa supa = s.creeazaSupa();
		supa.descriereSupa();
	}

	public static void main(String[] args) {

		System.out.println("\n------------FACTORY-----------");
		SupaCiuperciFactory sc = new SupaCiuperciFactory();
		afisareSupa(sc);

		SupaVitaFactory sv = new SupaVitaFactory();
		afisareSupa(sv);

		SupaLegumeFactory sl = new SupaLegumeFactory();
		afisareSupa(sl);
	}

}
