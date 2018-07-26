package basicinterface1;

public class Child extends Parent1 implements Parent2 { // Child class extends from parent class and implements from an interface
	public void display() {
		
		super.display1();
		System.out.println("Child");
	}

}
