package day1marks;

import java.util.Scanner;

class Marks {
	static int c;
	/*
	 * Program which evaluates the status of a student by observing marks he obtaine
	 * in all subjects
	 */
	public static int arr[];

	public static void main(String a[]) {
		int i;
		arr = new int[10]; // Taking array to store the marks in 3 subjects

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:\n");
		for (i = 0; i < 3; i++) {
			arr[i] = sc.nextInt(); // With the help of for loop we are inserting the subjectwise marks
		}

		for (i = 0; i < 3; i++) {
			if (arr[i] > 60) // Condition for checking the status of pass
			{
				c++;
			}
		}

		if (c == 3)
			System.out.println("The status is PASSED");

		if (c == 2)
			System.out.println("The status is PROMOTED");

		if ((c == 1) || (c == 0))
			System.out.println("The status is FAILED");
	}
}
