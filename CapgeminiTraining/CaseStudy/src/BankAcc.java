
public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	public BankAcc(int accNo,String accNm,float accBal)
	{
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
		
	}
	public void setAccBal(float accBal)
	{
		this.accBal=accBal;
	}

	public float getAccBal()
	{
return accBal;
	}
	public String getAccNm()
	{
	return accNm;
	}
 public int getAccNo() {
		return accNo;
	}
public void withdraw(float amount)
 {
	
	accBal-=amount;
 }
public void deposit(float amount)
{
	accBal+=amount;
}
public String toString()
{
	return "BankAccount[account No is" + accNo + ",account name is" +accNm+ " account balance is " +accBal +"]";
}

}
