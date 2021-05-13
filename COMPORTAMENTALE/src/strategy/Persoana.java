package strategy;

public class Persoana {
	private ModProcesareDocumente mod;
	private String nume;
	private String adresa;

	public Persoana( String nume, String adresa) {
		super();
		this.mod = new PersoanaFizica();
		this.nume = nume;
		this.adresa = adresa;
	}
	
	public void stabilireTip() {
		mod.proceseazaDocumente(nume);
	}

	public void setMod(ModProcesareDocumente mod) {
		this.mod = mod;
	}

	
}
