package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.employee.Employee;
import com.cg.ui.UI;

public class EmployeeDAO {
List<Employee> list=new ArrayList<Employee>();
Employee emp;
public void addEmployee(Employee employee)
{
	list.add(emp);
}
public ArrayList<Employee> viewAllEmployee()
{
	return (ArrayList<Employee>) list;
}
public Employee getEmpIdById(int id)
{
	for(Employee emp:list)
	{
		if(id==(emp.getEmpId()))
		{
			return emp;
		}
			
			
	}
	return null;
}
public void deleteEmpId(int id)
{
	for(Employee emp:list)
	{
		if(id==(emp.getEmpId()))
		{
	list.remove(id);
			break;
		}
}
}
}
