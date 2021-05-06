package ro.ase.cts.seminar10.chain;

public class LoggerChainFactory {
	public static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger=new ErrorLogger(Verbosity.ERROR);
		AbstractLogger fileLogger=new FileLogger(Verbosity.DEBUGG);
		AbstractLogger consoleLogger=new ErrorLogger(Verbosity.INFO);
		
		errorLogger.setnextLogger(fileLogger);
		fileLogger.setnextLogger(consoleLogger);
		return errorLogger;
	}
}
