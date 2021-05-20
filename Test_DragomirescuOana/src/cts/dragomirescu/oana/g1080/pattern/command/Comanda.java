package cts.dragomirescu.oana.g1080.pattern.command;

import cts.dragomirescu.oana.g1080.pattern.state.Cerere;

public abstract class Comanda {
	private Cerere cerere;

	private Comanda(Cerere cerere) {
		this.cerere = cerere;
	}

	public Cerere getCerere() {
		return cerere;
	}

	public void setCerere(Cerere cerere) {
		this.cerere = cerere;
	}
	
	
}
