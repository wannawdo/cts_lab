package cts.dragomirescu.oana.g1080.pattern.state;

public class Cerere implements ICerereStudent {
	private int id;
	private String denumire;
	private String categorie;
	private String tip;
	private int zileDeLaEmitere;
	private boolean motive;

	private Stare stare;

	public Cerere(int id, String denumire, String categorie, String tip, int zi, boolean motive) {
		super();
		this.id = id;
		this.denumire = denumire;
		this.categorie = categorie;
		this.tip = tip;
		this.motive = motive;
		this.zileDeLaEmitere = zi;
		if (zi > 10) {
			this.stare = new StareRespinsa();
			stare.schimbaStarea();
		} else {
			this.stare = new StareTrimisa();
			stare.schimbaStarea();
		}
	}

	@Override
	public void confirmare() {
		if (stare instanceof StareTrimisa) {
			System.out.println("Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip + " emisa acum "
					+ zileDeLaEmitere + " zile face parte din categoria " + categorie);
			stare = new StareConfirmata();
			stare.schimbaStarea();
		} else {
			System.out.println(
					"ATENTIE! Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip + " emisa acum "
							+ zileDeLaEmitere + " zile face parte din categoria " + categorie + " nu a putut fi emisa");
		}

	}

	@Override
	public void verificare() {
		if (stare instanceof StareConfirmata) {
			if (motive == true) {
				System.out.println("Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip + " emisa acum "
						+ zileDeLaEmitere + " zile face parte din categoria " + categorie);

				if (motive == true) {
					stare = new StareRespinsa();
					stare.schimbaStarea();
				} else {
					stare = new StareVerificata();
					stare.schimbaStarea();
				}
			}
		} else {
			System.out.println("ATENTIE! Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip
					+ " emisa acum " + zileDeLaEmitere + " zile face parte din categoria " + categorie
					+ " nu a putut fi verificata");
		}

	}

	@Override
	public void avizareDecanat() {
		if (stare instanceof StareVerificata) {
			System.out.println("Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip + " emisa acum "
					+ zileDeLaEmitere + " zile face parte din categoria " + categorie);
			stare = new StareAvizata();
			stare.schimbaStarea();
		} else {
			System.out.println("ATENTIE! Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip
					+ " emisa acum " + zileDeLaEmitere + " zile face parte din categoria " + categorie
					+ " nu a putut fi avizata de catre decan.");
		}

	}

	@Override
	public void respingere() {
		stare = new StareRespinsa();
		stare.schimbaStarea();
		System.out.println("ATENTIE! Cererea " + id + ", cu denumirea " + denumire + " de tipul " + tip + " emisa acum "
				+ zileDeLaEmitere + " zile face parte din categoria " + categorie + "  este RESPINSA!");

	}

}
