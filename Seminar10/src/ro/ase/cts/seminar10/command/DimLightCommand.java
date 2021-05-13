package ro.ase.cts.seminar10.command;

public class DimLightCommand implements CommandInterface{
	private LightBulb lightBulb;

	public DimLightCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}

	@Override
	public void execute() {
		lightBulb.dimLight();

	}
}
