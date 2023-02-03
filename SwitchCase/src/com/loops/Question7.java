package com.loops;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number: ");
		int n = sc.nextInt();
		int sum = 0;
		
		int i=1;
		while(i<=n)
		{
			if(i%2!=0)
			{
				sum = sum+i;
			}
			i++;
		}
		System.out.println("Sum: "+sum);
		

	}

}
