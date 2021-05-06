package ro.ase.cts.seminar10.chain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(Verbosity verbosityLevel) {
		super(verbosityLevel);
	}

	@Override
	void write(String message) {
		System.out.println(ErrorLogger.class.getName() + ": " + message);

	}

}
