package com.revature.day3;

public class Argument {
	public static void main(String[] args)
	{
		int a = 0;
		try {
			a=Integer.parseInt(args[0]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		int res = a*7;
		System.out.println(res);
	}
}
