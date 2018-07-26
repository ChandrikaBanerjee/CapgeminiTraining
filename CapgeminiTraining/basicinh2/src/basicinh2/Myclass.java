/*Program to check the presence of static and non static member functions in a class*/
package basicinh2;

public class Myclass {
	public static int i; // Static variable

	public int j; // Non static variable

	public static int change(int i) // Static member function to control the behaviour of static variable
	{
		return i;
	}

	public void set(int j) // Non static function ehich works on non static variable
	{
		this.j = j;
	}

	public int disp() {
		return j;
	}

}
