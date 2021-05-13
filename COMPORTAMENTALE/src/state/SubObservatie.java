package state;

public class SubObservatie implements Stare{

	@Override
	public void schimbaStarea(Pacient pacient) {
		pacient.setStare(this);
		System.out.println("SUB OBSERVATIE");
		
	}

}
