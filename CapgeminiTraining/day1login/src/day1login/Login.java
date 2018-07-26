package day1login;

/*Program explaining the login process of a CUI based application*/
import java.util.Scanner;

public class Login {
	public static void main(String a[]) {
		String login = new String("name");
		String password = new String("password");

		int i, n, c = 0;
		String id, pw;

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			System.out.println("Enter ID:\n");
			id = sc.next();

			System.out.println("Enter PW:\n");
			pw = sc.next();

			if ((id.equals(login)) && (pw.equals(password))) { // If both the login id and password matches then the
																// process welcomes the user
				System.out.println("Welcome");
				break;
			} else
				c++;

			if (c == 3) { // Condition of checking simultaneous 3wrong attempts
				System.out.println("Contact Admin");
				break;
			}
		}
	}

}
