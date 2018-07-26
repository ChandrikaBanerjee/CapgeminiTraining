/*Program to check whether a number is armstrong or not*/
package day1armstrong;

import java.util.Scanner;

public class Armstrong {
	public static void main(String a[]) {
		int n, r, sum = 0;
		System.out.println("Enter the number:\n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int num = n;
		while (num != 0) // Terminal condition
		{
			r = num % 10;
			sum = sum + (r * r * r); // Logic of checking armstrong
			num = num / 10;
		}

		if (sum == n)
			System.out.println("Armstrong");

		else
			System.out.println("Not Armstrong");
	}
}
