package ch.bbw.dn.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Division in Class Calculator
 * 
 * @author  Dominik Näf
 * @version 18.12.2018
 */

public class DivisionTest {

	Calculator testee;
	
	@Before
    public void setUp() {
		testee = new Calculator();
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
	
	//protected - Der Testfall muss sich im gleichen Paket wie die getestete Methode befinden.

	//private 	- Das Testen von privaten Methoden ist etwas komplizierter. Es gibt die Möglichkeit "dp4j" und eine "Reflection" zu verwenden.
	
}
