/*Program to describe the behaviour of a television*/
package day2televisionfunctioning;

public class Television {
	private String state;
	private int currentVolume;
	private int currentChannel;

	private int statusflag; // Definin properties of a television

	public void statusCheck() {
		if (statusflag == 0) {
			statusflag = 1;
		} // It checks the status and sets flag
		else {
			statusflag = 0;
		}
	}

	public boolean getStatusFlag() {
		if (statusflag == 1) // Depending on the flag it describes whether the television is in on state or
								// in off state
			return true;
		else
			return false;
	}

	public void increaseVolume() {

		currentVolume += 1; // method to increase the volume of TV

	}

	public int VolumeDisplay() {

		return currentVolume; // Dispalys the current volume
	}

	public void decreaseVolume() {

		currentVolume -= 1; // method to decrease the volume of TV

	}

	public void changeChannel(int newChannel) {
		currentChannel = newChannel; // Setting the new channel to the current channel
	}

	public int getChannel() {
		return currentChannel;
	}
}
