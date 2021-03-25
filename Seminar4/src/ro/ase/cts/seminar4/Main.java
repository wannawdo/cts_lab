package ro.ase.cts.seminar4;

import ro.ase.cts.seminar4.EagerShoppingCartExample;

public class Main {

	public static void main(String[] args) {
		//singleton
		Cart shoppingCart = Cart.getInstance("shoppingCart");
		Cart wishList=Cart.getInstance("wishlist");
		Cart wishList2=Cart.getInstance("wishlist");
		shoppingCart.getProducts();
		wishList.getProducts();
		if (wishList == shoppingCart) {
			System.out.println("obiectele sunt identice");
		}
		if (wishList == wishList2) {
			System.out.println("obiectele sunt identice");
		}
		
	
		
		
		//singleton in alta maniera
		EagerShoppingCartExample example = EagerShoppingCartExample.INSTANCE;
		EagerShoppingCartExample example2 = EagerShoppingCartExample.INSTANCE;

		if (example == example2) {
			System.out.println("obiectele sunt identice");
		}
		SingletonEnum mySingletonEnum = SingletonEnum.INSTANCE;
		mySingletonEnum.getProducts();
	}

}
