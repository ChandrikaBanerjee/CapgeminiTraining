/*Program to find the square of a number*/
package day1square;

import java.util.Scanner;

public class Square {

	public static void main(String a[]) {
		int num, res;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:\n");
		num = sc.nextInt();

		res = result(num); // Function calling

		System.out.println("Square: " + res);
	}

	public static int result(int n) {

		int res = n * n; // Logic of squaring a number
		return res;
	}
}
