package exc2.builder;

public class BuilderConcret implements Builder{
	private Rezervare rezervare;

	public BuilderConcret() {
		rezervare = new Rezervare(false, false, false, false, "n/a");
	}

	public BuilderConcret setAsezareLaGeam(boolean asezareLaGeam) {
		rezervare.setAsezareLaGeam(asezareLaGeam);
		return this;
	}

	public BuilderConcret setScauneErgonomice(boolean scauneErgonomice) {
		rezervare.setScauneErgonomice(scauneErgonomice);
		return this;
	}

	public BuilderConcret setDecorareMasa(boolean decorareMasa) {
		rezervare.setDecorareMasa(decorareMasa);
		return this;
	}

	public BuilderConcret setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
		return this;
	}

	public BuilderConcret setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}

	@Override
	public Rezervare creeazaRezervare() {
		return rezervare;
	}
}
