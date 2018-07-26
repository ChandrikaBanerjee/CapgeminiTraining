/*Main for the class Distance*/
package televisiondistance;

public class Test {

	public static void main(String[] args) {

		Distance d = new Distance();
		Distance d1 = new Distance();
		Distance res = new Distance();

		d.set(5, 5.0f);
		d1.set(10, 10.0f);

		res = d.add(d1); // Here we are using d. because in this way we can have access on its properties
							// and thus using that object and passing another distance object as parameter
							// our requirement is fulfilled

		d.disp();
		d1.disp();
		res.disp();
	}

}
