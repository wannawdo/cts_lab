package ro.ase.cts.seminar7.adapter;

public class AmericanCar implements MoveableImperial {
	private String model;

	public AmericanCar(String model) {
		super();
		this.model = model;
	}

	@Override
	public int getMaxSpeedImperial() {
		//in imperial system
		return 260;
	}

}
