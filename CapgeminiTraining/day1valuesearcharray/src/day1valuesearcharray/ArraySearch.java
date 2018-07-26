/*Program to check whether a aprticular value is present in an array of elements*/
package day1valuesearcharray;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String args[]) {
		int num, i;
		int arr[] = new int[16];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the target Number:\n");
		num = sc.nextInt();

		System.out.println("Enter the values: \n");
		for (i = 0; i < 15; i++) { // Inserting the elements in an array using for loop
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < 15; i++) { // It checks whether an user input value is present in the array or not
			if (arr[i] == num) {
				System.out.println("Found");
				break;
			} else {
				System.out.println("\nNot Found");
				break;
			}
		}

	}
}
