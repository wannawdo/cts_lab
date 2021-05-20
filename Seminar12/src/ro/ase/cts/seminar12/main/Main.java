package ro.ase.cts.seminar12.main;


import java.util.ArrayList;

import ro.ase.cts.seminar12.memento.CharacterMemento;
import ro.ase.cts.seminar12.memento.GameCharacter;
import ro.ase.cts.seminar12.observer.BankAccount;
import ro.ase.cts.seminar12.observer.CreditAccount;
import ro.ase.cts.seminar12.observer.InsufficientFundsException;
import ro.ase.cts.seminar12.observer.NotificationInterface;
import ro.ase.cts.seminar12.observer.SMSNotification;
import ro.ase.cts.seminar12.template.HexFormatter;
import ro.ase.cts.seminar12.template.DecimalFormatter;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------------OBSERVER------------");
		CreditAccount account = new CreditAccount();
		account.addObserver(new NotificationInterface() {

			@Override
			public void notifyUser(double amount) {
				System.out.println("[INLINE EXAMPLE]: " + amount + " extracted.");

			}
		});
		NotificationInterface smsNotificationService = new SMSNotification();
		account.addObserver(smsNotificationService);
		try {
			account.withdraw(500);
			account.removeObserver(smsNotificationService);
			account.withdraw(200);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("-------------MEMENTO------------");
		ArrayList<CharacterMemento> saveList = new ArrayList<CharacterMemento>();
		GameCharacter myCharacter = new GameCharacter("Oana", 1050);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("My character hitpoints: "+ myCharacter.getHitpoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("My character hitpoints: "+ myCharacter.getHitpoints());

		
		System.out.println("-------------TEMPLATE------------");
		DecimalFormatter decimalFormatter=new DecimalFormatter();
		decimalFormatter.displayOutput(10);
		HexFormatter hexFormatter=new HexFormatter();
		hexFormatter.displayOutput(10);
	}
}
