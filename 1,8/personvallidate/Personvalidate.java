package com.revature.day3;

public class Personvalidate {
	public void Checkperson (int age) throws InvalidAgeException,NotEligibleException{
		if( age<=0 || age>150 )
		{
			throw new InvalidAgeException();
		}
		else if(age<18)
		{
			throw new NotEligibleException();
		}
		else {
			System.out.println("Eligible");
		}
	}
}
