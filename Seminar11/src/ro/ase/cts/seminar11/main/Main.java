package ro.ase.cts.seminar11.main;

import ro.ase.cts.seminar11.state.Gate;

public class Main {

	public static void main(String[] args) {
	Gate securedGate=new Gate();
	securedGate.enter();
	securedGate.authorize();
	securedGate.enter();
	securedGate.enter();

	}

}
