package com.capgemini;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	public static void main(String args[]) {
		// Object creation
		SavingAccount sa4 = new SavingAccount(70000.00, 103, "Hrishikesh", true);
		SavingAccount sa2 = new SavingAccount(40000.00, 101, "Ramesh", true);
		SavingAccount sa1 = new SavingAccount(50000.00, 100, "Suresh", true);
		SavingAccount sa3 = new SavingAccount(60000.00, 102, "Jogesh", false);
		SavingAccount sa5 = new SavingAccount(80000.00, 104, "Nilesh", false);

		System.out.println("The Treeset is printed below:\n");
		// Creating treeset for sorting the elements
		Set<Object> tl = new TreeSet<Object>();
		tl.add(sa1);
		tl.add(sa2);
		tl.add(sa3);
		tl.add(sa4);
		tl.add(sa5);

		for (Object o : tl) { // Printing the tree set
			System.out.println(o + "\n");
		}
	}
}