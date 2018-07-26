package basictxt5;

public class Polygon extends Shape {

	void draw()    // "Abstract" behaviour observation which is being overridden in all the classes
	{
		System.out.println("The polygon is drawn");
	}
}
