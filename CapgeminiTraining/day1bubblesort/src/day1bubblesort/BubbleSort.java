package day1bubblesort;

/*Program performing Bubblesort*/
import java.util.Scanner;

public class BubbleSort {

	public static void main(String a[]) {
		int num;
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:\n");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();  //Taking the inputs using for loop

		}
		int n = arr.length;
		for (int m = 0; m < n - 1; m++) {   
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {    //Logic of Bubblesort
					int temp = arr[j];   //Swaps the values
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("\n" + arr[i]);
		}
	}
}
