/*Program that sets the value as feet and inches and then adds two distances*/
package televisiondistance;

public class Distance {
	private int feet;
	private float inches;

	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public void disp() {
		System.out.println("Distance is represented as " + feet + "ft and " + inches + "inch");

	}

//The return type must be a distance.User define class
	public Distance add(Distance d) // Add method performs addition on feet and inches respectively and then it is
									// being printed together
	{
		Distance distance = new Distance();
		distance.feet = this.feet + d.feet;
		distance.inches = this.inches + d.inches;

		return distance;
	}

}
