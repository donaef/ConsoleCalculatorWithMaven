package ch.bbw.dn.consolecalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Multiplication in Class Calculator
 * 
 * @author  Dominik Näf
 * @version 18.12.2018
 */

public class MultiplicationTest {

	Calculator testee;
	
	@Before
    public void setUp() {
		testee = new Calculator();
    }
	
	
	
	@Test
	public void testMultiplicationBeidePositivIsOk() {
		assertTrue(testee.multiplication(10, 2) == 20);
	}
	
	@Test
	public void testMultiplicationEinePositivEineNegativIsOk() {
		assertTrue(testee.multiplication(10, (-2)) == (-20));
	}
	
	@Test
	public void testMultiplicationBeideNegativIsOk() {
		assertTrue(testee.multiplication((-2), (-2)) == 4);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testMultiplicationBeideMaxValueArithmeticException() {
		testee.multiplication(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testMultiplicationBeideMinValueArithmeticException() {
		testee.multiplication(Integer.MIN_VALUE, Integer.MIN_VALUE);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testMultiplicationEineMinValueEinePositivArithmeticException() {
		testee.multiplication(Integer.MIN_VALUE, 2);
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testMultiplicationEineMinValueEineNegativArithmeticException() {
		testee.multiplication(Integer.MIN_VALUE, (-2));
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionMalNullArithmeticException() {
		testee.division(10, 0);
	}
	
	//protected - Der Testfall muss sich im gleichen Paket wie die getestete Methode befinden.

	//private 	- Das Testen von privaten Methoden ist etwas komplizierter. Es gibt die Möglichkeit "dp4j" und eine "Reflection" zu verwenden.

}
