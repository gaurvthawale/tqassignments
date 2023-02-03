package com.ifelse;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check divisibility by 5 and 11: ");
		int num = sc.nextInt();
		
		if(num%5==0)
		{
			if(num%11==0)
			{
				System.out.println(num+" is divisble by 5 and 11");
			}
			else
			{
				System.out.println(num+" is not divisible by 11");
			}
		}
		else
		{
			System.out.println(num+" is not divisible by 5");
		}
		sc.close();

	}

}
