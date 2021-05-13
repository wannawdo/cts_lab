package exc3.main;

import exc1.factorymethod.SupaFactory;
import exc1.factorymethod.SupaLegumeFactory;
import exc3.factorysimple.Supa;
import exc3.factorysimple.SupaLegume;
import exc3.factorysimple.TipSupa;

public class Main {

	public static void main(String[] args) {
		System.out.println("-----SIMPLE FACTORY-----");
		
		Supa supa;
		try {
			supa = exc3.factorysimple.SupaFactory.creeazaSupa(TipSupa.LEGUME);
			supa.descriereSupa();
			Supa supa2=exc3.factorysimple.SupaFactory.creeazaSupa(TipSupa.CIUPERCI);
			supa2.descriereSupa();
			Supa supa3=exc3.factorysimple.SupaFactory.creeazaSupa(TipSupa.VITA);
			supa3.descriereSupa();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
