package exc1.factorymethod;

public class SupaVitaFactory implements SupaFactory{

	@Override
	public Supa creeazaSupa() {
		return new SupaVita();
	}

}
