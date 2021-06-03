package factorymethod;

public class VitaFcatory implements SupaFActory{

	@Override
	public Supa creareSupa(float gramaj) {
		return new SupaVita(gramaj);
	}

}
