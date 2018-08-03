package com.cg.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.cg.appController.AppController;
import com.cg.bean.employee.Employee;

public class UI {
	List<Employee> list=new ArrayList<Employee>();
	public Employee acceptData() throws IOException {
		do {
			showMenu();
		} while (true);
	}

	public void showMenu() throws IOException {
		System.out.println("Make Your Choice:");
		System.out.println("Press 1 to add an employee");
		System.out.println("Press 2 to display all employees");
		System.out.println("Press 3 to get an employee by its id");
		System.out.println("Press 4 to delete an employee");
		System.out.println("Press 5 to Exit");
		acceptChoice();
	}

	@SuppressWarnings({ "null", "null" })
	public void acceptChoice() throws IOException {
//		AppController appcontroller = null;

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int choice =Integer.parseInt(bufferedReader.readLine());

		switch (choice) {
		case 1:
			AppController appcontroller;
			System.out.println("Enter the employee information");
			System.out.println("Enter employee ID:");
			int id = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter employee Name:");
			String name = bufferedReader.readLine();
			System.out.println("Enter employee Salary:");

			double salary = Double.parseDouble(bufferedReader.readLine());
			Employee emp = new Employee(id, name, salary);
			appcontroller.addEmployee(emp);
			break;
		case 2:
			appcontroller.viewAllEmployee().stream().forEach(System.out::println);

			break;
		case 3:
			System.out.println("Enter employee ID:");
			int id1 = bufferedReader.read();
			appcontroller.getEmpIdById(id1);
			break;
		case 4:
			System.out.println("Enter employee ID:");
			int id2 = bufferedReader.read();
			appcontroller.deleteEmpId(id2);
			break;
		default:
			System.out.println("Nothing!!");
			break;
		}
	}

}
