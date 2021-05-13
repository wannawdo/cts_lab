package strategy2.main;

import strategy2.Client;
import strategy2.PlataCard;

public class Main {

	public static void main(String[] args) {
		Client client=new Client("client");
		client.setMod(new PlataCard());
		client.achitaNota(100);

	}

}
