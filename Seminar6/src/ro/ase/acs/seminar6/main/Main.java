package ro.ase.acs.seminar6.main;

import java.util.Scanner;

import ro.ase.acs.seminar6.builder.AbstractProductFactory;
import ro.ase.acs.seminar6.builder.OfficeProduct;
import ro.ase.acs.seminar6.builder.Product;
import ro.ase.acs.seminar6.builder.ProductFactory;
import ro.ase.acs.seminar6.builder.TechProduct;
import ro.ase.acs.seminar6.builder.TechProductFactory;
import ro.ase.acs.seminar6.singleton.Cart;

public class Main {

	public static void main(String[] args) {
		Cart myShoppingCart = Cart.getInstance("shopping");

		Scanner scan = new Scanner(System.in);
		System.out.println("Selectati categoria de produse: \n tech - Produse tech \n office - Produse office");
		String userPreference = scan.nextLine();
		Product myProduct = null;
		AbstractProductFactory productFactory = null;
		if (userPreference != null) {
			if (userPreference.equalsIgnoreCase("tech")) {
				productFactory = new TechProductFactory();
			}
		}
		myProduct = productFactory.makeProduct();
//		else {
//			System.out.println("Optiune invalida.");
//			System.out.println("Catalog de produse: \n tech - Produse tech \n office - Produse office");
//		}
		if (myProduct != null) {
			myShoppingCart.products.add(myProduct);
		}
		for (Product p : myShoppingCart.products) {
			System.out.println(p.getDescription());
		}
	}

}
