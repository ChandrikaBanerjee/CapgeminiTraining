/*Program to observe the different behaviours of a vehicle*/
package day3vehicle;

public class Vehicle {
	private int currentspeed;
	private int currentdirection;
	private String ownername;
	protected static int highestVehicleIdentificationNumber = 1111;
	private int vehicleId;
	protected static final int TURN_LEFT = 0;
	protected static final int TURN_RIGHT = 1;

	public Vehicle() { // Default constructor
		vehicleId = highestVehicleIdentificationNumber;
		highestVehicleIdentificationNumber++;
		this.ownername = "Undef";
	}

	public Vehicle(String ownername) {
		this();
		this.ownername = ownername;
	}

	public void setCurrentspeed(int currentspeed) {
		this.currentspeed = currentspeed;
	}

	public void setCurrentdirection(int currentdirection) {
		this.currentdirection = currentdirection; // Condition for setting current direction
		if (this.currentdirection < 0)
			this.currentdirection += 360;
		this.currentdirection %= 360;
	}

	public int getCurrentspeed() {
		return currentspeed;
	}

	public int getCurrentdirection() {
		return currentdirection;
	}

	public String getOwnername() {
		return ownername;
	}

	public static int getHighestVehicleIdentificationNumber() {
		return highestVehicleIdentificationNumber;
	}

	public int getVehicleId() { // Set and get methods
		return vehicleId;
	}

	public void changeSpeed(int newSpeed) { // Method to change the current speed
		currentspeed = newSpeed;
	}

	public void stopSpeed() { // Method to make the speed zero
		this.currentspeed = 0;
	}

	public void turnleftorright(int constant) { // Condition for turning right or left
		setCurrentdirection(
				(constant == 0) ? ((this.currentdirection - 90) % 360) : ((this.currentdirection + 90) % 360));
	}

	public String toString() {
		return "Vehicle[currentspeed=" + currentspeed + ", currentdirection=" + currentdirection + ",ownername="
				+ ownername + ", vehicleId=" + vehicleId + "]";
	}

	
}
