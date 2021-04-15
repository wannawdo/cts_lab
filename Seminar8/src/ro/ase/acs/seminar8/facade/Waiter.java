package ro.ase.acs.seminar8.facade;

public class Waiter {
	String name;

	public Waiter(String name) {
		super();
		this.name = name;
	}

	public void takeOrder() {
		System.out.println("Order taken");
	}

	public void sendOrderToKitechen() {
		System.out.println("Order placed");
	}

	public void serveCustomer() {
		System.out.println("Order served");
	}

}
