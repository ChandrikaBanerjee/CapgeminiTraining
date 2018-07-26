/*Program to reverse the words in a sentence keeping the order same and preserving the whitespaces*/
package day1sentencereverse;

import java.util.Scanner;

public class SentenceReverse {
	public static void main(String args[]) {
		String reverse = ""; // Initializing

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence:\n");
		String num = sc.nextLine();

		num = num + " "; // Since after last word there was no space,so to preserve the space after
							// reversal this step is required.
		char ch;

		int n;
		n = num.length();
		for (int i = 0; i < n; i++) {

			ch = num.charAt(i); // extracting characters
			if (ch == ' ') {

				System.out.print(reverse + " "); // if space is encountered the print the reverse
				reverse = "";
			} else {
				reverse = ch + reverse; // Logic for reversal
			}
		}

	}
}
