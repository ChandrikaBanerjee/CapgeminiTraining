package basicinh2;

import java.util.Scanner;

public class Test {
	static int i = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter j:");
		int j = sc.nextInt();

		Myclass c = new Myclass(); // Object creation
		
		c.set(j);               //Non staic members can only be accessed using object
		
		System.out.println(Myclass.change(i));     //Static member can be accessed using className only
		System.out.println(c.disp());

	}

}
