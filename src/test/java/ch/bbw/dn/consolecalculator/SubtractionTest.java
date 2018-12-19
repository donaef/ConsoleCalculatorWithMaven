package ch.bbw.dn.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Subtraction in Class Calculator
 * 
 * @author  Dominik Näf
 * @version 18.12.2018
 */

public class SubtractionTest {

	Calculator testee;
	
	@Before
    public void setUp() {
		testee = new Calculator();
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
	public void testSubtractionEinePositiveEineMinValueArithmeticException() {
		testee.subtraktion(7, Integer.MIN_VALUE);
	}
	
	@Test
	public void testSubtractionZweiPositiveResultIsZeroIsOk() {
		assertTrue(testee.subtraktion(10, 10) == 0);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testSubtractionEineMinValueEineMaxValueArithmeticException() {
		testee.subtraktion(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	@Test
	public void testSubtractionBeideNullResultIsZeroIsOk() {
		assertTrue(testee.subtraktion(0, 0) == 0);
	}
	
	//protected - Der Testfall muss sich im gleichen Paket wie die getestete Methode befinden.

	//private 	- Das Testen von privaten Methoden ist etwas komplizierter. Es gibt die Möglichkeit "dp4j" und eine "Reflection" zu verwenden.
	
}
