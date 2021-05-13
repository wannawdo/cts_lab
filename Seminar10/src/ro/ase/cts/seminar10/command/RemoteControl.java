package ro.ase.cts.seminar10.command;

public class RemoteControl {
	CommandInterface lightOnCommand;
	CommandInterface lightOffCommand;
	CommandInterface dimLightCOmmand;
	CommandInterface increaseLightCommand;

	public RemoteControl(CommandInterface lightOnCommand, CommandInterface lightOffCommand,
			CommandInterface dimLightCOmmand, CommandInterface increaseLightCommand) {
		super();
		this.lightOnCommand = lightOnCommand;
		this.lightOffCommand = lightOffCommand;
		this.dimLightCOmmand = dimLightCOmmand;
		this.increaseLightCommand = increaseLightCommand;
	}

	public void pressLightOnButton() {
		lightOnCommand.execute();
	}

	public void pressLightOffButton() {
		lightOffCommand.execute();
	}

	public void pressDimButton() {
		dimLightCOmmand.execute();
	}

	public void pressIncreaseLightButton() {
		increaseLightCommand.execute();
	}

}
