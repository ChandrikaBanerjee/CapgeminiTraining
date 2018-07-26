package day1totalaverage;

import java.util.Scanner;

/*Program to find the total marks and average marks subjectwise and of all subjects*/
public class TotalAverageMarks {

	public static void main(String a[]) {
		int arr[][] = new int[5][5];
		int total = 0; // Initializing as 0
		int tot = 0;
		int av = 0;
		int avg = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) // Entering the marks of 3 students
		{
			System.out.println("Enter the marks for the student" + (i + 1));

			for (int j = 0; j < 3; j++) // Subjectwie marks input
			{

				arr[i][j] = sc.nextInt(); // Subjectwise marks input of 3 students
			}
		}

		for (int i = 0; i < 3; i++) {
			total = 0;
			avg = 0;
			for (int j = 0; j < 3; j++) {

				total += arr[i][j]; // Finding the total marks

			}
			avg = total / 3;
			System.out.println("\n" + total);

			System.out.println("\n" + avg);
		}

		for (int j = 0; j < 3; j++) // Finding the subject wise total marks
		{
			tot = 0;
			av = 0;
			for (int i = 0; i < 3; i++) {

				tot += arr[i][j];

			}
			av = tot / 3;
			System.out.println("\n" + tot);

			System.out.println("\n" + av);
		}

	}

}
