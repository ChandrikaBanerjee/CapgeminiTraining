/*Program to remove the duplicate characters from a word*/
package day2duplicate;

import java.util.Scanner;

public class duplicate {
	public static void main(String args[]) {
		int i, j;
		String str = ""; // Initializing
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String word = sc.next();

		int n = word.length();

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == j) // First condition needs the two index to be same ,if it is true then goes for
							// further execution
				{

					str += word.charAt(i);
					// break;
				}
				if ((word.charAt(i)) == (word.charAt(j))) // second condition says if and only if the index are not same
															// but still it shows same character then it will eliminate
															// such duplicate characters
				{
					break;
				}

			}
		}
		System.out.println(str);
	}
}
