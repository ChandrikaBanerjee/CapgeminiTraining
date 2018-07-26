/*Program to calculate the price of an item after giving a discount*/
package day2discount;

import java.util.Scanner;

public class Discount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of the item:");
		double val = sc.nextDouble();

		System.out.print("Enter the discount %:");
		int discount = sc.nextInt();

		double newItem;
		newItem = (discount * val) / 100; // Evaluating discount
		double newItemPrice = val - newItem; // Evaluating Selling price after applying discount
		System.out.println("The selling price of the item is Rs. " + newItemPrice);
	}

}
