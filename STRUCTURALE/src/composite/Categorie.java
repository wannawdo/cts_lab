package composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Sectiune {
	List<Sectiune> listaSeciuni;
	private String nume;

	public Categorie(String nume) {
		super();
		this.listaSeciuni = new ArrayList<Sectiune>();
		this.nume = nume;
	}

	@Override
	public void adaugaNod(Sectiune sectiune) {
		listaSeciuni.add(sectiune);

	}

	@Override
	public void stergereNod(Sectiune sectiune) {
		listaSeciuni.remove(sectiune);

	}

	@Override
	public Sectiune iaNod(int index) {

		return listaSeciuni.get(index);
	}

	@Override
	public void descriere() {
		System.out.println(nume);
		for (Sectiune s : listaSeciuni) {
			s.descriere();
		}

	}

}
