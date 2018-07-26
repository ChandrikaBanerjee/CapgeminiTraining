/*Program to print the armstrong numbers in a range*/
package day1armstrongrange;

import java.util.Scanner;

public class ArmstrongRange {
	public static void main(String a[]) {
		int num, r, sum = 0;

		for (int c = 100; c < 1000; c++) {
			num = c;
			while (num != 0) { // Terminal condition
				r = num % 10;
				sum = sum + (r * r * r);
				num = num / 10;

			}
			if (sum == c) // If the number is equal to the calculated sum then prints armstrong

				System.out.println(c);

			sum = 0;
		}
	}
}
