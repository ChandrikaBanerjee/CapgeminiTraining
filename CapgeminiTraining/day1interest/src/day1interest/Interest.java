/*Program to find the simple as well as compound interest on a particular principal*/
package day1interest;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		int val, rate, time, si, c;
		double d, ci;
		// Taking variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal :\n");
		val = sc.nextInt();

		System.out.println("Enter the rate per year :\n");
		rate = sc.nextInt();

		System.out.println("Enter the time :\n");
		time = sc.nextInt();

		si = ((val * rate * time) / 100); // Calculating simple interest

		c = (1 + (rate / 100));
		d = Math.pow(c, time);
		ci = c * d; // Calculating amount for compounting compound interest

		System.out.println("The Simple Interest is: " + si);
		System.out.println("The Compound Interest is: " + (ci - val));

	}

}
