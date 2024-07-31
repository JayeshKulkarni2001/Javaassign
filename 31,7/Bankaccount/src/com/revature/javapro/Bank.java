package com.revature.javapro;

public class Bank {
	public static void main(String[] args)
	{
	Savingsaccount s1=new Savingsaccount(22103,10000.0,4.0);
	Currentaccount c1=new Currentaccount(21345,20000);
	s1.addmoney(500.0);
	System.out.println(s1.toString());
	c1.addmoney(4000.0);
	System.out.println(c1.toString());
	}
}
