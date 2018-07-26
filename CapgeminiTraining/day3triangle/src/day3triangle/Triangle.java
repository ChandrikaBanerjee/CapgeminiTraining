/*Program to observe the properties and implementation of the behaviour of a triangle*/
package day3triangle;

public class Triangle {
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	public boolean isRight() // Condition for checking right angled triangle->a^2+b^=c^2
	{

		if ((Math.pow(side1, 2)) == ((Math.pow(side2, 2)) + (Math.pow(side3, 2))))
			return true;

		else if ((Math.pow(side2, 2)) == ((Math.pow(side1, 2)) + (Math.pow(side3, 2))))
			return true;
		else if ((Math.pow(side3, 2)) == ((Math.pow(side1, 2)) + (Math.pow(side2, 2))))
			return true;

		else
			return false;
	}

	public boolean isEquilateral() // Checks if equilateral or not
	{
		if ((side1 == side2) && (side2 == side3) && (side1 == side3))
			return true;
		else
			return false;
	}

	public boolean isIsosceles() // Checks if contains two sides equal or not
	{
		if ((side1 == side2) && (side2 != side3))
			return true;
		if ((side2 == side3) && (side1 != side3))
			return true;
		if ((side1 == side3) && (side2 != side1))
			return true;
		else
			return false;
	}

	public boolean isScalene() // Checks if all three sides are unequal or not
	{
		if ((side1 != side2) && (side2 != side3) && (side1 != side3))
			return true;
		else
			return false;
	}

	public int getSide1() {
		return side1;
	}

	public int getSide2() {
		return side2;
	}

	public int getSide3() { // Getting sides
		return side3;
	}
}
