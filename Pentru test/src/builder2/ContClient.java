package builder2;

public class ContClient {
	private boolean contSalariu;
	private boolean cardAtasat;
	private boolean internetBanking;
	public ContClient(boolean contSalariu, boolean cardAtasat, boolean internetBanking) {
		super();
		this.contSalariu = contSalariu;
		this.cardAtasat = cardAtasat;
		this.internetBanking = internetBanking;
	}
	public void setContSalariu(boolean contSalariu) {
		this.contSalariu = contSalariu;
	}
	public void setCardAtasat(boolean cardAtasat) {
		this.cardAtasat = cardAtasat;
	}
	public void setInternetBanking(boolean internetBanking) {
		this.internetBanking = internetBanking;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContClient [contSalariu=");
		builder.append(contSalariu);
		builder.append(", cardAtasat=");
		builder.append(cardAtasat);
		builder.append(", internetBanking=");
		builder.append(internetBanking);
		builder.append("]");
		return builder.toString();
	}
	
	
}
