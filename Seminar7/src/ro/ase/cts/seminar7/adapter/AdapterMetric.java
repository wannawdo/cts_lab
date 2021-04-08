package ro.ase.cts.seminar7.adapter;

public class AdapterMetric implements MoveableImperial {
	private EuropeanCar euroCar;
	private final double multiplier = 0.621371d;

	public AdapterMetric(EuropeanCar euroCar) {
		super();
		this.euroCar = euroCar;
	}

	@Override
	public int getMaxSpeedImperial() {
		return kmToMiles();
	}

	private int kmToMiles() {
		return (int) (euroCar.getMaxSpeed() * multiplier);
	}

}
