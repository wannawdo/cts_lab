package factory;

public class SupaLegume extends Supa {

	public SupaLegume(float gramaj) {
		super(gramaj);
	}
	

	@Override
	public String toString() {
		return "SupaLegume - gramaj = " + getGramaj();
	}
	
	

}
