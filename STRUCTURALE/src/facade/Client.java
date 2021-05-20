package facade;

public class Client {
	private String nume;

	public Client(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean areReteta() {
		if (nume.length() > 4) {
			return true;
		} else
			return false;
	}

}
