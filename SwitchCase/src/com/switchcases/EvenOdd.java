package com.switchcases;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int rem = num%2;
		
		switch(rem)
		{
			case 0:
				System.out.println(num+" is even.");
				break;
			default :
				System.out.println(num+" is odd.");
		}
		
		sc.close();
		

	}

}
