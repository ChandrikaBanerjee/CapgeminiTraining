/*Main for the rectangle class*/
package television1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the properties of a rectangle:");

		int length = sc.nextInt();
		int breadth = sc.nextInt();

		rectangle.setLength(length); // Calling the set methods to set the values
		rectangle.setBreadth(breadth);

		double obarea = rectangle.area(length, breadth); // Calling the area and perimeter methods of the class to get
															// the desired values
		double obperimeter = rectangle.perimeter(length, breadth);

		;
		System.out.println("The area of the rectangle of sides " + rectangle.getLength() + " and "
				+ rectangle.getBreadth() + " is" + obarea);
		System.out.println("The periemter of the rectangle of sides " + rectangle.getLength() + " and "
				+ rectangle.getBreadth() + " is" + obperimeter);
	}

}
