/*Class Saving Account*/
package com.capgemini;

import java.awt.image.AreaAveragingScaleFilter;

public class SavingAccount implements Comparable<SavingAccount> {
	private double acc_Balance;
	private int acc_ID;
	private String accountHolderName;
	private boolean isSalaryAcoount;

	public double getAcc_Balance() {
		return acc_Balance;
	}

	public SavingAccount(double acc_Balance, int acc_ID, String accountHolderName, boolean isSalaryAcoount) {
		super();
		this.acc_Balance = acc_Balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAcoount = isSalaryAcoount;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public boolean isSalaryAcoount() {
		return isSalaryAcoount;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_Balance=" + acc_Balance + ", acc_ID=" + acc_ID + ", accountHolderName="
				+ accountHolderName + ", isSalaryAcoount=" + isSalaryAcoount + "]";
	}

	public void deposit(double amount) {
		this.acc_Balance += amount;
	}

	public void withdraw(double amount) {
		this.acc_Balance -= amount;
	}

	@Override
	public int compareTo(SavingAccount arg0) { // For sorting this method is used
		return this.acc_ID - arg0.acc_ID;

	}

}
