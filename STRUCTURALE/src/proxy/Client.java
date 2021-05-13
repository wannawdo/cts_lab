package proxy;

public class Client implements IClient {
	private String nume;
	private String gen;

	public Client(String nume, String gen) {
		super();
		this.nume = nume;
		this.gen = gen;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	@Override
	public void cumparaLapte() {
		System.out.println(nume+ " cumpara lapte");

	}

}
