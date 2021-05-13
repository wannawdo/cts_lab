package composite;

import javax.sound.midi.Soundbank;

public class Medicament implements Sectiune {
	private String nume;;
	private int id;

	public Medicament(String nume, int id) {
		super();
		this.nume = nume;
		this.id = id;
	}

	@Override
	public void adaugaNod(Sectiune sectiune) {
		throw new IllegalArgumentException("Nu se poate");
	}

	@Override
	public void stergereNod(Sectiune sectiune) {
		throw new IllegalArgumentException("Nu se poate");

	}

	@Override
	public Sectiune iaNod(int index) {
		throw new IllegalArgumentException("Nu se poate");
	}

	@Override
	public void descriere() {
		System.out.println(id + " | " + nume);

	}

}
