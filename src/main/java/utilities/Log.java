package utilities;

import java.util.logging.Logger;

public class Log {

	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	
	public static void error(String message) {
		Log.error(message);
	}
	
}
