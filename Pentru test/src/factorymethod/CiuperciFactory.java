package factorymethod;

public class CiuperciFactory implements SupaFActory{

	@Override
	public Supa creareSupa(float gramaj) {
		return new SupaCiuperci(gramaj);
	}

}
