/*Implementation of Corporate Training*/
public class CorporateTraining extends Training {
	int days;

	public CorporateTraining(int id, String subject, double fees, int days) {
		super(id, subject, fees); // Parent class constructor invoked explicitly
		this.days = days;
	}

	double getOrderValue() // Logic to get corporate training value
	{
		return (fees * days);
	}

}
