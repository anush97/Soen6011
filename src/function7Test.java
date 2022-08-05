import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class function7Test {

	 /**
	 * TC 1 Testing the log function Latest implementation of assertEquals.
	 * double values Delta precision is added for test
	 */
	  @Test
	public void testLog() {
	    assertEquals(functionSeven.logN(2), 0.6931471805599453, 1e-15);
	  }

	  /**
	 * TC 2 Testing the log function Associated Functional Requirement: FUNR1.
	 * implementation of assertEqulas for double values Delta precision is added for
	 * test
	 */
	  @Test
	public void testdecimalExp() {
	    assertEquals(functionSeven.decimalExp(2 * functionSeven.logN(2), 2, 2), 4.0, 1e-15);
	  }

	  /**
	 * TC 3 Testing Divide and Conquer Algorithm functionSeven Law Product.
	 */
	  
	  @Test
	public void testfunctionSevenLawProduct() {
	    double output1 = functionSeven.decimalExp(2 * functionSeven.logN(2), 2, 2);
	    double output2 = functionSeven.decimalExp(2 * functionSeven.logN(2), 2, 2);
	    double finalOutput = functionSeven.decimalExp(4 * functionSeven.logN(2), 2, 4);
	    assertEquals(output1 * output2, finalOutput, 0.1);
	  }

	  /**
	 * TC 4 Testing Divide and Conquer Algorithm functionSeven Law Division.
	 */
	  @Test
	public void testfunctionSevenLawDivision() {
	    double output1 = functionSeven.decimalExp(2 * functionSeven.logN(2), 2, 2);
	    double output2 = functionSeven.decimalExp(2 * functionSeven.logN(2), 2, 2);
	    double finalOutput = functionSeven.decimalExp(0 * functionSeven.logN(2), 2, 0);
	    assertEquals(output1 / output2, finalOutput, 1e-15);
	  }

	  /**
	 * TC 5 Testing Factorial function.
	 */
	  @Test
	public void testFactorial() {
	    int factThree = 6;
	    int fact = 3;
	    assertEquals(functionSeven.factorial(fact), factThree);
	  }

	  /**
	 * TC 6 Associated Functional Requirement: FUNR2 Testing Factorial function.
	 */

	  @Test
	public void testNumberfunctionSevenZero() {
	    double result = 0.0;
	    assertEquals(functionSeven.basicPower(10, 0), result, 1);
	  }

	  /**
	 * TC 7 Associated Functional Requirement: FUNR3 Testing Factorial function.
	 */
	  @Test
	public void testZerofunctionSevenN() {
	    double result = 0.0;
	    assertEquals(functionSeven.basicPower(0.0, 10), result, 0.0);
	  }

	  /**
	 * TC 7 Associated Functional Requirement: FUNR4 Testing Factorial function.
	 */
	  @Test
	public void testNonNumberValues() {
	    double result = 0.0;
	    String test = "102";
	    double input = Double.parseDouble(test);
	    assertNotEquals(functionSeven.basicPower(input, 10), result, 1);
	  }

	}
