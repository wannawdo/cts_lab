package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	List<Command> listaComenzi;

	public Operator() {
		super();
		this.listaComenzi = new ArrayList<>();
	}
	
	public void adaugaComenzi(Command comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		listaComenzi.get(0).executaComanda();
		listaComenzi.remove(0);
	}
	
}
