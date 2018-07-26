package day3vehicle;

import day3vehicle.Vehicle;
import java.util.Scanner;

public class VehicleTest {
	public static void main(String args[]) {
		Vehicle vehicle1 = new Vehicle();

		Vehicle vehicle2 = new Vehicle();

		Vehicle vehicle3 = new Vehicle("Nilesh");

		vehicle3.setCurrentspeed(80);

		vehicle3.setCurrentdirection(180);

		vehicle3.setCurrentdirection(180);

		vehicle3.turnleftorright(Vehicle.TURN_RIGHT);

		vehicle3.setCurrentdirection(180);

		vehicle3.setCurrentdirection(180);

		vehicle3.turnleftorright(Vehicle.TURN_LEFT);

		System.out.println("The highest vehicle serial number is " + Vehicle.getHighestVehicleIdentificationNumber());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new speed:");
		vehicle2.changeSpeed(sc.nextInt());
		vehicle2.stopSpeed();

		System.out.println("The current of all are:");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(vehicle3);

	}
}
