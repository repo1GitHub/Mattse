import org.apache.log4j.Logger;

public class TestLog {

	static final Logger log = Logger.getLogger(TestLog.class); 
	public static void main(String[] args) {
		log.info("iniciando aplicacion");
		
		for (int i = 10; i >=0; i--) {
			try {
				double n = 100 / i*1.0;
				log.debug("el valor de n="+n);
			} catch (Exception e) {
				log.error(e);
			}
		}
	}

}
