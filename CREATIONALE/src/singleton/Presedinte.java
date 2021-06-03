package singleton;

public class Presedinte {
	private String nume;
	private int durataMandat;
	private int anIncepere;

	private static Presedinte instanta = null;

	private Presedinte(String nume, int durataMandat, int anIncepere) {
		super();
		this.nume = nume;
		this.durataMandat = durataMandat;
		this.anIncepere = anIncepere;
	}

	public static synchronized Presedinte creareInstnta(String nume, int durataMandat, int anIncepere) {
		if (instanta == null) {
			instanta = new Presedinte(nume, durataMandat, anIncepere);
		}
		return instanta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getDurataMandat() {
		return durataMandat;
	}

	public void setDurataMandat(int durataMandat) {
		this.durataMandat = durataMandat;
	}

	public int getAnIncepere() {
		return anIncepere;
	}

	public void setAnIncepere(int anIncepere) {
		this.anIncepere = anIncepere;
	}

	public static Presedinte getInstanta() {
		return instanta;
	}

	public static void setInstanta(Presedinte instanta) {
		Presedinte.instanta = instanta;
	}

}
