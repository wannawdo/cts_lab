package command;

public class ComandaConstituire extends Command {

	public ComandaConstituire(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executaComanda() {
		super.getCont().constituire(super.getSuma());

	}

}
