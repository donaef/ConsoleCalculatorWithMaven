package ch.bbw.dn.consolecalculator;

/**
 * Calculator
 * - kann zwei Zahlen addieren
 * - kann zwei Zahlen subtrahieren
 * - kann zwei Zahlen dividieren
 * - kann zwei Zahlen multiplizieren
 * 
 * @author Dominik Näf
 * @version 18.12.2018
 */

public class Calculator {
	
	public int addition(int value1, int value2) throws java.lang.ArithmeticException {
		
		
		long summe = (long) value1 + (long) value2;
		if (summe > Integer.MAX_VALUE) {
			throw new ArithmeticException("Summe is bigger than Integer.MAX_VALUE");
		}else if (summe < Integer.MIN_VALUE) {
			throw new ArithmeticException("Summe is smaller than Integer.MIN_VALUE");
		} else {
			return value1 + value2;
		}
		
	}
	
	public int subtraktion(int value1, int value2) {
		
		long differenz = (long) value1 - (long) value2;
		if (differenz > Integer.MAX_VALUE) {
			throw new ArithmeticException("Differenz is bigger than Integer.MAX_VALUE");
		}else if (differenz < Integer.MIN_VALUE) {
			throw new ArithmeticException("Differenz is smaller than Integer.MIN_VALUE");
		} else {
			return value1 - value2;
		}
		
	}
	
	public int division(int value1, int value2) {
		
		long result = (long) value1 / (long) value2;
		if (result > Integer.MAX_VALUE) {
			throw new ArithmeticException("Result is bigger than Integer.MAX_VALUE");
		}else if (result < Integer.MIN_VALUE) {
			throw new ArithmeticException("Result is smaller than Integer.MIN_VALUE");
		} else {
			return value1 / value2;
		}
		
	}
	
	public int multiplication(int value1, int value2) {
		
		long result = (long) value1 * (long) value2;
		if (result > Integer.MAX_VALUE) {
			throw new ArithmeticException("Result is bigger than Integer.MAX_VALUE");
		}else if (result < Integer.MIN_VALUE) {
			throw new ArithmeticException("Result is smaller than Integer.MIN_VALUE");
		} else {
			return value1 * value2;
		}
		
	}
	
}
