package strategy2;

public class Client {
	private String nume;
	private ModPlata mod;
	public Client(String nume) {
		super();
		this.nume = nume;
	}
	public void setMod(ModPlata mod) {
		this.mod = mod;
	}
	
	public void achitaNota(float suma) {
		System.out.println("Clientul " + nume+ " are de platit "+suma+" lei.");
		mod.achitare(suma);
	}
}
