package com.ifelse;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("enetr the operation to perform : ");
		char oper = sc.next().charAt(0);
		
		if(oper=='+')
		{
			int add = num1+num2;
			System.out.println("Addition is : "+add);
		}
		else if(oper=='-')
			{
				int sub = num1-num2;
				System.out.println("Subtraction is: "+sub);
			}
			else if(oper=='/')
				{
					float div = num1/num2;
					System.out.println("Division is : "+div);
				}
				else if(oper=='*')
				 	{
						int mult = num1*num2;
						System.out.println("Multipication is: "+mult);
				 	}
					else
					{
						System.out.println("Not Valid Operation..");
					}
		sc.close();
	}
		

}
