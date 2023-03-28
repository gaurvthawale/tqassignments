package com.nestedloops;

public class Question1 {

	public static void main(String[] args) {
		int cnt=0;
		
		for(int i=5;i>0;i--)
		{
			cnt++;
			for(int j=1;j<cnt;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
		}

	}

}
