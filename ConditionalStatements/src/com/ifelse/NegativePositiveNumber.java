package com.ifelse;

import java.util.Scanner;

public class NegativePositiveNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		float num = sc.nextFloat();
		
		if(num>0)
		{
			System.out.println(num+" is positive number..");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number..");
		}
			else
			{
				System.out.println(num+" is zero..");
			}
		sc.close();
	}

}
