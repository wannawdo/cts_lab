package decorator;

public class BonDeCasa implements iBonDeCasa {
	private float pret;

	public BonDeCasa(float pret) {
		super();
		this.pret = pret;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	@Override
	public void printeazaBon() {
		System.out.println("Bonul are valoarea de "+pret+" RON.");

	}

}
