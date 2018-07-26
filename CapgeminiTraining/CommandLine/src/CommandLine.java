
public class CommandLine {
	public static void main(String args[]) {
		double sum = 0; // Initialization
		for (int i = 0; i < args.length; i++) {
			double d = Double.parseDouble(args[i]); // converting to double
			sum = sum + d;
		}
		System.out.println(+sum);
	}
}
