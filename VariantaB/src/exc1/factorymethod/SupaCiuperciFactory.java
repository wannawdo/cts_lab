package exc1.factorymethod;

public class SupaCiuperciFactory implements SupaFactory{

	@Override
	public Supa creeazaSupa() {
		return new SupaCiuperci();
	}

}
