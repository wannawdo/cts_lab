package builder;

public class Factura {

	private int nrPungi;
	private boolean plataCuCardul;
	private boolean cardFidelitate;
	private boolean cotaTVA;

	public Factura(int nrPungi, boolean plataCuCardul, boolean cardFidelitate, boolean cotaTVA) {
		super();
		this.nrPungi = nrPungi;
		this.plataCuCardul = plataCuCardul;
		this.cardFidelitate = cardFidelitate;
		this.cotaTVA = cotaTVA;
	}

	public int getNrPungi() {
		return nrPungi;
	}

	public void setNrPungi(int nrPungi) {
		this.nrPungi = nrPungi;
	}

	public boolean isPlataCuCardul() {
		return plataCuCardul;
	}

	public void setPlataCuCardul(boolean plataCuCardul) {
		this.plataCuCardul = plataCuCardul;
	}

	public boolean isCardFidelitate() {
		return cardFidelitate;
	}

	public void setCardFidelitate(boolean cardFidelitate) {
		this.cardFidelitate = cardFidelitate;
	}

	public boolean isCotaTVA() {
		return cotaTVA;
	}

	public void setCotaTVA(boolean cotaTVA) {
		this.cotaTVA = cotaTVA;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Factura [nrPungi=");
		if (nrPungi != 0) {
			builder.append(nrPungi);
		} else
			builder.append("nu a cerut pungi");
		builder.append(", plataCuCardul=");
		builder.append(plataCuCardul);
		builder.append(", cardFidelitate=");
		builder.append(cardFidelitate);
		builder.append(", cotaTVA=");
		builder.append(cotaTVA);
		builder.append("]");
		return builder.toString();
	}

}
