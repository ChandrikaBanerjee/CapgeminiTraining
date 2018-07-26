/*Program to observe the behaviours and properties of class Rectangle*/
package television1;

public class Rectangle {
	private int length;
	private int breadth;

	public int getLength() { // Gettter and setter methods
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double area(int length, int breadth) // Method to find the area of the rectangle
	{
		this.length = length;
		this.breadth = breadth;
		double area = length * breadth;
		return area;
	}

	public double perimeter(int length, int breadth) // Method to compute the perimeter of the rectangle
	{
		this.length = length;
		this.breadth = breadth;
		double perimeter = (length + breadth) * 2;
		return perimeter;
	}
}
