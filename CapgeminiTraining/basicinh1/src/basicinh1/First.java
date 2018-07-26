/*Program to create the parent class*/
package basicinh1;

public class First {
	int first;

	First(int first) { // Constructor of the parent class which is being invoked in the child classes
		this.first = first;
		System.out.println("First");
	}

	public void display() // Display method which is being overridden in the child classes
	{
		System.out.println("Method of First");
	}

	public int getFirst() {
		return first;
	}
}
