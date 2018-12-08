package calc;

import org.apache.log4j.Logger;

public class ExpCalculator {
	final static Logger logger = Logger.getLogger(ExpCalculator.class);
	String[] inputTokens;
	int index = 0;
	long variables[] = new long[26];;

	public long compute(String input) {
		input = input.replaceAll("\\s", "");
		inputTokens = input.split("[\\W]+");
		long result = handleToken(inputTokens[0]);
		System.out.println("result: " + result);
		return result;
	}

	public long handleToken(String token) {
		logger.info("Inside handletoken for token: "+token);
		long val = 0;
		if (token.equals("add")) {
			val = add();
		}
		if (token.equals("sub")) {
			val = sub();
		}
		else if (token.equals("div")) {
			val = divide();
		} else if (token.equals("mult")) {
			val = multiply();
		} else if (token.equals("let")) {
			val = let();
		} else {
			char ch = inputTokens[index].charAt(0);
			// Assume: variable name one char long
			if (inputTokens[index] != null && inputTokens[index].length() == 1 && ch >= 'a' && ch <= 'z') {
				val = variables[ch - 'a'];
			} else {
				val = Long.parseLong(inputTokens[index]);
			}
		}
		return val;
	}

	public long add() {
		logger.info("Inside add");
		index++;
		long val1 = handleToken(inputTokens[index]);
		index++;
		long val2 = handleToken(inputTokens[index]);
		long result = val1 + val2;
		return result;
	}

	public long sub() {
		logger.info("Inside subs");
		index++;
		long val1 = handleToken(inputTokens[index]);
		index++;
		long val2 = handleToken(inputTokens[index]);
		long result = val1 - val2;
		return result;
	}

	public long divide() {
		logger.info("Inside divide");
		index++;
		long val1 = handleToken(inputTokens[index]);
		index++;
		long val2 = handleToken(inputTokens[index]);
		long result = val1 / val2;
		return result;
	}

	public long multiply() {
		logger.info("Inside multiply");
		index++;
		long val1 = handleToken(inputTokens[index]);
		index++;
		long val2 = handleToken(inputTokens[index]);
		long result = val1 * val2;
		return result;
	}

	public long let() {
		logger.info("Inside let ");
		index++;
		char val1 = inputTokens[index].charAt(0);
		System.out.println("val1: " + val1);
		index++;
		variables[val1 - 'a'] = handleToken(inputTokens[index]);
		index++;
		long result = handleToken(inputTokens[index]);
		return result;
	}

}
