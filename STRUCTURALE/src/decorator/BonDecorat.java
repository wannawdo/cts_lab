package decorator;

public class BonDecorat extends Decorator {

	public BonDecorat(iBonDeCasa bon) {
		super(bon);
	}

	@Override
	public void printeazaBon() {
		super.printeazaBon();
		System.out.println("LMA");
	}

	@Override
	public void aplicaDiscount(float procent) {
		System.out.println(
				"Ati primit o reducere de " + (((BonDeCasa) super.getBon()).getPret()) * (procent / 100) + " RON");

	}

}
