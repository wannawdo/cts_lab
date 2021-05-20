package cts.dragomirescu.oana.g1080.pattern.singleton;

public class Robot implements IRobotSoftware {
	private String nume;
	private int id;
	private int anFabricare;
	private float cost;
	private String firma;

	private static Robot instanta = null;

	private Robot(String nume, int id, int anFabricare, float cost, String firma) {
		super();
		this.nume = nume;
		this.id = id;
		this.anFabricare = anFabricare;
		this.cost = cost;
		this.firma = firma;
	}

	public static synchronized Robot creareInstanta(String nume, int id, int anFabricare, float cost, String firma) {
		if (instanta == null) {
			instanta = new Robot(nume, id, anFabricare, cost, firma);
		}
		return instanta;
	}

	public String getNume() {
		return nume;
	}

	public int getId() {
		return id;
	}

	public int getAnFabricare() {
		return anFabricare;
	}

	public float getCost() {
		return cost;
	}

	public String getFirma() {
		return firma;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [nume=");
		builder.append(nume);
		builder.append(", id=");
		builder.append(id);
		builder.append(", anFabricare=");
		builder.append(anFabricare);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", firma=");
		builder.append(firma);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void trimiteCerere(String denumire) {
		System.out.println("TRIMITERE CERERE");

	}

	@Override
	public String getInformatii(String categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prelucrareCerere(String tip) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getIdRobot() {
		return id;
	}

}
