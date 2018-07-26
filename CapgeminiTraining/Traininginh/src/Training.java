/*Program to define the public and corporate training by their behaviour implementation*/

abstract public class Training {
	private int id;
	private String subject;
	protected double fees;

	public Training(int id, String subject, double fees) // Parent class constructor
	{
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	abstract double getOrderValue(); // Abstract method whose implementation is done in child classes
}
