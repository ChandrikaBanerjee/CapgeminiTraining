/*Main for Time Class*/
/*Driver program to test the implementation*/
package television4;

public class Test {

	public static void main(String[] args) {

		Time t = new Time();
		Time t1 = new Time();
		Time tres = new Time();

		t.setTime(5, 5);
		t1.setTime(10, 10);
		
		tres = t.sum(t1); //Calling the sum method
		
		tres.showTime();
		t.showTime();
		t1.showTime();
	}

}
