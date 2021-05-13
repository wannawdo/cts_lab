package composite;

public interface Sectiune {
	void adaugaNod(Sectiune sectiune);
	void stergereNod(Sectiune sectiune);
	Sectiune iaNod(int index);
	void descriere();
}
