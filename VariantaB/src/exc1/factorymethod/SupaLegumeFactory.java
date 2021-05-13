package exc1.factorymethod;

public class SupaLegumeFactory implements SupaFactory{

	@Override
	public Supa creeazaSupa() {
		return new SupaLegume();
	}

}
