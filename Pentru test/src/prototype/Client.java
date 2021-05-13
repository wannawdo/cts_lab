package prototype;

public class Client implements iClient {

	private String cnp;
	private String numarCard;
	private String nume;

	public Client() {
	}

	public Client(String cnp, String numarCard, String nume) {
		super();
		this.cnp = cnp;
		this.numarCard = numarCard;
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Client [cnp=" + cnp + ", numarCard=" + numarCard + ", nume=" + nume + "]";
	}

	@Override
	public iClient copiazaClient() {
		Client client = new Client();
		client.cnp = this.cnp;
		client.numarCard = this.numarCard;
		client.nume = this.nume;

		return client;
	}

}
