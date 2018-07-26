/*Program to check palindrome in a series of inputs and on the basis of no. of characters in it sorting is performed in descending order*/
package day1palindromeinarange;

import java.util.Scanner;

public class PalindromeInARange {
	static int i, c = 0, j, temp;

	public static void main(String args[]) {
		String reverse = ""; // Initializing
		String tp = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter words:\n");
		String[] words = new String[4];
		for (int i = 0; i < 4; i++) {
			words[i] = sc.next(); // Taking input of words
		}
		String[] palin = new String[4];
		int palsize[] = new int[4]; // Taking the size of the characters in this array

		for (i = 0; i < 4; i++) {
			reverse = "";
			String copy = words[i]; // storing for future use
			int n = words[i].length();
			for (int k = n - 1; k >= 0; k--) {
				reverse = reverse + (words[i].charAt(k)); // Logic for reversing the word
			}
			System.out.println(reverse);

			if (copy.equals(reverse)) {
				System.out.println(copy + "is Palindrome"); // Checking palindrome or not

				palin[c] = copy;
				palsize[c] = palin[c].length(); // assigning the size of the characters in a new array for sorting
												// purpose
				c++;
			}
		}

		for (i = 0; i < c - 1; i++) {
			for (j = 0; j < c - 1 - i; j++) {
				if (palsize[j] < palsize[j + 1]) { // logic for sorting the size array and consequently the word array
					temp = palsize[j]; // Swap the values
					palsize[j] = palsize[j + 1];
					palsize[j + 1] = temp;

					tp = palin[j];
					palin[j] = palin[j + 1];
					palin[j + 1] = tp; // Hence sorts the word array in descending order

				}
			}

		}

		for (i = 0; i < c; i++)
			System.out.println(palin[i]);
	}
}
