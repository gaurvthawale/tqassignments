package com.loops;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num!=0)
		{
			 int digit = num/10;
			 num=digit;
			count++;
		}
		System.out.println("No of digits in " +num+" is "+count);
		
	}

}
