package calc;

import org.apache.log4j.Logger;

public class MainApplication {
	final static Logger logger = Logger.getLogger(MainApplication.class);
	public static void main(String args[]) {
		System.out.println("hello");
		logger.info("This is debug : " + 1);
		String input="add(1,add(2,4))";
		String input3="add(1,2)";
		String input1="add(1,mult(2,3))";
		String input2="mult(add(2,2),div(9,3))";
		String input4="let(a,5,add(a,a))";
		String input5 = "let(a, 5, let(b, mult(a, 10), add(b, a)))";
		String input6="let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b))";
		logger.info("Inside Main application");
		try {
			if(args[0].length() < 1) {
				logger.error("Please input command line arguments");
				System.exit(0);
			}
		ExpCalculator calculator = new ExpCalculator();
		long result = calculator.compute(args[0]);
		System.out.println("Result: "+ result);
		}
		catch(Exception e) {
			logger.error("Error occured: "+e.getMessage());
		}
		
	}

}
