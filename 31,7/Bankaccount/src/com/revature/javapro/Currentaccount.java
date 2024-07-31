package com.revature.javapro;

public class Currentaccount extends Bankaccount implements odlimit {
	public Currentaccount(int accountnumber, double balance) {
		super(accountnumber, balance);
	}
	int odlimit;

	@Override
	public void displayod() {
			odlimit=25000;
	}
	@Override
	public String toString() {
		return "Currentaccount [getAccountnumber()=" + getAccountnumber() + ", getBalance()=" + getBalance() +"current account"+"]";
	}

}
