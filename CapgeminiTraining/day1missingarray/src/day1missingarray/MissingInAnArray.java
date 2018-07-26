/*Program to find the missing element in array of n distinct elements*/package day1missingarray;

import java.util.Scanner;

public class MissingInAnArray {
	public static void main(String args[]) {
		int i, j, n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		n = sc.nextInt();

		int arr[] = new int[n]; // Taking the inputs in an array of 1 to n elements
		for (i = 0; i < n; i++) {
			arr[i] = i;
		}
		int userarray[] = new int[n]; // This is an input array which is used to search the missing element,this array
										// length is same as that of previous array
		for (j = 0; j < n - 1; j++) {
			userarray[j] = sc.nextInt();
		}
		int l = userarray.length; // User input array needs to be sorted for further comparison
		for (int a = 0; a < l - 1; a++) {
			for (int b = 0; b < l - a - 1; b++) {
				if (userarray[b] > userarray[b + 1]) { // Bubblesort logic
					int temp = userarray[b];
					userarray[b] = userarray[b + 1];
					userarray[b + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			if (arr[i] != userarray[i]) { // Check for the missing element
				System.out.println(arr[i]);
			}
		}
	}
}
