package state;

public class Externat implements Stare {

	@Override
	public void schimbaStarea(Pacient pacient) {
		pacient.setStare(this);
		System.out.println("EXTERNAT");

	}

}
