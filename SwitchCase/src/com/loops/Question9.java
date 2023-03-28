package com.loops;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int product =1;
		
		while(num!=0)
		{
			 int digit = num/10;
			 
			 product = product *(num%10); 
			 num=digit;
			
		}
		System.out.println("Product of digits is "+product);
		
	}

}
