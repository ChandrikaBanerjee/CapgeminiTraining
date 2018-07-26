/*Program to create the child class*/
package basicinh1;

public class Second extends First { // Performing Inheritance
	int second;
	static int first;

	Second(int second) {
		super(first); // Exlicitly invoking parent class constructor using super keyword
		this.second = second;
		System.out.println("Second");
	}

	public void display() // @Override
	{
		System.out.println("Method of Second");
	}
}
