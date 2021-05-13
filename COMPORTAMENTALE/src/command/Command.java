package command;

public abstract class Command {
	private ContBancar cont;
	private float suma;

	public abstract void executaComanda();

	public Command(ContBancar cont, float suma) {
		super();
		this.cont = cont;
		this.suma = suma;
	}

	public ContBancar getCont() {
		return cont;
	}

	public void setCont(ContBancar cont) {
		this.cont = cont;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

}
