package com.capgemini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
	public static void main(String args[]) {
//Creating tree set
		Set<String> tl = new TreeSet<String>();
		// Objects are getting added to the tree set
		tl.add("Sukanya");
		tl.add("Ritika");
		tl.add("Moulima");
		tl.add("Pritha");

		System.out.println("The Treeset is printed below:\n");

		for (Object o : tl) { // Printing the tree set
			System.out.println(o + "\n");
		}

	}
}
