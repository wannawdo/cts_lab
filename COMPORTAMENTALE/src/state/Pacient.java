package state;

public class Pacient {
	private String nume;
	private Stare stare;
	private boolean esteStareGrava=false;
	public Pacient(String nume) {
		super();
		this.nume = nume;
		this.stare = new Externat();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Stare getStare() {
		return stare;
	}

	public void setStare(Stare stare) {
		this.stare = stare;
	}

	public boolean isEsteStareGrava() {
		return esteStareGrava;
	}

	public void setEsteStareGrava(boolean esteStareGrava) {
		this.esteStareGrava = esteStareGrava;
	}

	public void externeazaPacient() {
		Externat externat = new Externat();
		externat.schimbaStarea(this);
	}

	public void interneazaPacient() {
		Internat internat = new Internat();
		internat.schimbaStarea(this);
	}

	public void subObservatiePacient() {
		SubObservatie subObs = new SubObservatie();
		subObs.schimbaStarea(this);
	}

}
