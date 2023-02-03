package com.switchcases;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		switch(num)
		{
		case 1:
			
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
		default:
			System.out.println("Invalid number");
		}
	}

}
