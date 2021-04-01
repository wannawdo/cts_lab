package ro.ase.acs.seminar6.builder;

public class ProductFactory {
	public static Product makeProduct(String type, String productName) throws UnsupportedOperationException {
		if (type.equalsIgnoreCase("tech")) {
			return new TechProduct.TechProductBuilder(0).getProduct();
		} else if (type.equalsIgnoreCase("office")) {
			return new OfficeProduct(productName);
		} else {
			throw new UnsupportedOperationException();
		}
	}
}