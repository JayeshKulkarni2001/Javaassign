package com.revature.javapro;

public abstract class Bankaccount {
	private int accountnumber;
	private double balance;
	public Bankaccount(int accountnumber,double balance)
	{
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addmoney(double amount)
	{
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("money deposited"+amount);
		}
		else {
			System.out.println("invalid");
		}
	}
	public void withdraw(double amount)
	{
		if(amount >= balance)
		{
			balance = balance - amount;
			System.out.println("money withdrawl"+amount);
		}
		else {
			System.out.println("invalid");
		}
	}
}
