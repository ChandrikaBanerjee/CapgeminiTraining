package com.capgemini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection1test {
	public static void main(String args[]) {
		Laptop laptop1 = new Laptop("HP", "ABC", "W8", "Intel");
		Laptop laptop2 = new Laptop("ASUS", "PQR", "W7", "Intel");
		Laptop laptop3 = new Laptop("DELL", "XYZ", "W10", "Intel");
		Laptop laptop4 = new Laptop("HP", "ABC", "W8", "Intel");
		List list = new ArrayList();
		
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		
		Car car1 = new Car("BMW", "ABC", 2018, 10000.00);
		Car car2 = new Car("i20", "PQR", 2017, 20000.00);
		Car car3 = new Car("i10", "XYZ", 2010, 30000.00);
		Car car4 = new Car("i10", "XYZ", 2010, 30000.00);
		List listcar = new ArrayList();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		
		Television tv1 = new Television("Philips", "LCD", true, 20000.00);
		Television tv2 = new Television("LG", "LED", false, 50000.00);
		Television tv3 = new Television("Samsung", "Plasma", true, 30000.00);
		Television tv4 = new Television("Samsung", "Plasma", true, 30000.00);
		List listtv = new ArrayList();
		list.add(tv1);
		list.add(tv2);
		list.add(tv3);
		
		CellPhone ph1 = new CellPhone("Mi", "123", "Good", "ABC", 10000.00);
		CellPhone ph2 = new CellPhone("Samsung", "456", "Excellent", "PQR", 30000.00);
		CellPhone ph3 = new CellPhone("Asus", "789", "Nice", "XYZ", 20000.00);
		CellPhone ph4= new CellPhone("Asus", "789", "Nice", "XYZ", 20000.00);
		List listph = new ArrayList();
		list.add(ph1);
		list.add(ph2);
		list.add(ph3);
		School school1 = new School("ABC", "Kolkata", "MNO", 1);
		School school2 = new School("PQR", "Mumbai", "111", 2);
		School school3 = new School("XYZ", "Delhi", "333", 3);
		School school4 = new School("XYZ", "Delhi", "333", 3);
		
		List listschool = new ArrayList();
		list.add(school1);
		list.add(school2);
		list.add(school3);
		
		Set set=new HashSet();
		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		set.add(tv1);
		set.add(tv2);
		set.add(tv3);
		set.add(tv4);
		set.add(ph1);
		set.add(ph2);
		set.add(ph3);
		set.add(ph4);
		set.add(school1);
		set.add(school2);
		set.add(school3);
		set.add(school4);
		
		
		for(Object o : list)
		{
			System.out.println(o);
		}
	}

}
