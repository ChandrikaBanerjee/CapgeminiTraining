package basicinterface2;

public class Demo {
	public static void perform(Game g) {    //Upcasting(where refernce type is of parent class type)
		g.play();
	}

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		perform(cricket);  

		Football football = new Football();
		perform(football);

		Tennis tennis = new Tennis();
		perform(tennis);
	}

}
