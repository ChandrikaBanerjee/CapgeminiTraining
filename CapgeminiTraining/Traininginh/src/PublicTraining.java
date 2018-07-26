/*Implementation of Public Training*/
public class PublicTraining extends Training {
	int participants;

	public PublicTraining(int id, String subject, double fees, int participants) {
		super(id, subject, fees); // Parent class constructor invoked explicitly
		this.participants = participants;
	}

	double getOrderValue() // Logic to get public training value
	{
		return (fees * participants);
	}

}
