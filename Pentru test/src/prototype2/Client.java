package prototype2;

public class Client implements iClientt {

	private int codClient;
	private String nume;
	private String prenume;

	public Client() {
	}

	public Client(int codClient, String nume, String prenume) {
		super();
		this.codClient = codClient;
		this.nume = nume;
		this.prenume = prenume;
	}

	@Override
	public String toString() {
		return "Client [codClient=" + codClient + ", nume=" + nume + ", prenume=" + prenume + "]";
	}

	@Override
	public iClientt copiazaClientt() {
		Client c = new Client();
		c.codClient = this.codClient;
		c.nume = this.nume;
		c.prenume = this.prenume;
		return c;
	}

}
