import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


/** The Class funcSeven. */
public class funcSevenTest {

  /** Numeric input check test. */

  /**
   * Test Case : F7_TC_1test if X(0) to the power of
   * Y(0)=1.0
   */
  @Test
  public void zeroPowerofZero() {
    assertEquals(0.0,functionSeven.calculate(0,0), 0);
  }

  /**
   * Test Case : F7_TC_2 Test cases for Requirement Id : F7-R2 test if X(0) to the power of
   * Y(Real Number)=0.0
   */
  @Test
  public void zeroPowerofRealNumber() {
    assertEquals(0.0,functionSeven.calculate(0,6), 0);
  }

  /**
   * Test Case : F7_TC_3 Test cases for Requirement Id : F7-R3 test if X(Positive Number)
   * to the power of Y(0)=1.0
   */
  @Test
  public void positiveNumberPowerofZero() {
    assertEquals(1.0, functionSeven.calculate(37, 0), 0);
  }

  /**
   * Test Case : F7_TC_4 Test cases for Requirement Id : F7-R4 test if X(Negative Number)
   * to the power of Y (0)=1.0
   */
  @Test
  public void negativeNumberPowerofZero() {
    assertEquals(1.0, functionSeven.calculate(-9, 0), -1);
  }

  /**
   * Test Case : F7_TC_5 Test cases for Requirement Id : F7-R5 test if X(Positive Number)
   * to the power of Y(1)= x.
   */
  @Test
  public void positiveNumberPowerofOne() {
    assertEquals(7.000001907348633, functionSeven.calculate(7, 1), 0);
  }

  /**
   * Test Case : F7_TC_6 Test cases for Requirement Id : F7-R6 test if X(Positive Number)
   * to the power of Y(Positive Number)= Positive Number.
   */
  @Test
  public void positiveNumberPowerofPositiveNumber() {
    assertEquals(1249846.125, functionSeven.calculate(5, 9), 0);
  }

  /**
   * Test Case : F7_TC_7 Test cases for Requirement Id : F7-R7 test if X(Negative Number)
   * to the power of Y(Positive Even Number)= Positive Number.
   */
  @Test
  public void negativeNumberPowerofPositiveEvenNumber() {
    assertEquals(125.91680145263672, functionSeven.calculate(-3, 4.4), -1);
  }

  /**
   * Test Case : F7_TC_8 Test cases for Requirement Id : F7-R8 test if X(Negative Number)
   * to the power of Y(Positive Odd Number)= Negative Number.
   */
  @Test
  public void negativeNumberPowerofPositiveOddNumber() {
    assertEquals(-739.0339965820312, functionSeven.calculate(-9, 3), 0);
  }
}
