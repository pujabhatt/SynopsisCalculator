package calc;

import org.apache.log4j.Logger;

public class MainApplication {
	//logger for writing logs
	final static Logger logger = Logger.getLogger(MainApplication.class);
	
	public static void main(String args[]) {
		//logger.info("Inside Main application");
		String input =" ";
		try {
			if( args.length == 0) {
				logger.error("Please input command line arguments");
				System.exit(0);
			}
			else if(args[0].length() < 1) {
				logger.error("Please input command line arguments");
				input = args[0];
			}
			ExpressionCalculator calculator = new ExpressionCalculator();
	    	 input = "add(1,mult(2,3))";
		    long result = calculator.compute(input);
		    System.out.println("output: "+result);
		    logger.info("output: "+result);
		
		}
		catch(Exception e) {
			//logger.error("Error occured: "+ e.getMessage());
		}
		
	}

}
