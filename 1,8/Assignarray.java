package com.revature.day3_1;
import java.util.Scanner;
public class Assignarray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the array elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("displaying array elements");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
