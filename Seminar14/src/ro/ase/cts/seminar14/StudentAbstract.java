package ro.ase.cts.seminar14;

public abstract class StudentAbstract {
	String nume;
	int varsta;
	int note[];

	public abstract float calculMedie() throws StudentExceptionWrongValue;
}
