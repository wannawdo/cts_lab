package factory2;

public class CreditFactory {
	public static Credit creeazaCredit(TipCredit tip) throws Exception {
		switch (tip) {
		case NEVOI_PERSONALE:
			return new CreditNevoiPersonale();
		case IPOTECARE:
			return new CreditIpotecar();
		default:
			throw new Exception("Tip credit inexistent");
		}
	}
}
