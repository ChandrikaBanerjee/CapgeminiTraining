/*Driver program to test the implementation*/
package employee;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Employee ID:");
		int id = sc.nextInt();

		System.out.println("Enter your Employee Name:");
		String name = sc.next();

		System.out.println("Enter your monthly basic:");
		double mb = sc.nextDouble();

		System.out.println("Enter the pf :");
		double pf = sc.nextDouble();

		Employee employee = new Employee();

		employee.setMonthlyBasic(mb); // All required properties are set

		employee.setId(id);

		employee.setName(name);

		double salary = employee.getAnnualBasic();
		System.out.println("Salary is :" + salary);

		double grosssalary = employee.getMonthlyGrossSalary();
		System.out.println("Gross Salary is :" + grosssalary);

		double annualgross = employee.getAnnualGrossSalary();
		System.out.println("Annual Salary is :" + annualgross);

		double deductions = employee.getMonthlyDeductions();
		System.out.println("Deductions is :" + deductions);

		double takehome = employee.getMonthlyTakeHome();
		System.out.println("TakeHome is :" + takehome);

		double take = employee.getAnnualTakeHome();
		System.out.println("Annual Takehome is :" + take);

		employee.setPfRate(pf);
		double p = employee.getPfRate(); // After checking the condition of of we are getting the actual pf rate

	}
}
