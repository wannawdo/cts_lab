package factory;

public class SupaaVita extends Supa {
	public SupaaVita(float gramaj) {
		super(gramaj);
	}
	

	@Override
	public String toString() {
		return "SupaaVita - gramaj = " + getGramaj();
	}
}
