package com.revature.day3_1;

import java.util.Scanner;

public class Comparator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the array elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("input number to be found");
		int num = sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(num == arr[i])
			{
				System.out.println("found at location : " + i);
				break;
			}
		}
	}
}
