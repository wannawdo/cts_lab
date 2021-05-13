package composite.main;

import composite.Categorie;
import composite.Medicament;
import composite.Sectiune;

public class Main {

	public static void main(String[] args) {
		// adulti, copii->medicament
		// adulti->gripa ->medicAMENT
		Sectiune toateMedicamentele = new Categorie("DE TOATE");
		Sectiune adulti = new Categorie("Adulti");
		Sectiune copii = new Categorie("Copii");
		Sectiune gripa = new Categorie("Gripa");
		Sectiune orezCuLapte = new Medicament("Orezzz cu lappte", 1);
		Sectiune paracetamol = new Medicament("Paracetamol", 2);
		toateMedicamentele.adaugaNod(adulti);
		toateMedicamentele.adaugaNod(copii);
		adulti.adaugaNod(gripa);
		gripa.adaugaNod(orezCuLapte);
		copii.adaugaNod(paracetamol);
		toateMedicamentele.descriere();

	}

}
