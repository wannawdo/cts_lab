package decorator;

public abstract class Decorator implements iBonDeCasa {
	private iBonDeCasa bon;

	public Decorator(iBonDeCasa bon) {
		super();
		this.bon = bon;
	}

	public iBonDeCasa getBon() {
		return bon;
	}

	@Override
	public void printeazaBon() {
		bon.printeazaBon();

	}
	
	public abstract void aplicaDiscount(float procent);

}
