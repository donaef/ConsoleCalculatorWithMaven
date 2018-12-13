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
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSummeEinePositiveEineNegativIsOk() {
		assertTrue(testee.summe(10, (-5)) == 5);
	}
	
	@Test
	public void testSummeEinePositiveEineNullIsOk() {
		assertTrue(testee.summe(10, 0) == 10);
	}
	
	@Test
	public void testSummeEinePositiveEineMaxValueIsOk() {
		assertTrue(testee.summe(10, Integer.MAX_VALUE) == 10 + Integer.MAX_VALUE);
	}
	
	@Test
	public void testSummeEinePositiveEineMinValueIsOk() {
		assertTrue(testee.summe(10, Integer.MIN_VALUE) == 10 + Integer.MIN_VALUE);
	}

	@Test
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe((-5), (-5)) == (-10));
	}
	
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionDurchNullArithmeticException() {
		testee.division(10, 0);
	}
	
	@Test
	public void testDivisionDurchNullArithmeticExceptionNotRaised() throws IndexOutOfBoundsException {
		testee.division(10, 2);
	}
	
	//protected - Der Testfall muss sich im gleichen Paket wie die getestete Methode befinden.

	//private 	- Das Testen von privaten Methoden ist etwas komplizierter. Es gibt die Möglichkeit "dp4j" und eine "Reflection" zu verwenden.
	
	
}
