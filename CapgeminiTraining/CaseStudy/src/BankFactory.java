
public abstract class BankFactory {
public abstract SavingsAcc getNewSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried);
public abstract CurrentAcc getNewCurrentAcc(int accNo,String accNm,float accBal,float credLimit);
}
