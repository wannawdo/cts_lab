package exc2.builder;

public class Rezervare {
	private boolean asezareLaGeam;
	private boolean scauneErgonomice;
	private boolean decorareMasa;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public Rezervare() {}

	public Rezervare(boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareMasa,
			boolean muzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.asezareLaGeam = asezareLaGeam;
		this.scauneErgonomice = scauneErgonomice;
		this.decorareMasa = decorareMasa;
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [asezareLaGeam=");
		builder.append(asezareLaGeam);
		builder.append(", scauneErgonomice=");
		builder.append(scauneErgonomice);
		builder.append(", decorareMasa=");
		builder.append(decorareMasa);
		builder.append(", muzicaAmbientalaPersonalizata=");
		builder.append(muzicaAmbientalaPersonalizata);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}

	public void setAsezareLaGeam(boolean asezareLaGeam) {
		this.asezareLaGeam = asezareLaGeam;
	}

	public void setScauneErgonomice(boolean scauneErgonomice) {
		this.scauneErgonomice = scauneErgonomice;
	}

	public void setDecorareMasa(boolean decorareMasa) {
		this.decorareMasa = decorareMasa;
	}

	public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	
	
}
