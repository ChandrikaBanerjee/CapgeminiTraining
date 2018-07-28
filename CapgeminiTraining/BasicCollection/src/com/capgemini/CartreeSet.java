package com.capgemini;

import java.util.Set;
import java.util.TreeSet;

public class CartreeSet {
	public static void main(String args[]) {
		// Object creation
		Car car1 = new Car("BMW", "ABC", 2018, 10000.00);
		Car car2 = new Car("i20", "PQR", 2018, 20000.00);
		Car car3 = new Car("i10", "XYZ", 2010, 30000.00);
		Car car4 = new Car("i30", "YZ", 2010, 30000.00);
		// Creating tree set
		Set carset = new TreeSet();
		// Adding the elements to the treeset
		carset.add(car1);
		carset.add(car2);
		carset.add(car3);
		carset.add(car4);
		System.out.println("The Treeset is printed below:\n");
		for (Object o : carset) {
			System.out.println(o + "\n"); // Printing the treeset
		}

	}
}
