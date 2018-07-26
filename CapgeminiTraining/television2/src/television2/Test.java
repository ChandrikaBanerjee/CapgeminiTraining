package television2;

public class Test {
	public static void main(String args[]) {
		Complex complex = new Complex();
		complex.set(10.0f, 20.0f);

		Complex complex2 = new Complex();
		complex2.set(20.0f, 50.0f);

		Complex result = new Complex();

		result.sum(complex, complex2, result); // Sum function called and parameters are passed and then displayed all
												// separately
		result.disp();
		complex.disp();
		complex2.disp();
	}

}
