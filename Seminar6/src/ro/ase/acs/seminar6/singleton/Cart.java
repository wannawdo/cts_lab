package ro.ase.acs.seminar6.singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ro.ase.acs.seminar6.builder.Product;

public class Cart {

	private static Map<String, Cart> instance = null;
	private String type;
	public ArrayList<Product> products;

	private Cart() {

		products = new ArrayList<Product>();
	}

	public static synchronized Cart getInstance(String type) {
		if (instance == null) {
			instance = new HashMap<>();
		}
		if (!instance.containsKey(type)) {
			Cart myCart = new Cart();
			myCart.type = type;
			instance.put(type, myCart);
		}
		return instance.get(type);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
}
