package calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import calc.ExpressionCalculator;

public class TestCalculator {
	ExpressionCalculator calc = new ExpressionCalculator();
	
	// test to check appraisal
	@Test
	public void testExpression() {
		long result = 0;
		/*String input1 = "add(1,add(2,4))";
		result = calc.compute(input1);
		assertTrue(result == 7);
		
		String input2 = "add(1,2)";
		long result1 = calc.compute(input2);
		assertTrue(result1 == 3);*/
		
		String input3 = "add(1,mult(2,3))";
		result = calc.compute(input3);
		assertTrue(result == 7);
		
		/*String input4 = "mult(add(2,2),div(9,3))";
		result = calc.compute(input4);
		assertTrue(result == 12);
		
		String input5 = "let(a,5,add(a,a))";
		result = calc.compute(input5);
		assertTrue(result == 10);
		
		String input6 = "let(a, 5, let(b, mult(a, 10), add(b, a)))";
		result = calc.compute(input6);
		assertTrue(result == 55);
		
		String input7 = "let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b))";
		result = calc.compute(input7);
		assertTrue(result == 40);*/
		
	}

}
