package ro.ase.cts.seminar4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {

	private static Map<String, Cart> instance = null;
	private String type;
	public ArrayList<String> products;

	private Cart() {

		products = new ArrayList<String>();
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

	public ArrayList<String> getProducts() {
		return products;
	}
}
