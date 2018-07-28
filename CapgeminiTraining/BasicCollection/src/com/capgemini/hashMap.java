package com.capgemini;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashMap {
	public static void main(String args[]) {

		// Creating hashmap
		HashMap<String, String> hm = new HashMap<String, String>();
		// Object creation
		hm.put("Sukanya", "Banana");
		hm.put("Moulima", "Apple");
		hm.put("Ritika", "Mango");
		hm.put("Pritha", "Jackfruit");
		// Printing the hashmap
		System.out.println("The HashMAp is:\n");
		for (Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// Getting the value using key
		String val = hm.get("Ritika");
		System.out.println("Value for Ritika is: " + val);
		// Printing only the keys
		System.out.println("The KEYS are:");
		for (Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getKey());
		}
		// Printing only the values
		System.out.println("The VALUES  are:");
		for (Entry<String, String> m : hm.entrySet()) {
			System.out.println(m.getValue());
		}
	}

}
