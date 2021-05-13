package factorymethod2;

public class CreditNevoiPersnaleFactory implements CreditFactory{

	@Override
	public Credit creeazaCredit2() {
		return new CreditNevoiPersonale();
	}

}
