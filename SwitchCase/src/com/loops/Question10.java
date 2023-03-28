package com.loops;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int product =1;
		
		int cnt0 = 0;
		int cnt1= 0;
		int cnt2 = 0;
		int cnt3=0;
		int cnt4=0;
		int cnt5 = 0;
		int cnt6= 0;
		int cnt7=0;
		int cnt8 = 0;
		int cnt9 = 0;
		
		while(num!=0)
		{
			 int remnum = num/10;
			 
			int digit =  (num%10); 
			 num=digit;
			
		}
		System.out.println("Product of digits is "+product);
		
	}

}
