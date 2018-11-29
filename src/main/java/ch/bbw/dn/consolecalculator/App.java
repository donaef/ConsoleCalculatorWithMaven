package ch.bbw.dn.consolecalculator;

/**
 * Console Calculator App
 * @author Dominik Näf
 * @version 0.0.1
 *
 */

public class App {
    
	public static void main( String[] args ){
		
		Calculator calculator = new Calculator();
		int valueA = 0;
		int valueB = 0;
		
		System.out.println("Colsole Calculator");
		System.out.println("==================");
		System.out.println();
		
		valueA = 10;
		valueA = 20;
		System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(10, 20));
		
    }
}
