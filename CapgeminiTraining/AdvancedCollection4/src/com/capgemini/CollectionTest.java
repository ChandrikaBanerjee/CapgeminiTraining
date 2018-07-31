package com.capgemini;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionTest {
	public static void main(String args[]) {

		Employee_information emp1 = new Employee_information(100, "Sam", "Manager", 80000.00, "A");
		Employee_information emp2 = new Employee_information(101, "Ram", "Producer", 70000.00, "B");
		Employee_information emp3 = new Employee_information(105, "Jim", "Director", 60000.00, "C");
		Employee_information emp4 = new Employee_information(104, "Rim", "Actor", 50000.00, "D");
		Employee_information emp5 = new Employee_information(106, "Pom", "Trainer", 40000.00, "E");

		MMASavingAccount mmac1 = new MMASavingAccount(1000, "Sam", 80000.00, true);
		MMASavingAccount mmac2 = new MMASavingAccount(1001, "Ram", 10000.00, true);
		MMASavingAccount mmac3 = new MMASavingAccount(1999, "Jim", 80000.00, false);
		MMASavingAccount mmac4 = new MMASavingAccount(1004, "Rim", 20000.00, false);
		MMASavingAccount mmac5 = new MMASavingAccount(1006, "Pom", 40000.00, true);

		HashMap<Employee_information, MMASavingAccount> hashmap = new HashMap<>(); 
		hashmap.put(emp1, mmac1);
		hashmap.put(emp2, mmac2);
		hashmap.put(emp3, mmac3);
		hashmap.put(emp4, mmac4);
		hashmap.put(emp5, mmac5);
		
		Set<Entry<Employee_information, MMASavingAccount>> set = hashmap.entrySet();
		set.stream().forEach((element) -> System.out.println("\n"+element.getValue() + " " + element.getKey()));
	}

}