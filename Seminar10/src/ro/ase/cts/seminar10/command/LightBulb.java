package ro.ase.cts.seminar10.command;

public class LightBulb {
	int lightIntensity = 0;

	public void turnOnLight() {
		System.out.println("Light is on");
		lightIntensity = 1;
	}

	public void turnOffLight() {
		System.out.println("Light is off");
		lightIntensity = 0;
	}

	public void dimLight() {
		System.out.println("Dimming light");
		if (lightIntensity > 0) {
			lightIntensity--;
		}
		System.out.println("Light is at " + lightIntensity + " intesity level.");
	}

	public void increaseLightIntensity() {
		System.out.println("Increasing intensity");
		lightIntensity++;
		System.out.println("Light is at " + lightIntensity + " intesity level.");
	}
}
