/*Program that sets the real and imaginary parts of a complex number and finds the sum of two complex numbers*/
package television2;

public class Complex {
	private float real;
	private float imaginary;

	public void set(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public void disp() {
		System.out.println("The complex number is represented as " + real + " + i" + imaginary);
	}

	public Complex sum(Complex one, Complex two, Complex result) // Here the return type is "Complex"
	{
		result.real = one.real + two.real; // Separately taking real and imaginary parts and then performing addition
		result.imaginary = one.imaginary + two.imaginary;
		return result;
	}

}
