package exc3.factorysimple;

public class SupaFactory {
	public static Supa creeazaSupa(TipSupa tip) throws Exception {
		switch (tip) {
		case LEGUME:
			return new SupaLegume();
		case VITA:
			return new SupaVita();
		case CIUPERCI:
			return new SupaCiuperci();

		default:
			throw new Exception( "Ceva nu a mers bine");
		}
	}
}
