package command;

public class ComandaDepunere extends Command{

	public ComandaDepunere(ContBancar cont, float suma) {
		super(cont, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executaComanda() {
		super.getCont().depunere(super.getSuma());
		
	}

}
