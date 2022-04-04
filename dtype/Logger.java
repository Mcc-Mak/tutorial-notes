package dtype;

public class Logger {

	public void debug(String message) {
		System.out.println("[Debug] " + message);
	}

	public void info(String message) {
		System.out.println(" [Info] " + message);
	}

	public void warn(String message) {
		System.out.println(" [Warn] " + message);
	}

	public void error(String message) {
		System.out.println("[Error] " + message);
	}

}
