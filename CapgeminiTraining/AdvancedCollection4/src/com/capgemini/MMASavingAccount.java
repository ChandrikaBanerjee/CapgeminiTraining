package com.capgemini;

public class MMASavingAccount {
private int accountID;
private String accountHolder_Name;
private double account_Balance;
private boolean isSalaryAccount;
public MMASavingAccount(int accountID, String accountHolder_Name, double account_Balance, boolean isSalaryAccount) {
	super();
	this.accountID = accountID;
	this.accountHolder_Name = accountHolder_Name;
	this.account_Balance = account_Balance;
	this.isSalaryAccount = isSalaryAccount;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "MMASavingAccount [accountID=" + accountID + ", accountHolder_Name=" + accountHolder_Name
			+ ", account_Balance=" + account_Balance + ", isSalaryAccount=" + isSalaryAccount + "]";
}
/**
 * @return the accountID
 */
public int getAccountID() {
	return accountID;
}
/**
 * @return the accountHolder_Name
 */
public String getAccountHolder_Name() {
	return accountHolder_Name;
}
/**
 * @return the account_Balance
 */
public double getAccount_Balance() {
	return account_Balance;
}
/**
 * @return the isSalaryAccount
 */
public boolean isSalaryAccount() {
	return isSalaryAccount;
}


}
