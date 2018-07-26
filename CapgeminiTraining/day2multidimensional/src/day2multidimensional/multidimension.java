/*Program to check whether a given user input element is present in a multidimensional array*/
package day2multidimensional;

import java.util.Scanner;

public class multidimension {
	public static void main(String args[]) {
		int i, j, flag = 0;
		int arr[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for (i = 0; i < 2; i++) {

			for (j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt(); // Taking inputs in a multidimensional array

			}
		}

		System.out.println("Enter the target element:");
		int target = sc.nextInt();
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) // loops are required one is outer loop and another is inner loop because we are
									// using a multidimensional array
			{
				if (arr[i][j] == target) // Checks for the presence of target element
				{
					flag = 1;
					// System.out.println("Found");
					// break;
				}

			}
		}
		if (flag == 1)

			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}
