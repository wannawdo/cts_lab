package factorymethod;

public class SupaVita extends Supa {
	public SupaVita(float gramaj) {
		super(gramaj);
	}

	@Override
	public void descriere() {
		System.out.println("Supa vita");

	}
}
