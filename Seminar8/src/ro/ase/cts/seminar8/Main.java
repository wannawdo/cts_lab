package ro.ase.cts.seminar8;

import ro.ase.acs.seminar8.facade.OrderFacade;
import ro.ase.cts.seminar8.composite.CatalogComponent;
import ro.ase.cts.seminar8.composite.Product;
import ro.ase.cts.seminar8.composite.ProductCatalog;
import ro.ase.cts.seminar8.decorator.AbstractBackpack;
import ro.ase.cts.seminar8.decorator.BackPack;
import ro.ase.cts.seminar8.decorator.WithFoodDecorator;
import ro.ase.cts.seminar8.decorator.WithLaptopDecorator;

public class Main {

	public static void main(String[] args) {
		System.out.println("------------------FACADE------------------");
		OrderFacade facade = new OrderFacade();
		facade.order();

		System.out.println("------------------COMPOSITE------------------");
		CatalogComponent laptop = new Product("ASUS", 5500);
		CatalogComponent smartPhone = new Product("Samsung s20", 3500);
		CatalogComponent techProductsCatalog = new ProductCatalog("Tech products");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartPhone);

		CatalogComponent officeProductCatalog = new ProductCatalog("Office products");
		CatalogComponent paperClip = new Product("Paper clip", 5);
		CatalogComponent pen = new Product("Pen", 2);
		officeProductCatalog.add(paperClip);
		officeProductCatalog.add(pen);

		CatalogComponent genericProducts = new ProductCatalog("Generic products");
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		System.out.println(genericProducts);

		System.out.println("------------------DECORATOR------------------");
		AbstractBackpack myBackpack = new BackPack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackpack = new WithLaptopDecorator(new WithFoodDecorator(myBackpack, "banana"));
		decoratedBackpack.pack();

	}

}
