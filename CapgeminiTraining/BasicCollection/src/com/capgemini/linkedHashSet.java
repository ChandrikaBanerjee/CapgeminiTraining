package com.capgemini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class linkedHashSet {
	public static void main(String args[]) {

		// Creating Linkedhashset
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		// Objects are getting added to the linkedhashset
		al.add("Sukanya");
		al.add("Ritika");
		al.add("Moulima");
		al.add("Pritha");

		System.out.println("The LinkedHashSet is printed below:\n");

		for (Object o : al) { // Prints the linkedhashset
			System.out.println(o + "\n");
		}

	}
}
