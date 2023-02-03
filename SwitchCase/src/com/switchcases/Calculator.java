package com.switchcases;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter operation want to perform: ");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case '+':
			int sum =num+num2;
			System.out.println("sum: "+sum);
			break;
		case '-':
			System.out.println(num-num2);
			break;

		case '*':
			System.out.println(num*num2);
			break;

		case '/':
			System.out.println(num/num2);
		default:
			System.out.println("Invalid Opeartion");
		}

	}

}
