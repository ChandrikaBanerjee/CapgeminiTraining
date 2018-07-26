/*Program to find the user input name is present in a given string of names*/
package day2names;

import java.util.Scanner;

public class names {
	public static void main(String args[]) {
		int i, c = 0;
		int flag = 0;

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[6];
		System.out.print("Enter the names:");
		for (i = 0; i < 5; i++) {
			arr[i] = sc.next();
		}
		// Names taken as input
		System.out.println("Enter the given name:"); // Name to be searched for
		String name = sc.next();

		for (i = 0; i < 5; i++) { // Logic to check whether the word is present or not

			if ((arr[i]).equals(name)) {

				flag = 1; // Set flag if present

				c++; // counts no.of occurence

				// break;
			}

		}
		if (flag == 1) {
			System.out.println("Present");
			System.out.println(c);
			// break;
		} else
			System.out.println("Absent");

	}

}
