/*Program to observe the properties and behaviour of Employee*/
package employee;

public class Employee {
	private int id;
	private String name;

	private double monthlyBasic;

	private static final int medicalallowance = 1250; // static final means it is sharable by all and final represents
														// its value can't be manipulated
	private static final int conveyanceallowance = 800;
	private double pf;
	private double esic;
	private double proftax;
	private double hra;

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualBasic() {
		return (12 * monthlyBasic); // computed annual basic
	}

	double getMonthlyGrossSalary() {

		double hra = (0.5 * monthlyBasic);
		return (monthlyBasic + hra + medicalallowance + conveyanceallowance); // computed monthly gross salary
	}

	public double getAnnualGrossSalary() {
		return (12 * (getMonthlyGrossSalary())); // computed annual gross salary
	}

	public double getMonthlyDeductions() {
		if (monthlyBasic <= 5000)
			esic = 0.0475 * monthlyBasic;
		if (getMonthlyGrossSalary() <= 10000) // Condition for prof tax in terms of gross salary
			proftax = 50;
		else
			proftax = 100;
		return (pf + esic + proftax);
	}

	public double getMonthlyTakeHome() {
		return ((getMonthlyGrossSalary()) - (getMonthlyDeductions())); // computation of monthly take home deducting
																		// monthly deductions
	}

	public double getAnnualTakeHome() {
		return (12 * getMonthlyTakeHome());
	}

	public final double getPfRate() {
		return pf;
	}

	public void setPfRate(double f) {
		f = 0.1 * monthlyBasic; // Condition for setting pf rate
		if (f > 6500.00) {
			f = 6500.00;
		}
		pf = f;
	}

}
