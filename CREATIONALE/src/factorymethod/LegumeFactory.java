package factorymethod;

public class LegumeFactory implements SupaFActory {

	@Override
	public Supa creareSupa(float gramaj) {
		return new SupaLegume(gramaj);
	}

}
