package com.capgemini;

import java.util.ArrayList;

public class AccountTest {
	public static void main(String args[]) {
		// Object creation
		SavingAccount sa1 = new SavingAccount(50000.00, 100, "Suresh", true);
		SavingAccount sa2 = new SavingAccount(40000.00, 101, "Ramesh", true);
		SavingAccount sa3 = new SavingAccount(60000.00, 102, "Jogesh", false);
		SavingAccount sa4 = new SavingAccount(70000.00, 103, "Hrishikesh", true);
		SavingAccount sa5 = new SavingAccount(80000.00, 104, "Nilesh", false);
//Creating arraylist
		ArrayList<Object> al = new ArrayList<Object>();

		al.add(sa1);
		al.add(sa2);
		al.add(sa3);
		al.add(sa4);
		al.add(sa5);

		for (Object o : al) { // Printing the arraylist elements just by passing the object(using toString
			// method)
			System.out.println(o + "\n");
		}
	}
}