package day2televisionfunctioning;

import java.util.Scanner;

public class TelevisionTest {

	public static void main(String[] args) {
		Television television = new Television();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice to press number in remote");
			System.out.println("Press 1 to change the status of the TV");
			System.out.println("Press 2 to increase the volume of the TV");
			System.out.println("Press 3 to decrease the volume of the TV");
			System.out.println("Enter 4 to change the channel in TV");
			System.out.println("Enter 5 to exit");
			int choice = sc.nextInt();
			switch (choice) // Using switch case to control the remote acion
			{
			case 1:

				television.statusCheck();
				boolean st = television.getStatusFlag();
				if (st == true)
					System.out.println("The TV is turned ON");

				else
					System.out.println("The TV is turned OFF");
				break;

			case 2:

				television.increaseVolume();
				int ds = television.VolumeDisplay();
				System.out.println("The volume is" + ds);
				break;
			case 3:

				television.decreaseVolume();
				int ds1 = television.VolumeDisplay();
				System.out.println("The volume is" + ds1);
				break;

			case 4:

				System.out.println("Enter the new channel:");
				int newChannel = sc.nextInt();
				television.changeChannel(newChannel);
				System.out.println("The channel is:" + (television.getChannel()));
				break;

			case 5:
				System.exit(0);
			}
		} while (true);
	}

}
