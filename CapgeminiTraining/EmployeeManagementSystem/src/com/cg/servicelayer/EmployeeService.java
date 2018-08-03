package com.cg.servicelayer;

import java.util.ArrayList;

import com.cg.bean.employee.Employee;
import com.cg.dao.EmployeeDAO;

public class EmployeeService {
	EmployeeDAO employeedao;
	public void addEmployee(Employee employee)
	{
		employeedao.addEmployee(employee);
	}
	public ArrayList<Employee> viewAllEmployee()
	{
		return employeedao.viewAllEmployee();
	}
	public void getEmpIdById(int id)
	{
		employeedao.getEmpIdById(id);
	}
	public void deleteEmpId(int id)
	{
		employeedao.deleteEmpId(id);
	}
}
