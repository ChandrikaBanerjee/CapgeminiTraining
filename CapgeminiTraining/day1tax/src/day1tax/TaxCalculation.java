/*Program for tax evaluation*/
package day1tax;

import java.util.Scanner;

public class TaxCalculation {
	public static void main(String args[]) {
		double tax = 1, ctc;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CTC:");
		ctc = sc.nextDouble();

		if (ctc > 0 && ctc <= 180000) // Condition1 of tax evaluation
			tax = 0;

		else if (ctc >= 180001 && ctc <= 300000) // Condition1 of tax evaluation
			tax = ctc * 0.1;

		else if (ctc >= 300001 && ctc <= 500000) // Condition1 of tax evaluation
			tax = ctc * 0.2;

		else if (ctc >= 500001 && ctc <= 1000000) // Condition1 of tax evaluation
			tax = ctc * 0.3;

		System.out.println("Tax = " + tax);

	}
}
