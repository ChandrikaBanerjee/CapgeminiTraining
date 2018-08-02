package com.capgemini;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialzation {

	public static void main(String[] args) {
	Employee employee;
	try(FileInputStream fis=new FileInputStream("Employee.txt");
			ObjectInputStream os=new ObjectInputStream(fis))
	{
employee=		(Employee) os.readObject();
System.out.println(employee);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	}

}
