package strategy;

public class PersoanaFizica implements ModProcesareDocumente{

	@Override
	public void proceseazaDocumente(String nume) {
		System.out.println("PF - se solicita doar buletinul si adeverinta de la munca");
		
	}

}
