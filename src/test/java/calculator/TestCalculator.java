package calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import calc.ExpCalculator;

public class TestCalculator {
	ExpCalculator calc = new ExpCalculator();
	
	// test to check appraisal
	@Test
	public void testExpression() {
		String input = "add(1,add(2,4))";
		long result = calc.compute(input);
		assertTrue(result == 7);
	}

}
