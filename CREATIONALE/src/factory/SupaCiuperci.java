package factory;

public class SupaCiuperci extends Supa {
	public SupaCiuperci(float gramaj) {
		super(gramaj);
	}
	

	@Override
	public String toString() {
		return "SupaCiuperci - gramaj = " + getGramaj();
	}
}
