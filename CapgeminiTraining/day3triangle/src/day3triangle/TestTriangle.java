/*Driver program to check the implementation*/
package day3triangle;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String args[]) {
		int side1, side2, side3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the thtree sides of a triangle:");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		side3 = sc.nextInt();

		Triangle triangle = new Triangle(side1, side2, side3);

		int t1 = triangle.getSide1();
		int t2 = triangle.getSide2();
		int t3 = triangle.getSide3();
		if (triangle.isRight()) // invoking the method one by one
			System.out.println("It is Right angled triangle");
		if (triangle.isScalene())
			System.out.println("It is Scalene triangle");
		if (triangle.isIsosceles())
			System.out.println("It is Isosceles triangle");
		if (triangle.isEquilateral())
			System.out.println("It is Equilateral angled triangle");

	}

}
