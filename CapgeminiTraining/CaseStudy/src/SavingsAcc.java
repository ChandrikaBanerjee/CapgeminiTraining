
public abstract class SavingsAcc extends BankAcc {
	private static final float MINBAL = 10000;
	private boolean isSalaried;
	private float amount;

	public SavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	public void withdraw(float amount) {
		this.amount = amount;
		if (amount > MINBAL) {
			System.out.println("Error!!!! Sorry");
		} else {

			setAccBal(getAccBal() - amount);

		}
	}

	public String toString() {
		return "SavingsAccount[account No is" + (getAccNo()) + ",account name is" + (getAccNm())
				+ " account balance is " + (getAccBal()) + "]";
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
}
