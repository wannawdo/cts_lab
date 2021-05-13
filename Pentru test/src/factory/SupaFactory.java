package factory;

public class SupaFactory {
	public static Supa creeaza(TipSupa tip, float gramaj) throws Exception {
		switch (tip) {
		case LEGUME:
			return new SupaLegume(gramaj);

		case CIUPERCI:
			return new SupaCiuperci(gramaj);

		case VITA:
			return new SupaaVita(gramaj);

		default:
			throw new Exception("Nu exista acest tip");
		}
	}
}
