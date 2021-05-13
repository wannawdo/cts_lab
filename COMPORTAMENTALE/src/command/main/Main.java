package command.main;

import command.ComandaConstituire;
import command.ComandaDepunere;
import command.ContBancar;
import command.Operator;

public class Main {

	public static void main(String[] args) {
		ContBancar cont=new ContBancar("ION");
		Operator operator=new Operator();
		operator.adaugaComenzi(new ComandaConstituire(cont, 100000));
		operator.adaugaComenzi(new ComandaDepunere(cont, 500));
		operator.executaComanda();
		operator.executaComanda();
		

	}

}
