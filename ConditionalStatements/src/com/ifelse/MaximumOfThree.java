package com.ifelse;

import java.util.Scanner;

public class MaximumOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers to check maximum: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is maximum..");
			}
			else
			{
				
				if(num2>num3)
				{
					System.out.println(num2+" is maximum..");
				}
				else
				{
					System.out.println(num3+" is maximum..");
				}
			}
		}
		
		sc.close();

	}

}
