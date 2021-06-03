package builder2;

public class BuilderCont implements BuiderCont {
	ContClient c;

	public BuilderCont() {
		c = new ContClient(false, false, false);
	}

	public BuilderCont setContSalariu(boolean contSalariu) {
		c.setContSalariu(contSalariu);
		return this;
	}

	public BuilderCont setCardAtasat(boolean cardAtasat) {
		c.setCardAtasat(cardAtasat);
		return this;
	}

	public BuilderCont setInternetBanking(boolean internetBanking) {
		c.setInternetBanking(internetBanking);
		return this;
	}

	@Override
	public ContClient creeazaCont() {
		return c;
	}

}
