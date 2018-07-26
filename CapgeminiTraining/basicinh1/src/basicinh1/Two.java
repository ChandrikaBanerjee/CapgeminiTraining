
package basicinh1;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first and second");
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		First f = new First(first);      //Object of first class is created
		Second s = new Second(second);   //Object of child class
		
		f.display();                     //Display method called of the parent class
		s.display();                        //Display method called of the child class which overrides
	}

}
