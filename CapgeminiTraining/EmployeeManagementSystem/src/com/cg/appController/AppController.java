package com.cg.appController;

import java.util.ArrayList;

import com.cg.bean.employee.Employee;
import com.cg.dao.EmployeeDAO;
import com.cg.servicelayer.EmployeeService;

public class AppController {
	EmployeeService employeeservice;
	public void addEmployee(Employee employee)
	{
		employeeservice.addEmployee(employee);
	}
	public ArrayList<Employee> viewAllEmployee()
	{
		return employeeservice.viewAllEmployee();
	}
	public void getEmpIdById(int id)
	{
		employeeservice.getEmpIdById(id);
	}
	public void deleteEmpId(int id)
	{
		employeeservice.deleteEmpId(id);
	}

}
