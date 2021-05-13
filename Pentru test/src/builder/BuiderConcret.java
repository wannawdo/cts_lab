package builder;

public class BuiderConcret implements Builder {
	private Factura factura;

	public BuiderConcret() {
		factura = new Factura(0, false, false, false);
	}

	public BuiderConcret setNrPungi(int nrPungi) {
		factura.setNrPungi(nrPungi);
		return this;
	}

	public BuiderConcret setPlataCuCardul(boolean plataCuCardul) {
		factura.setPlataCuCardul(plataCuCardul);
		return this;
	}

	public BuiderConcret setCardFidelitate(boolean cardFidelitate) {
		factura.setCardFidelitate(cardFidelitate);
		return this;
	}

	public BuiderConcret setCotaTVA(boolean cotaTVA) {
		factura.setCotaTVA(cotaTVA);
		return this;
	}

	@Override
	public Factura creeaza() {
		return factura;
	}

}
