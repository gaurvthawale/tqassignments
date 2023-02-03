package com.ifelse;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any alphabet : ");
		char ch = sc.next().charAt(0);
		
		
		if(ch=='a')
		{
			System.out.println(ch+" is vowel..");
		}
		else if(ch=='e')
		{
			System.out.println(ch+" is vowel..");
		}
			else if(ch=='i')
				{
					System.out.println(ch+" is vowel");
				}
				else if(ch=='o')
					{
						System.out.println(ch+" is vowel..");
					}
					else if(ch=='u')
						{
							System.out.println(ch+" is vowel..");
						}
						else
						{
							System.out.println(ch+" is consonant..");
						}
					
		sc.close();

	}

}
