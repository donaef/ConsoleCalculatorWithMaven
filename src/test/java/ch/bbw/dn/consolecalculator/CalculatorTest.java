package ch.bbw.dn.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author  Dominik Näf
 * @version 0.0.1
 */

public class CalculatorTest {

	Calculator testee;
	
	@Before
    public void setUp() {
		testee = new Calculator();
    }
	
	
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.addition(10, 25) == 35);
	}
	
	@Test
	public void testSummeEinePositiveEineNegativIsOk() {
		assertTrue(testee.addition(10, (-5)) == 5);
	}
	
	@Test
	public void testSummeEinePositiveEineNullIsOk() {
		assertTrue(testee.addition(10, 0) == 10);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testSummeEinePositiveEineMaxValueIsOk() {
		testee.addition(10, Integer.MAX_VALUE);
	}
	
	@Test
	public void testSummeEinePositiveEineMinValueIsOk() {
		assertTrue(testee.addition(10, Integer.MIN_VALUE) == 10 + Integer.MIN_VALUE);
	}

	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.addition((-5), (-5)) == (-10));
	}
	
	@Test
	public void testSummeEinePositiveEineNegativeResultIsZeroIsOk() {
		assertTrue(testee.addition(5, (-5)) == 0);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testSummeMaxValueIsOk() {
		testee.addition(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	
	
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubtractionEineNegativeEinePositiveIsOk() {
		assertTrue(testee.subtraktion((-5), 10) == (-15));
	}
	
	@Test
	public void testSubtractionZweiNegativeArithmeticExceptionNotRaised() throws IndexOutOfBoundsException  {
		testee.subtraktion((-5), (-5));
	}
	
	@Test
	public void testSubtractionEineMaxValueEinePositiveIsOk() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 10) == Integer.MAX_VALUE - 10);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testSubtractionEinePositiveEineMinValueIsOk() {
		testee.subtraktion(7, Integer.MIN_VALUE);
	}
	
	@Test
	public void testSubtractionZweiPositiveResultIsZeroIsOk() {
		assertTrue(testee.subtraktion(10, 10) == 0);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testSubtractionEineMinValueEineMaxValueIsOk() {
		testee.subtraktion(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	@Test
	public void testSubtractionBeideNullResultIsZeroIsOk() {
		assertTrue(testee.subtraktion(0, 0) == 0);
	}
	
	
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionDurchNullArithmeticException() {
		testee.division(10, 0);
	}
	
	@Test
	public void testDivisionDurchNullArithmeticExceptionNotRaised() throws IndexOutOfBoundsException {
		testee.division(10, 2);
	}
	
	@Test
	public void testDivisionBeidePositivIsOk() {
		assertTrue(testee.division(10, 5) == 2);
	}
	
	@Test
	public void testDivisionEinePositivEineNegativIsOk() {
		assertTrue(testee.division(10, (-2)) == (-5));
	}
	
	@Test
	public void testDivisionEineMaxValueEinePositivIsOk() {
		assertTrue(testee.division(Integer.MAX_VALUE, 2) == Integer.MAX_VALUE / 2);
	}
	
	@Test
	public void testDivisionEineMinValueEinePositivIsOk() {
		assertTrue(testee.division(Integer.MIN_VALUE, 2) == Integer.MIN_VALUE / 2);
	}
	
	@Test
	public void testDivisionBeideMaxValueIsOk() {
		assertTrue(testee.division(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE / Integer.MAX_VALUE);
	}
	
	@Test
	public void testDivisionBeideMaxVeIsOk() {
		assertTrue(testee.division((Integer.MAX_VALUE+1), 2) == (Integer.MAX_VALUE+1) / 2);
	}
	
	
	
	@Test
	public void testMultiplicationBeidePositivIsOk() {
		assertTrue(testee.division(10, 2) == 20);
	}
	
	
	
	//protected - Der Testfall muss sich im gleichen Paket wie die getestete Methode befinden.

	//private 	- Das Testen von privaten Methoden ist etwas komplizierter. Es gibt die Möglichkeit "dp4j" und eine "Reflection" zu verwenden.
	
	
	
}

