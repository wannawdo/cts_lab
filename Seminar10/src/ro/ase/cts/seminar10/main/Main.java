package ro.ase.cts.seminar10.main;

import ro.ase.cts.seminar10.chain.AbstractLogger;
import ro.ase.cts.seminar10.chain.LoggerChainFactory;
import ro.ase.cts.seminar10.chain.Verbosity;
import ro.ase.cts.seminar10.command.CommandInterface;
import ro.ase.cts.seminar10.command.DimLightCommand;
import ro.ase.cts.seminar10.command.IncreaseLightIntensityCommand;
import ro.ase.cts.seminar10.command.LightBulb;
import ro.ase.cts.seminar10.command.RemoteControl;
import ro.ase.cts.seminar10.command.TurnLightOnCommand;
import ro.ase.cts.seminar10.command.TurnOffLightCommand;
import ro.ase.cts.seminar10.strategy.MarketingStrategyInterface;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
		System.out.println("------------STRATEGY------------");
		ModulMarketing modulMarketing = new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);

		modulMarketing.setCurrentStrategy(new MarketingStrategyInterface() {

			@Override
			public double calculateBonus(double base) {
				return 30 * base;
			}
		});
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);

		modulMarketing.setCurrentStrategy((base) -> {
			return 20 * base;
		});
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: " + puncteBonus);

		System.out.println("\n------------CHAIN OF RESPONSABLITY------------");
		AbstractLogger loggerChain = LoggerChainFactory.getChainOfLoggers();
		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
		loggerChain.logMessage(Verbosity.DEBUGG, "This is a debug message");

		System.out.println("\n------------COMMAND------------");
		LightBulb bulb = new LightBulb();
		CommandInterface lightOnCommand = new TurnLightOnCommand(bulb);
		CommandInterface lightOFFCommand = new TurnOffLightCommand(bulb);
		CommandInterface dimLightCommand = new DimLightCommand(bulb);
		CommandInterface increaseIntensityCommand = new IncreaseLightIntensityCommand(bulb);
		RemoteControl remote = new RemoteControl(lightOnCommand, lightOFFCommand, dimLightCommand,
				increaseIntensityCommand);
		remote.pressLightOnButton();
		remote.pressIncreaseLightButton();
		remote.pressDimButton();
		remote.pressDimButton();

	}

}
