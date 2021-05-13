package state;

public class Internat implements Stare {

	@Override
	public void schimbaStarea(Pacient pacient) {
		if (pacient.isEsteStareGrava() == true && !(pacient.getStare() instanceof Internat)) {
			pacient.setStare(this);
			System.out.println("INTERNAT");
		} else {
			System.out.println("Pacientul nu poate fi internnat!");
		}

	}

}
