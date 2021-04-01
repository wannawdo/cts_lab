package ro.ase.acs.seminar6.builder;

public abstract class AbstractProductFactory {
	public abstract Product makeProduct(int id) throws UnsupportedOperationException;
	public abstract String getCatalog();
}
