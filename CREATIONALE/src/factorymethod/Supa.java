package factorymethod;

public abstract class Supa {
	private float gramaj;

	public Supa(float gramaj) {
		super();
		this.gramaj = gramaj;
	}

	public float getGramaj() {
		return gramaj;
	}
	public abstract void descriere();
}
