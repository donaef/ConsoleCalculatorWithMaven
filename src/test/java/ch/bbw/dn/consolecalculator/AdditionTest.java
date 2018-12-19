package ch.bbw.dn.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Addition in Class Calculator
 * 
 * @author  Dominik Näf
 * @version 18.12.2018
 */

public class AdditionTest {

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
	public void testSummeEinePositiveEineMaxValueArithmeticException() {
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
	public void testSummeMaxValueArithmeticException() {
		testee.addition(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	//protected - Der Testfall muss sich im gleichen Paket wie die getestete Methode befinden.

	//private 	- Das Testen von privaten Methoden ist etwas komplizierter. Es gibt die Möglichkeit "dp4j" und eine "Reflection" zu verwenden.
	
}
