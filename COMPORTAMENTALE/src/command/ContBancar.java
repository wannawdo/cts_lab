package command;

public class ContBancar {
	private float sold;
	private String detinator;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}

	public void constituire(float suma) {
		sold = suma;
		System.out.println("A fost creat contul. Sold: "+sold);
	}

	public void retragere(float suma) {
		sold = sold - suma;
		System.out.println("A fost retsrasa suma de " + suma+ "; sold:"+sold);
	}

	public void depunere(float suma) {
		sold = sold + suma;
		System.out.println("A fost depusa suma de " + suma+ "; sold:"+sold);
	}
}
