
public class MMBankFactory extends BankFactory {
	public  MMSavingAccount getNewSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried)
	{
		MMSavingAccount mms=new MMSavingAccount(accNo,accNm,accBal,isSalaried);
		return mms;
	}
	public  MMCurrentAccount getNewCurrentAcc(int accNo,String accNm,float accBal,float credLimit)
	{
		MMCurrentAccount mmc=new MMCurrentAccount(accNo,accNm,accBal,credLimit);
		return mmc;
	}
}

