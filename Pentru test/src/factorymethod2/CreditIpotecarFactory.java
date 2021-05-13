package factorymethod2;

public class CreditIpotecarFactory implements CreditFactory{

	@Override
	public Credit creeazaCredit2() {
		return new CreditIpotecar();
	}

}
