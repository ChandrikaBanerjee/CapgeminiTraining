/*Program to find whether a number is palindrome or not*/
package day1checkpalindrome;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String args[]) {
		String reverse = ""; // Initializing
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer:\n");
		String num = sc.next();

		int n;
		n = num.length();
		for (int i = n - 1; i >= 0; i--) { // Logic to find the reverse
			reverse = reverse + (num.charAt(i));
		}
		if (num.equals(reverse)) // Checking the reverse if equals to the word

		{
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}
}
