package ws.abhis.rudlogger.test;

import ws.abhis.rudlogger.logger.Logger;

public class TestLogger {
	public static void main (String[] args) {
		Logger objLogger = new Logger("logtest");
		String result1 = objLogger.log("Test log message 1");
		String result2 = objLogger.log("Test log message 2");
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
