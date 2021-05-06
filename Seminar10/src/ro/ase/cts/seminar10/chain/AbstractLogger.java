package ro.ase.cts.seminar10.chain;

public abstract class AbstractLogger {
	protected Verbosity level;
	private AbstractLogger nextLogger;

	public AbstractLogger(Verbosity verbosityLevel) {
		this.level = verbosityLevel;
	}

	public void setnextLogger(AbstractLogger logger) {
		this.nextLogger = logger;
	}

	public void logMessage(Verbosity level, String message) {
		if (this.level.getVerbosity() <= level.getVerbosity()) {
			write(message);

		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}

	}

	abstract void write(String message);
}
