package com.revature.javapro;

public class Savingsaccount extends Bankaccount implements odlimit {
	private double Rateofinterest;
	public Savingsaccount(int accountnumber, double balance, double rateofinterest) {
		super(accountnumber, balance);
		Rateofinterest = rateofinterest;
	}
	public void addinterest() {
		double interest = getBalance()*Rateofinterest/100;
		addmoney(interest);
	}
	@Override
	public String toString() {
		return "Savingsaccount [getAccountnumber()=" + getAccountnumber() + ", getBalance()=" + getBalance() +"savings"+ "]";
	}
}
