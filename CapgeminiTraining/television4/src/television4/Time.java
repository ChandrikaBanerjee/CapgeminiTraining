/*Program that sets the time in hours and minutes,shows time and adds two sum time object*/
package television4;

public class Time {
	private int hours;
	private int minutes; // Setting properties

	public void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public void showTime() {
		System.out.println("Time is " + hours + "hrs and " + minutes + "mins");
	}

	public Time sum(Time t) {
		Time time = new Time();
		time.hours = this.hours + t.hours; // Passing the Second time object as parameter on the first object we can
											// directly have access on its properties and store the result in it
		time.minutes = this.minutes + t.minutes;
		while (time.minutes >= 60) { // If the time is greater than 60 it is considered as an hour-this logic is used
			time.hours++;
			time.minutes -= 60;
		}

		return time;
	}

}
