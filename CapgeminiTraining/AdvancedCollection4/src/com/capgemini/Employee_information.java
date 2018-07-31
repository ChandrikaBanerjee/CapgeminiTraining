package com.capgemini;

public class Employee_information {
private int emp_ID;
private String emp_Name;
private String emp_Designation;
private double emp_Salary;
private String emp_comm;
public Employee_information(int emp_ID, String emp_Name, String emp_Designation, double emp_Salary, String emp_comm) {
	super();
	this.emp_ID = emp_ID;
	this.emp_Name = emp_Name;
	this.emp_Designation = emp_Designation;
	this.emp_Salary = emp_Salary;
	this.emp_comm = emp_comm;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee_information [emp_ID=" + emp_ID + ", emp_Name=" + emp_Name + ", emp_Designation=" + emp_Designation
			+ ", emp_Salary=" + emp_Salary + ", emp_comm=" + emp_comm + "]";
}
/**
 * @return the emp_ID
 */
public int getEmp_ID() {
	return emp_ID;
}
/**
 * @return the emp_Name
 */
public String getEmp_Name() {
	return emp_Name;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((emp_Designation == null) ? 0 : emp_Designation.hashCode());
	result = prime * result + emp_ID;
	result = prime * result + ((emp_Name == null) ? 0 : emp_Name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(emp_Salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((emp_comm == null) ? 0 : emp_comm.hashCode());
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee_information other = (Employee_information) obj;
	if (emp_Designation == null) {
		if (other.emp_Designation != null)
			return false;
	} else if (!emp_Designation.equals(other.emp_Designation))
		return false;
	if (emp_ID != other.emp_ID)
		return false;
	if (emp_Name == null) {
		if (other.emp_Name != null)
			return false;
	} else if (!emp_Name.equals(other.emp_Name))
		return false;
	if (Double.doubleToLongBits(emp_Salary) != Double.doubleToLongBits(other.emp_Salary))
		return false;
	if (emp_comm == null) {
		if (other.emp_comm != null)
			return false;
	} else if (!emp_comm.equals(other.emp_comm))
		return false;
	return true;
}
/**
 * @return the emp_Designation
 */
public String getEmp_Designation() {
	return emp_Designation;
}
/**
 * @return the emp_Salary
 */
public double getEmp_Salary() {
	return emp_Salary;
}
/**
 * @return the emp_com
 */
public String getEmp_comm() {
	return emp_comm;
}

}
