package decorator.main;

import decorator.BonDeCasa;
import decorator.BonDecorat;
import decorator.Decorator;

public class Main {

	public static void main(String[] args) {
		BonDeCasa bon=new BonDeCasa(100);
		bon.printeazaBon();
		System.out.println("----------");
		Decorator bonDecorator=new BonDecorat(bon);
		bonDecorator.printeazaBon();
		System.out.println("----------");
		bonDecorator.aplicaDiscount(90);

	}

}
