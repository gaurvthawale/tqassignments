package com.nestedloops;

public class Question2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
