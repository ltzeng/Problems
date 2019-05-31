package maps;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class LogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Log logger = LogFactory.getLog(LogTest.class);
		
		logger.info("test");
		
		Looping loop = null;
		
		try {
			loop.getClass();
		}catch(Exception e) {
			logger.info(e.getMessage());
			logger.warn(e.getMessage());
			logger.error(e.getMessage());
		}
	}

}
