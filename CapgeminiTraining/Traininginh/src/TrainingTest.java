/*Driver Test program to observe the implementation*/
public class TrainingTest {

	public static void main(String[] args) {

		Training train = new PublicTraining(100, "Java", 5000.00, 50);

		System.out.println("The cost of Public Training is:" + train.getOrderValue());

		Training tr = new CorporateTraining(200, "Big Data", 35000.00, 4);

		System.out.println("The cost of Public Training is:" + tr.getOrderValue());

	}

}
