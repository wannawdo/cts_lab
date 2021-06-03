package factorymethod;

public class SupaLegume extends Supa {
	public SupaLegume(float gramaj) {
		super(gramaj);
	}

	@Override
	public void descriere() {
		System.out.println("Supa legume");

	}
}
