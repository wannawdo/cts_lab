package strategy.main;

import strategy.ModProcesareDocumente;
import strategy.Persoana;
import strategy.PersoanaJuridica;

public class Main {

	public static void main(String[] args) {
	Persoana persoana = new Persoana("Ionrl","strada x");
	persoana.stabilireTip();
	persoana.setMod(new PersoanaJuridica());
	persoana.stabilireTip();

	}

}
