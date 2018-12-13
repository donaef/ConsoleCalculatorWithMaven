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
		valueB =  2;
		System.out.println("Summe	 	" + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
		System.out.println("Subtraktion	" + valueA + " - " + valueB + " = " + calculator.subtraktion(valueA, valueB));
		System.out.println("Division 	" + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
		
    }
}
