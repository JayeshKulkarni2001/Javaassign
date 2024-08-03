package com.revature.day3;
import java.util.Scanner;
public class Person {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Personvalidate pv = new Personvalidate();
	try {
		System.out.println("Starting try  block");
		System.out.println("enter age");
		int age = sc.nextInt();
		pv.Checkperson(age);
		System.out.println("Ending try block");
	}
	catch(InvalidAgeException e)
	{
		System.out.println("Starting catch block");
		e.getMessage();
	}
	catch(NotEligibleException e)
	{
		e.getMessage();
	}
	finally {
		System.out.println("goodbye");
	}
	sc.close();
	}
}
