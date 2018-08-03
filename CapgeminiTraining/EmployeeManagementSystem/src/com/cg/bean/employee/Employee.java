package com.cg.bean.employee;

public class Employee {
private int empId;
private String empName;
private double salary;
public Employee(int empId, String empName, double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
}
/**
 * @return the empId
 */
public int getEmpId() {
	return empId;
}
/**
 * @return the empName
 */
public String getEmpName() {
	return empName;
}
/**
 * @return the designation
 */
public double getSalary() {
	return salary;
}


}
